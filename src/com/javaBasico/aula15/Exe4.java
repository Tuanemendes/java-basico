package aula15;

import java.util.Scanner;

public class Exe4 {

/*     Faça um Programa que verifique se uma letra digitada é vogal ou
consoante. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Digite uma letra:");
        String letra = scanner.next();

        if (letra.equalsIgnoreCase("a")|| letra.equalsIgnoreCase("e")|| letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o")|| letra.equalsIgnoreCase("u")) {
            System.out.println("É uma vogal!");
        } else {
            System.out.println("É uma consoante!");
        }

    }
}
