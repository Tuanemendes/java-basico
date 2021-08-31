package com.javaBasico.aula13;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu salário por hora:");
        double salario = scan.nextDouble();
        System.out.println("Qual o número de horas trabalhadas no mês:");
        int horas = scan.nextInt();
        double salarioTotal = salario * horas;
        System.out.println("O Total do salário no mês é :" + salarioTotal);


    }
}
