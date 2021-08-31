package com.javaBasico.aula13;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor em metros: ");
        double metros = scan.nextDouble();
        double centimetros = metros * 100;
        System.out.println("Valor convertido em centímetros é: " + centimetros + " Cm");

    }
}
