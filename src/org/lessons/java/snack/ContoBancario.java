package org.lessons.java.snack;

import java.math.BigDecimal;

public class ContoBancario {

    // # Variabili di istanza
    private String numeroConto;
    private BigDecimal saldo;

    // # Costruttore
    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = new BigDecimal("0.00");
    }

    // # Metodi
    public void getSaldo() {
        System.out.println("Conto: " + this.numeroConto);
        System.out.println("Il tuo saldo: " + this.saldo);
    }

    public void deposita(BigDecimal importo) {
        this.saldo = this.saldo.add(importo);
        System.out.println("Deposito effettuato con successo");
    }

    public void preleva(BigDecimal importo) {
        this.saldo = this.saldo.subtract(importo);
        System.out.println("Prelievo effettuato con successo");

    }
}
