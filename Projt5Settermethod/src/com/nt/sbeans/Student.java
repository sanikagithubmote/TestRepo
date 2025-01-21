package com.nt.sbeans;

public class Student {
    private String name;
    private int rollno;
    private Address address; // Change from String to Address

    // Constructor
    public Student(String name, int rollno, Address address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Address: " + address); // Calls Address's toString() method
    }
}
