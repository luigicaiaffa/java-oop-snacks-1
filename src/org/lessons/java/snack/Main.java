package org.lessons.java.snack;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // # Snack 1
        Student student1 = new Student("Mario", "Rossi", 25);
        Student student2 = new Student("Pippo", "Bianchi", 22);
        Student student3 = new Student("Caio", "Gialli", 19);
        Student student4 = new Student("Andrea", "Verdi", 32);
        Student student5 = new Student("Paolo", "Paolini", 21);

        System.out.println("--------");
        student1.getStudent();

        // # Snack 2
        ContoBancario contoBancario = new ContoBancario("0123456789");

        System.out.println("--------");
        contoBancario.getSaldo();

        contoBancario.deposita(new BigDecimal("100.00"));
        contoBancario.getSaldo();

        contoBancario.preleva(new BigDecimal("20.00"));
        contoBancario.getSaldo();

        // # Snack 3

        RegistroStudenti registroStudenti = new RegistroStudenti();

        System.out.println("--------");
        registroStudenti.addStudent(student1);
        registroStudenti.addStudent(student2);
        registroStudenti.addStudent(student3);
        registroStudenti.addStudent(student4);
        registroStudenti.addStudent(student5);
        registroStudenti.getStudents();
        System.out.println("--------");

    }
}
