package aula13;

import java.util.Scanner;

public class Exe3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro númeiro:");
        Integer n1 = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        Integer n2 = scanner.nextInt();

        Integer result =  n1 + n2 ;
        System.out.println("A soma entre os dois números é :" + result);
    
    
    }


}
