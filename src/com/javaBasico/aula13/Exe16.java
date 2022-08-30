package aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        DecimalFormat formatadorUnidade = new DecimalFormat("0");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos metros quadrados da área a ser pintada? ");
        Double areaPintada = scanner.nextDouble();
        Double metro = 3.00; 
        //gera a quantidade de litros necessarios 
        Double quantidadeTinta = areaPintada / metro;
        System.out.println("Quantidade de tinta é: " + formatador.format(quantidadeTinta )  + " Litros");
        
        Double tinta = 18.00;
        Double precoLata = 80.00;

        Double quantidadeLata = Math.ceil(quantidadeTinta/tinta);
        Double custoLata = Math.ceil(quantidadeLata) * precoLata;
        if (quantidadeTinta < tinta) {
            System.out.println("Deverá comprar: " + formatadorUnidade.format(Math.ceil(quantidadeLata))+ " Lata" );
            System.out.println("Seu custo é de: " + formatador.format(Math.ceil(custoLata))+ " Reais" );
        } else {
            System.out.println("Deverá comprar: " + formatadorUnidade.format(Math.ceil(quantidadeLata)) + " Latas");
            System.out.println("Seu custo é de: " + formatador.format(Math.ceil(custoLata))+ " Reais" );
        }
        
    }
}
