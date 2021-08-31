package com.javaBasico.aula15;

import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite valor 1 ");
        int valor1 = scan.nextInt();

        System.out.println("Digite valor 2 ");
        int valor2 = scan.nextInt();

        System.out.println("Digite valor 3 ");
        int valor3 = scan.nextInt();

       if (valor1 <= valor2 && valor1<= valor3 && valor2 <= valor3 ){
           // valor 1 é menor  que valor2 e valor3
           // valor 2 é menor que valor3
           // valor 3 é o maior
           // valor1< valor2 <valor3

        System.out.println(valor3 + "--" + valor2 + "--" + valor1);
       }
    }
}
