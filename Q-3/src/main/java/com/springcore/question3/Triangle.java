package com.springcore.question3;
import org.springframework.stereotype.Component;

@Component
public class Triangle {
    private int base;
    private int height;

    public Triangle() {
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
