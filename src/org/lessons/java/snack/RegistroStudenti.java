package org.lessons.java.snack;

public class RegistroStudenti {

    // # Variabili di istanza
    private Student[] students;

    // # Costruttore
    public RegistroStudenti() {
        this.students = new Student[0];
    }

    // # Metodi
    public void addStudent(Student student) {
        // Creo un nuovo array di studenti più capiente di 1 (in java non posso
        // modificare capienza array)
        Student[] newStudents = new Student[this.students.length + 1];

        // Copio gli studenti nell'array più capiente
        for (int i = 0; i < this.students.length; i++) {
            newStudents[i] = this.students[i];
        }

        // Aggiungo lo studente all'ultimo posto dell'array
        newStudents[newStudents.length - 1] = student;

        // Sostituisco il vecchio array con quello nuovo
        this.students = newStudents;
    }

    public void getStudents() {
        System.out.println("Lista studenti: ");
        for (int i = 0; i < this.students.length; i++) {
            this.students[i].getStudent();
        }
    }

}
