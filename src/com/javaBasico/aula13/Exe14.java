package aula13;

import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso do peixe:");
        Double pesoPeixe = scanner.nextDouble();
        Double pesoLimite = 50.00;
        if (pesoPeixe > pesoLimite) {
            Double execesso = pesoPeixe - pesoLimite;
            Double multa = execesso * 4.00;
            System.out.println("O peso esta acima do permitido: " + pesoPeixe + " e o valor da multa é: " + multa + " Reais" );
              
        }else{
            System.out.println("O peso esta dentro das normas: "+ pesoPeixe );
        }
    }
}
