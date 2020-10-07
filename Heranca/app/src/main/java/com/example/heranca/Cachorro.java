package com.example.heranca;

public class Cachorro extends Animal {

    public void  latir(){
        System.out.println("Latir como um cachorro");
    }

//    Sobreescrevendo a classe correr da classe animal
    public void correr(){
        super.correr();
        System.out.println("cão !");
    }
}
