package aula15;

import java.util.Scanner;

public class Exe6 {
/* Faça um Programa que leia três números e mostre o maior deles. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite primeiro número:");
        Double n1 = scanner.nextDouble();
        System.out.println("Digite segundo número:");
        Double n2 = scanner.nextDouble();
        System.out.println("Digite terceiro número:");
        Double n3 = scanner.nextDouble();

        if (n1 > n2 && n1 > n3 ) {
            System.out.println("Primeiro número é maior:" + n1);
        } else if(n2 > n1 && n2 > n3) {
            System.out.println("Segundo número é maior:" + n2);
        } else if(n3 > n1 && n3 > n2 ){
            System.out.println("Terceiro número é maior:" + n3);
        }
    }
}
