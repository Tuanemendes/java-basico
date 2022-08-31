package aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("Digite o tamanho do arquivo para download (MB):");
        Double arquivoTamanho = scanner.nextDouble();
        System.out.println("Digite a velociade do link de internet (Mbps):");
        Double velocidadeLink = scanner.nextDouble();
        Double tempo = arquivoTamanho /velocidadeLink;
        Double minuto;
        minuto = tempo / 60.00;

        System.out.println("O tempo em minutos para o download é de: " + formatador.format(minuto));

        
    }
}
