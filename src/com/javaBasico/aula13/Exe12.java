package aula13;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        Double altura = scanner.nextDouble();
        Double pesoIdeal = (72.7 * altura)-58;
        System.out.println("Sseu peso ideal é :" + pesoIdeal);
    }
}
