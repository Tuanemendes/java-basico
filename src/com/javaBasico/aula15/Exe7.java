package aula15;

import java.util.Scanner;

/* Faça um Programa que leia três números e mostre o maior e o menor
deles. */
public class Exe7 {
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
        if (n1 < n2 && n1 < n3 ) {
            System.out.println("Primeiro número é menor:" + n1);
        } else if(n2 < n1 && n2 < n3) {
            System.out.println("Segundo número é menor:" + n2);
        } else if(n3 < n1 && n3 < n2 ){
            System.out.println("Terceiro número é menor:" + n3);
        }
    }
}
