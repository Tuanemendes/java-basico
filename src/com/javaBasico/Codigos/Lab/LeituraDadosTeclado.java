package Codigos.Lab;

import java.util.Scanner;

public class LeituraDadosTeclado {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.println("Meu nome é:" + nome);

        System.out.println("Digite seu primeiro nome ");
        String primeiroNome = scanner.next();
        System.out.println("Meu prmeiro nome é: " + primeiroNome);
    }
}
