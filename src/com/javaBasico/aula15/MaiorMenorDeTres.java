package com.javaBasico.aula15;

import java.util.Scanner;

public class MaiorMenorDeTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int valor1 = scan.nextInt();
        System.out.println("Digite o Segundo número: ");
        int valor2 = scan.nextInt();
        System.out.println("Digite o terceiro número: ");
        int valor3 = scan.nextInt();

        if( valor1 >= valor2 && valor1 >= valor3){
            System.out.println("O Primeiro número é maior " + valor1);
        }else if(valor2 >= valor1 && valor2 >= valor3) {
            System.out.println("O Segundo número é maior " + valor2);
        }else if (valor3 >= valor1 && valor3 >= valor2){
            System.out.println("O Terceiro número é maior " + valor3);
        }

        if( valor1 <= valor2 && valor1 <= valor3){
            System.out.println("O Primeiro número é menor " + valor1);
        }else if(valor2 <= valor1 && valor2 <= valor3) {
            System.out.println("O Segundo número é menor " + valor2);
        }else if (valor3 <= valor1 && valor3 <= valor2){
            System.out.println("O Terceiro número é menor " + valor3);
        }

    }
}
