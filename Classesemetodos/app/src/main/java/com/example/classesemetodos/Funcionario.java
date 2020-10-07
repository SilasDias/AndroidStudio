package com.example.classesemetodos;

public class Funcionario {

//    propriedades
    String name;
    double salary;

//    métodos sem retorno
    public void recoveSalary() {
//        this chama a propriedade dentro da classe
        this.salary = this.salary - (this.salary * 0.10);
        System.out.println(this.salary);
    }

//    métodos com retorno e parametro
    public double returnSalary(double discount, double bonus) {
//        this chama a propriedade dentro da classe
        this.salary = this.salary - (this.salary * discount);
        return this.salary + bonus;
//        System.out.println(this.salary);
    }

}
