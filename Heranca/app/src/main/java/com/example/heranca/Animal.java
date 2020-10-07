package com.example.heranca;

public class Animal {
//    Propriedades
    int tamanho;
    String cor;
    double peso;

//    GETTER E SETTER

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setCor(String cor){
//        formatação ou validar a cor antes de mudar
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


//    métodos
    public void dormir() {
        System.out.println("Dormir como um animal!");
    }

    public void correr() {
        System.out.println("Correr como um animal!");
    }
}
