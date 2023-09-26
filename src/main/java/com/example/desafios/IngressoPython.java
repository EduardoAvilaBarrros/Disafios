package com.example.desafios;

import java.util.Scanner;

public class IngressoPython {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorsemdesconto = 20.00;
        double valorVIPsemdesconto = 50.00;

        System.out.println("Digite seu noome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Voce e estudante de python?" +
                "\nResponda com s(sim) e  n(nao)" +
                "\nResposta:");
        String resposta = scanner.nextLine();

        if (idade > 18) {
            System.out.println("Voce pode reservar seu ingreso");
        } else {
            System.out.println("Voce nao pode reservar seu ingreso");
        }

        System.out.println("Voce deseja comprar o ingresso padra ou VIP?" +
                "\n1. Padra = R$20,00" +
                "\n2. VIP = R$50,00");
        int ingresso = scanner.nextInt();

        if (resposta.equals("s")) {

        }
    }
}
