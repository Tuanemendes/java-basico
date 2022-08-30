package aula13;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
    DecimalFormat formatador = new DecimalFormat("0.00");
    DecimalFormat formatadorUnidade = new DecimalFormat("0");
    Scanner scanner = new Scanner(System.in);
    System.out.println("********* Lojas de tintas **********");
    System.out.println("------------------------------------");
    System.out.println("Qual o valor da áre a ser pintada:" );
    Double areaTinta = scanner.nextDouble();
    Double metro = 6.00; 
    Double quantidadeTinta;
    Double quantidadeLata;
    Double quantidadeGalao;
    Double lataTinta = 18.00;
    Double galaoTinta = 3.6;
    Double precoLata = 80.00;
    Double precoGalao = 25.00;
    Double custoLata;
    Double custoGalao;
    Double tintaFolga;
    Double quantidadeFolga;
    quantidadeTinta = Math.ceil( areaTinta/metro);
    quantidadeLata = Math.ceil(quantidadeTinta/lataTinta);
    quantidadeGalao = Math.ceil(quantidadeTinta/galaoTinta);
    custoLata = Math.ceil(quantidadeLata * precoLata);
    custoGalao = Math.ceil(quantidadeGalao *precoGalao);
    tintaFolga = quantidadeTinta * 1.1;
    quantidadeFolga = tintaFolga;
    

        if (quantidadeTinta < lataTinta  ) {

            System.out.println("Latas de 18 Litros: " + formatadorUnidade.format(Math.ceil(quantidadeLata)));
            System.out.println("Custo total  para  a Lata de tinta: " +formatador.format(Math.ceil(custoLata)));
        }else{

            System.out.println("Latas de 18 Litros: " + formatadorUnidade.format(Math.ceil(quantidadeLata)));
            System.out.println("Custo total  para a Lata de tinta: " +formatador.format(custoLata));
        }
        if (quantidadeTinta < galaoTinta) {
            
            System.out.println("Galão de 3,6 Litros: " + formatadorUnidade.format(Math.ceil(quantidadeGalao)));
            System.out.println("Custo total  para o Galão de tinta: " +formatador.format(custoGalao));
        } else {
            System.out.println("Galão de 3,6 Litros: " + formatadorUnidade.format(Math.ceil(quantidadeGalao)));
            System.out.println("Custo total  para o Galão de tinta: " +formatador.format(custoGalao));
        }


    }
}
