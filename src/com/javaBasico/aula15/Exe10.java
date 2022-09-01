package aula15;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class Exe10 {
/* Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o turno você estuda? Digite M-matutino ou V-Vespertino ou N- Noturno:");
        String turno = scanner.next();
        if (turno.equalsIgnoreCase("m")) {
            System.out.println("Seu turno é Matutino");
        } else if(turno.equalsIgnoreCase("v")) {
            System.out.println("Seu turno é Vespertino");
        }else if(turno.equalsIgnoreCase("n")){
            System.out.println("Seu turno é Noturno");
        }else{
            System.out.println("Letra inválida!");
        }
    }
}
