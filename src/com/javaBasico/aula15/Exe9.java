package aula15;

import java.util.Scanner;

public class Exe9 {
/* Faça um Programa que leia três números e mostre-os em ordem
decrescente. */
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite primeiro número:");
    Double numero1 = scanner.nextDouble();
    System.out.println("Digite segundo número:");
    Double numero2 = scanner.nextDouble();
    System.out.println("Digite terceiro número:");
    Double numero3 = scanner.nextDouble();
    

        if ((numero1 > numero2 && numero1 > numero3) && numero2 > numero3 ) {
            System.out.println("Números em ordem decrescente:" + numero1 );
            System.out.println("Números em ordem decrescente:" + numero2 );
            System.out.println("Números em ordem decrescente:" + numero3 );
        }
        if ((numero2 > numero1 && numero2 > numero3) && numero1 > numero3 ) {
            System.out.println("Números em ordem decrescente:" + numero2 ); 
            System.out.println("Números em ordem decrescente:" + numero1 );
            System.out.println("Números em ordem decrescente:" + numero3 );
        } 
        if ((numero3 > numero1 && numero3 > numero2) && numero2 >numero1) {
            System.out.println("Números em ordem decrescente:" + numero3 );
            System.out.println("Números em ordem decrescente:" + numero2 );
            System.out.println("Números em ordem decrescente:" + numero1 );
        } 
        if ((numero1 > numero2 && numero3 > numero2) && numero3 >numero2) {
            System.out.println("Números em ordem decrescente:" + numero1 );
            System.out.println("Números em ordem decrescente:" + numero3 );
            System.out.println("Números em ordem decrescente:" + numero2 );
        } 
    }
}
