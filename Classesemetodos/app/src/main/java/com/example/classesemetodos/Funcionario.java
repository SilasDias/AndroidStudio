package com.example.classesemetodos;

public class Funcionario {

//    propriedades
    String name;
    double salary;

//    métodos
    public void recoveSalary() {
//        this chama a propriedade dentro da classe
        System.out.println(this.salary);
    }

}
