package org.lessons.java.snack;

public class Student {

    // # Variabili di istanza
    private String name;
    private String surname;
    private int age;

    // # Costruttore
    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // # Metodi
    public void getStudent() {
        System.out.println("Studente: " + this.name + " " + this.surname + ", " + this.age + " anni");
    }
}
