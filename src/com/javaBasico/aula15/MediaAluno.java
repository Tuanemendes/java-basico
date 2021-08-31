package com.javaBasico.aula15;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a Primeira nota:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite Segunda nota:");
        double nota2 = scan.nextDouble();
        double media;
        media = (nota1 + nota2) / 2;
        if (media >= 7 && media <= 9.9){
            System.out.println("Aprovado nota: " + media);
        }else if(media < 7){
            System.out.println("Reprovado nota: " + media);
        }else if(media == 10 ){
            System.out.println("Aprovado com  Distição nota: " + media );
        }
    }
}
