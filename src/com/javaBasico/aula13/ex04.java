package com.javaBasico.aula13;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite primeiro número:");
        double numero1 = scan.nextDouble();
        System.out.println("Digite a segundo número:");
        double numero2 = scan.nextDouble();

        double soma = numero1 + numero2;

        System.out.println("A soma entre os dois números é :" + soma);

    }
}
