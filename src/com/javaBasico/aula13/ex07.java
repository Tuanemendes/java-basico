package com.javaBasico.aula13;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da base de um quadrado: ");
        double base = scan.nextDouble();
        double area = Math.pow(base,2);
        double dobro = area * area;
        System.out.print("O dobro da área é " + dobro + " m²");

    }
}
