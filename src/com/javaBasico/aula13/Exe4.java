package aula13;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite nota 1:");
        Double nota1 = scanner.nextDouble();
        System.out.println("Digite nota 2:");
        Double nota2 = scanner.nextDouble();
        System.out.println("Digite nota 3:");
        Double nota3 = scanner.nextDouble();
        System.out.println("Digite nota 4:");
        Double nota4 = scanner.nextDouble(); 

        Double media = (nota1 + nota2+ nota3 + nota4)/2;
        System.out.println("A médias das notas é:" + media);



    }
}
