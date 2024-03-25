package com.springcore.question4;

import java.util.Random;

public class Triangle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void draw() {
		System.out.println("Drawing triangle: " + name);
		Random random = new Random();
        int delay = random.nextInt(100);
        try {
        	System.out.println("Delay added : "+delay+ " ms");
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
