package aula13;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        Double raio = scanner.nextDouble();
        Double area = 3.14 * Math.pow(raio,2);

        System.out.println("Valor da area é:" + area);
    }
}
