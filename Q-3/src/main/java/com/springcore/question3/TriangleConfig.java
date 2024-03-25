package com.springcore.question3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springcore.question3")
public class TriangleConfig{
	@Bean
    public Triangle triangle() {
        return new Triangle(5, 10);
    }
}