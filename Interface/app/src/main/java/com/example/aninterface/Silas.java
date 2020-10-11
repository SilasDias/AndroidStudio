package com.example.aninterface;

public class Silas extends Cidadao implements Presidente {

    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar uma eleição no Brasil");
    }
}
