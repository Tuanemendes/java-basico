package aula13;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite a temperatura em Celsius: ");
        Double celsius = scanner.nextDouble();
        Double farenheit  = (celsius * 9/5)+32;
        System.out.println("A temperatura em Farenheit é: " + farenheit);
    }
}
