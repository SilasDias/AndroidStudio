package com.example.sobrecargademetodos;

public class Pessoa {

    private String nome;
    private int idade;

    public void exibirDados(String nome){
        System.out.println("exibir apenas nome: " + nome);

    }

//    Sobrecargar metodo como mesmo nome e com diferentes parametros ex:
    public void exibirDados(String nome, int idade) {
        System.out.println("Nome: " + nome + "idade" + idade);
    }
}
