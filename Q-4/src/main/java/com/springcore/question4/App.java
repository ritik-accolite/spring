package com.springcore.question4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Question 4");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Triangle triangle = context.getBean(Triangle.class);
        triangle.setName("Right Angle Triangle");
        triangle.draw();
        context.close();
    }
}
