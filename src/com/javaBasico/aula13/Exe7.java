package aula13;

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite valor de área: ");
        Double area = scanner.nextDouble();
        Double dobro = Math.pow(area,2) * 2;
        System.out.println("O valor do dobro do quadrado da area é :" + dobro);
    }
    
}
