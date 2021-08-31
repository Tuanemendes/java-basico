package com.javaBasico.aula15;

import java.util.Scanner;

public class FeminoMasculino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite F-Feminino ou M-Masculino");
        
        String sexo = scan.next();
        switch (sexo){

            case "F":
                System.out.println("Feminino");
                break;
            case "M":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Sexo Inválido!");
        }
    }
}
