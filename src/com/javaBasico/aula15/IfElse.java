package com.javaBasico.aula15;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Digite primeiro número");
        Scanner scan = new Scanner(System.in);
        int valor1 = scan.nextInt();

        System.out.println("Digite segundo  número");
        Scanner scan2 = new Scanner(System.in);
        int valor2 = scan.nextInt();


        if (valor1 > valor2){
            System.out.println("O primeiro número é maior " + valor1);
        }else {
            System.out.println("O segundo número é maior 2" + valor2);
        }
    }
}
