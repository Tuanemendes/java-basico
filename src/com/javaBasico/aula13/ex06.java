package com.javaBasico.aula13;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do raio:");
        double raio = scan.nextDouble();
        double area = 3.14 * Math.pow(raio, 2);

        System.out.println("O valor da área é:" + area);

    }
}
