package aula13;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor você por hora?");
        Double valorHora = scanner.nextDouble();
        System.out.println("Qual o numero de horas total no mês:");
        Double horaMes = scanner.nextDouble();
        Double salario = valorHora * horaMes;
        System.out.println("O valor de seu salario no mês é :" + salario);
    }
}
