package org.lessons.java.snack;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // # Snack 1
        Student student = new Student("Mario", "Rossi", 25);

        System.out.println("--------");
        student.getStudent();

        // # Snack 2
        ContoBancario contoBancario = new ContoBancario("0123456789");

        System.out.println("--------");
        contoBancario.getSaldo();

        contoBancario.deposita(new BigDecimal("100.00"));
        contoBancario.getSaldo();

        contoBancario.preleva(new BigDecimal("20.00"));
        contoBancario.getSaldo();
    }
}
