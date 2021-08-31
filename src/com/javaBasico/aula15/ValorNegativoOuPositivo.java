package com.javaBasico.aula15;

import java.util.Scanner;

public class ValorNegativoOuPositivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite número:");
        int valor1 = scan.nextInt();


        if (valor1 < 0  ){
            System.out.println("Valor negativo!");

        }else{
            System.out.println("Valor positivo!");
        }
    }
}
