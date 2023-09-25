package com.example.desafios;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario:");
        String nome = scanner.nextLine();

        System.out.println("Quantas horas voce trabalhou esse mes?");
        int horastrabalhadas = scanner.nextInt();

        System.out.println("Quanto custa sua hora?");
        int valorhoras = scanner.nextInt();

        int salario = horastrabalhadas * valorhoras;
        System.out.println("Seu salario e: " + salario);

    }
}
