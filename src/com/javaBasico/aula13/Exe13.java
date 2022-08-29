package aula13;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura:");
        Double altura = scanner.nextDouble();
        System.out.println("Digite seu sexo 'F' para feminino e 'M para masculino' ");
        String sexo = scanner.next();
        System.out.println("Digite seu peso:");
        Double peso = scanner.nextDouble();
        if (sexo == "F") {
            
            Double pesoIdeal = (62.7 * altura)-44.7;
            System.out.println("Seu atual é de:" + pesoIdeal);
            if (pesoIdeal < peso) {
                System.out.println("Esta acima do peso ideal!");
            }
            if (pesoIdeal > peso) {
                System.out.println("Esta abaixo do peso ideal!");
            }else{
                System.out.println("Esta dento do peso ideal!");
            }
        }else{
            Double pesoIdeal = (72.7*altura)-58;
            System.out.println("Seu atual é de:" + pesoIdeal);
            if (pesoIdeal > peso) {
                System.out.println("Esta acima do peso ideal!");
            }
            if (pesoIdeal < peso) {
                System.out.println("Esta abaixo do peso ideal!");
            }else{
                System.out.println("Esta dento do peso ideal!");
            }
        }
    }
}
