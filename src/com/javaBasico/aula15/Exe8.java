package aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

/* 
Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato. */
public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatoReal = new DecimalFormat("0.00");
        System.out.println("Digite primeiro produto:");
        Double produto1 = scanner.nextDouble();
        System.out.println("Digite segundo produto:");
        Double produto2 = scanner.nextDouble();
        System.out.println("Digite terceiro produto:");
        Double produto3 = scanner.nextDouble();

        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println("Produto 1 é o mais barato! " + formatoReal.format(produto1));
        }else if(produto2 < produto1 && produto2 < produto3) {
            System.out.println("Produto 2 é o mais barato! " + formatoReal.format(produto2));
        }else if(produto3 < produto1 && produto3 < produto2){
            System.out.println("Produto 3 é o mais barato! " + formatoReal.format(produto3));
        }
    }
}
