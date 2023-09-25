package com.example.desafios;

import java.util.Scanner;

public class NumerosInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();

        System.out.println("Numeros pares ate:" + numero + ":");

        for (int i = 2; i <= numero; i += 2) {
            System.out.println(i);
        }
    }
}
