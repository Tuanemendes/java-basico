package aula13;

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digte a temperatura em Farenheit:");
        Double temperaturaF = scanner.nextDouble();
        Double temperaturaC = (5*(temperaturaF-32)/9);
        System.out.println("A temperatura convertida em Celsius é :" + temperaturaC);
    }
}
