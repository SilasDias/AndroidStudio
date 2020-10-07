package com.example.heranca;

public class Animal {
//    Propriedades
    int tamanho;
    String cor;
    double peso;

//    GETTER E SETTER

//    Setter
    public void setCor(String cor){
//        formatação ou validar a cor antes de mudar
        this.cor = cor;
    }

//    Getter
    public String getCor(){
        return this.cor;
    }


//    métodos
    public void dormir() {
        System.out.println("Dormir como um animal!");
    }

    public void correr() {
        System.out.println("Correr como um animal!");
    }
}
