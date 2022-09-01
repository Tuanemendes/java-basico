package aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe11 {
/* As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatReal = new DecimalFormat("0.00");
        System.out.println("********Calcular reajuste de Salário********");
        System.out.println("--------------------------------------------");
        System.out.println("Digite salário atual:");
        Double salarioAtual = scanner.nextDouble();
     
        Double reajuste;
        Double percentual;
        Double novoSalario;
        if (salarioAtual <= 280) {
            percentual = 0.2 * 100;
            reajuste= salarioAtual * 0.2;
            novoSalario = reajuste + salarioAtual;
            System.out.println("Salário antes do reajuste: " + formatReal.format(salarioAtual)+ " Reais");
            System.out.println("Valor do reajuste: " + formatReal.format(reajuste) + " Reais");
            System.out.println("Percentual aplicado: "   + percentual + "%");
            System.out.println("Salário como o novo reajuste: " + formatReal.format(novoSalario) + " Reais");
        } else if(salarioAtual > 280 && salarioAtual <= 700) {
            percentual = 0.15 * 100;
            reajuste= salarioAtual * 0.15;
            novoSalario = reajuste + salarioAtual;
            System.out.println("Salário antes do reajuste: " + formatReal.format(salarioAtual)+ " Reais");
            System.out.println("Valor do reajuste: " + formatReal.format(reajuste) + " Reais");
            System.out.println("Percentual aplicado: "   + percentual + "%");
            System.out.println("Salário como o novo reajuste: " + formatReal.format(novoSalario) + " Reais");
        } else if(salarioAtual > 700 && salarioAtual <= 1500) {
            percentual = 0.1 * 100;
            reajuste= salarioAtual * 0.1;
            novoSalario = reajuste + salarioAtual;
            System.out.println("Salário antes do reajuste: " + formatReal.format(salarioAtual)+ " Reais");
            System.out.println("Valor do reajuste: " + formatReal.format(reajuste) + " Reais");
            System.out.println("Percentual aplicado: "   + percentual + "%");
            System.out.println("Salário como o novo reajuste: " + formatReal.format(novoSalario) + " Reais");
        } else if(salarioAtual > 1500) {
            percentual = 0.05 * 100;
            reajuste= salarioAtual * 0.05;
            novoSalario = reajuste + salarioAtual;
            System.out.println("Salário antes do reajuste: " + formatReal.format(salarioAtual)+ " Reais");
            System.out.println("Valor do reajuste: " + formatReal.format(reajuste) + " Reais");
            System.out.println("Percentual aplicado: "   + percentual + "%");
            System.out.println("Salário como o novo reajuste: " + formatReal.format(novoSalario) + " Reais");
        }

    }
}
