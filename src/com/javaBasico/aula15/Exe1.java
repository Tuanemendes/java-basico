package aula15;

import java.util.Scanner;

public class Exe1 {
    //Faça um Programa que peça dois números e imprima o maior deles.

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite primeiro número:");
        Double primeiroNumero = scanner.nextDouble();
        System.out.println("Digite segundo número:");
        Double segundoNumero = scanner.nextDouble();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O primeiro número é maior que o segundo!");
        }else{
            System.out.println(" O segundo número é maior  que o primeiro!");
        }
     }
}
