package com.springcore.question1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Question 1");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        MyClass myClass = context.getBean("myClass", MyClass.class);
        myClass.printMap();
    }
}
