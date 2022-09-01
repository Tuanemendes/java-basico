package aula15;

import java.util.Scanner;

public class Exe2 {
    //Faça um Programa que peça um valor e mostre na tela se o valor é
    //positivo ou negativo.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor");
        Double valor = scanner.nextDouble();
        if (valor > 0) {
            System.out.println("Valor positivo!");
        }else if(valor < 0 ){
            System.out.println("Valor negativo!");
        }
    }

}
