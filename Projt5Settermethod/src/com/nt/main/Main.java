package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Student;

public class Main {
    public static void main(String[] args) {
        // Specify the Spring configuration file location
        String configFileLoc = "com/nt/res/ApplicationContext.xml";

        // Load the Spring context
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configFileLoc)) {
            // Retrieve the Student bean
            Student std = (Student) context.getBean("StdId");

            // Display student details
            std.display();
        } // The context will automatically close here due to try-with-resources
    }
}
