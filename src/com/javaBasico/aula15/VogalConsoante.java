package com.javaBasico.aula15;

import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra");


        String letra = scan.next();

        if (letra.length() > 1){
            System.out.println("Não é uma letra valida.");
        }else {
            switch (letra.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println("Vogal!");
                    break;
                default:
                    System.out.println("Consoante!");
            }
        }
    }
}
