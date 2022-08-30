package aula13;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor você por hora?");
        Double valorHora = scanner.nextDouble();
        System.out.println("Qual o número de horas total no mês:");
        Double horaMes = scanner.nextDouble();
        Double salario = valorHora * horaMes;
        System.out.println("O valor de seu salário no mês é :" + salario);
        Double inss = 0.08;
        Double ir = 0.11;
        Double sindicato = 0.05;
        
        Double desconto = salario * inss;
        System.out.println("Valor pago para o INSS: " + desconto);
        desconto = salario * ir;
        System.out.println("Valor pago para o imposto de renda : " + desconto);
        desconto = salario * sindicato;
        System.out.println("Valor pago para o sindicato : " + desconto);
        desconto = salario * (ir + inss + sindicato);
        System.out.println("Total de descontos: " + desconto);
        Double salarioLiquido = salario - (salario * (ir + inss + sindicato));
        System.out.println("Seu salário liquido  é de : " + salarioLiquido);     

    }
}
