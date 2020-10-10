package com.example.constructor;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

//    Construtor (não possui tipagem e usa o mesmo nome da classe)
    public ContaBancaria(){
//    Serve para configurar metodos da classe..
        System.out.println("Configurações Iniciais!");
    }

//    Sobrecarga de construtores parametros tem que ser diferente.
//    nao sendo construtor padrao funciona so se tiver c/ parametro
    public ContaBancaria(int nConta){
        this.numeroConta = nConta;
//        System.out.println("Construtor Chamado!" + nConta);
    }
}
