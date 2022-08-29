package aula13;

import java.util.Scanner;

import javax.swing.text.html.parser.Parser;

public class Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite primeiro valor inteiro:");
        int n1 = scanner.nextInt();
        System.out.println("Digite segundo valor inteiro:");
        int n2 = scanner.nextInt();
        System.out.println("Digite terceiro valor real:");

        Double n3 = scanner.nextDouble();
        //o produto do dobro do primeiro com metade do segundo .
        int result1 =  (n1 * 2) * (n2 / n2);
        System.out.println("o produto do dobro do primeiro com metade do segundo é:" + result1); 
        // a soma do triplo do primeiro com o terceiro.
        Double result2 = (n1 * 3) + n3;
        System.out.println("a soma do triplo do primeiro com o terceiro é: " + result2);
        Double result3 =  Math.pow(n3, 3);
        System.out.println("O terceiro elevado ao cubo é: "+ result3);


        //o terceiro elevado ao cubo.

    }
}
