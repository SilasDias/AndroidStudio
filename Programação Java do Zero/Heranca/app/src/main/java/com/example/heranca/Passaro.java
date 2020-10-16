package com.example.heranca;

public class Passaro extends Animal {

    public void voar(){
        System.out.println("Voar como um passaro!");
    }

    public void correr(){
        super.correr();
        System.out.println("passaro !");
    }
}
