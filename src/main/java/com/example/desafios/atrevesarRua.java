package com.example.desafios;

import java.util.Scanner;

public class atrevesarRua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voce e pedestre ou motorista? Responda pelos numeros indicados:" +
                "\n 1. Pedestre" +
                "\n 2. Motorista" +
                "\nResposta:");
        int resposta = scanner.nextInt();

        if (resposta == 1) {
            System.out.println("Responda todas as perguntas a baixo com s(sim) ou n(nao):" +
                    "\nVoce esta na faixa de seguranca?" +
                    "\nResposta:");
            scanner.nextLine();
            String resposta2 = scanner.nextLine();
            System.out.println("O sinal esta fechado para os carros?" +
                    "\nResposta");
            String resposta3 = scanner.nextLine();
            if (resposta2.equals("s") && resposta3.equals("s")){
                System.out.println("Parabens voce ta certo");
            } else {
                System.out.println("Se mate logo entao");
            }
        } else if (resposta == 2) {
            System.out.println("Responda todas as perguntas a baixo com s(sim) ou n(nao):" +
                    "\nVoce esta usando cinto de seguranca" +
                    "\nResposta:");
            scanner.nextLine();
            String resposta2 = scanner.nextLine();
            System.out.println("Voce bebeu alguma bebida alcoolica?" +
                    "\nResposta:");
            String resposta3 = scanner.nextLine();
            System.out.println("O sinal enta aberto para carros?" +
                    "\nResposta:");
            String resposta4 = scanner.nextLine();
            if (resposta2.equals("s") && resposta3.equals("n") && resposta4.equals("s")){
                System.out.println("Voce pode dirigir parabens ✔✨");
            } else {
                System.out.println("Voce esta errado, se mate logo, amem!");
            }
        }
    }
}
