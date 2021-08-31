package com.javaBasico.aula15;

import java.util.Scanner;

public class PrecoProduto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Preço produto 1:" );
        double preco1 = scan.nextDouble();

        System.out.println("Preço produto 2:");
        double preco2 = scan.nextDouble();

        System.out.println("Preço produto 3:");
        double preco3 = scan.nextDouble();

        if (preco1 <= preco2 && preco1 <= preco3) {
            System.out.println("O produto 1 é o mais barato ");
        } else if (preco2 <= preco1 && preco2 <= preco3) {
            System.out.println("O produto 2 é o mais barato ");
        } else if (preco3 <= preco1 && preco3 <= preco2) {
            System.out.println("O produto 3 é o mais barato ");
        }
    }
}
