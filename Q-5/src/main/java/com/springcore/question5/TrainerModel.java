package com.springcore.question5;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainerModel {
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/TrainerDatabase", "root", "root");
    }

    public List<Trainer> getAllTrainersWithSessions() {
        List<Trainer> trainers = new ArrayList<>();
        Map<Integer, Trainer> trainerMap = new HashMap<>();

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {

            String query = "SELECT t.trainer_id, t.name AS trainer_name, " +
                    "s.session_id, s.name AS session_name " +
                    "FROM trainer t LEFT JOIN session s ON t.trainer_id = s.trainer_id";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int trainerId = rs.getInt("trainer_id");
                String trainerName = rs.getString("trainer_name");
                int sessionId = rs.getInt("session_id");
                String sessionName = rs.getString("session_name");

                Trainer trainer;
                if (!trainerMap.containsKey(trainerId)) {
                    trainer = new Trainer(trainerId, trainerName);
                    trainers.add(trainer);
                    trainerMap.put(trainerId, trainer);
                } else {
                    trainer = trainerMap.get(trainerId);
                }

                if (sessionId != 0) {
                    Session session = new Session(sessionId, sessionName);
                    trainer.getSessions().add(session);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return trainers;
    }
}
