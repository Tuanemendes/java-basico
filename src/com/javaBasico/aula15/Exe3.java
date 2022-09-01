package aula15;

import java.util.Scanner;

public class Exe3 {
/*      Faça um Programa que verifique se uma letra digitada é "F" ou "M".
    Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 'F' para Feminino ou  'M' para Masculino");
        String sexo = scanner.next();
      
        if (sexo.equalsIgnoreCase("f")) {
            System.out.println("Feminino");
        } else if(sexo.equalsIgnoreCase("m")) {
            System.out.println("Masculino");
        }else{
            System.out.println("Letra invalida!");
        }

    }
}
