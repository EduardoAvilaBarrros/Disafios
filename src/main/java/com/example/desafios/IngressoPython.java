package com.example.desafios;

import java.util.Scanner;

public class IngressoPython {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorsemdesconto = 20.00;
        double valorVIPsemdesconto = 50.00;

        double valorcomdesconto = valorsemdesconto / 2;
        double valorVIPcomdesconto = valorVIPsemdesconto / 2;

        System.out.println("Digite seu noome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Voce e estudante de python?" +
                "\nResponda com s(sim) e  n(nao)" +
                "\nResposta:");
        scanner.nextLine();
        String resposta = scanner.nextLine();

        if (idade >= 18) {
            System.out.println("Voce pode reservar seu ingreso");
            System.out.println("\nVoce deseja comprar o ingresso padra ou VIP?" +
                    "\n1. Padrao = R$20,00" +
                    "\n2. VIP = R$50,00");
            int ingresso = scanner.nextInt();
            System.out.println("Seu ingresso" + ingresso + "foi reservado com sucesso");

            if (resposta.equals("s")) {
                System.out.println("Seu ingresso saiu com desconto por ser aluno python");
                if (ingresso == 1){
                    System.out.println("Valor sem desconto = 20,00" +
                            "\nValor com desconto = 10,00");
                } else {
                    System.out.println("Valor sem desconto = 50,00" +
                            "\nValor com desconto = 25,00");
                }
            } else {
                System.out.println("\nSeu ingresso nao saiu com desconta");
            }

            System.out.println("\nPague no local da festa!");
        } else {
            System.out.println("Voce nao pode reservar seu ingreso");
        }
    }
}
