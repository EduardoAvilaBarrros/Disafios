package com.example.desafios;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        int idadeEmDias = idade * 365;
        int idadeEmMeses = idade * 12;

        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua idade em meses é: " + idadeEmMeses);
        System.out.println("Sua idade em dias é: " + idadeEmDias);
    }
}
