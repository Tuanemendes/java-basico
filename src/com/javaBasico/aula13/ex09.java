package com.javaBasico.aula13;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheit:");
        double farenheit = scan.nextDouble();
        double celsius = (5*(farenheit -32)/9);
        System.out.println("A temperatura em Celsius é : " + String.format("%.2f", celsius )  + " Cº");

    }
}
