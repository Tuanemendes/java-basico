package aula13;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor em metros: ");
        Double metro = scanner.nextDouble();

        Double centrimetros = metro * 1000;
        System.out.println("O valor convertido é: " + centrimetros + " cm");

    }
}
