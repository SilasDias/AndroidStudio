package com.example.modificadores;

/*
* MODIFICADORES DE ACESSO
* 1) Public -> todas as classes terão acesso
* 2) Private -> apenas pode ser acessado de dentro da classe
* 3) Protected -> pode ser acessado estando dentro do mesmo pacote e/ou subclasses
*    mais usado no caso de herança
* 4) Default - > caso não tenha sido definido nenhum modificador, permitindo
*  o acesso dentro do pacote
*  */

public class Conta {

     private int numeroConta;
     private double saldo = 100;

    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }

    public void sacar(double valorSaque){
        this.saldo -= valorSaque;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
