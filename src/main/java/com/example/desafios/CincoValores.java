package com.example.desafios;

import java.util.Scanner;

public class CincoValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero:");
        int numero3 = scanner.nextInt();
        System.out.println("Digite o quarto numero:");
        int numero4 = scanner.nextInt();
        System.out.println("Digite o quinto numero:");
        int numero5 = scanner.nextInt();

        int par, impar, positivo, negativo;
        par = 0;
        impar = 0;
        positivo = 0;
        negativo = 0;

        if (numero1 % 2 == 0) {
            par++;
        } else if (numero1 % 2 == 1) {
            impar++;
        }

        if (numero2 % 2 == 0) {
            par++;
        } else if (numero2 % 2 == 1) {
            impar++;
        }

        if (numero3 % 2 == 0) {
            par++;
        } else if (numero3 % 2 == 1) {
            impar++;
        }

        if (numero4 % 2 == 0) {
            par++;
        } else if (numero4 % 2 == 1) {
            impar++;
        }

        if (numero5 % 2 == 0) {
            par++;
        } else if (numero5 % 2 == 1) {
            impar++;
        }

        if (numero1 > 0) {
         positivo++;
        } else if (numero1 < 0) {
            negativo++;
        }

        if (numero2 > 0) {
            positivo++;
        } else if (numero2 < 0) {
            negativo++;
        }

        if (numero3 > 0) {
            positivo++;
        } else if (numero3 < 0) {
            negativo++;
        }

        if (numero4 > 0) {
            positivo++;
        } else if (numero4 < 0) {
            negativo++;
        }

        if (numero5 > 0) {
            positivo++;
        } else if (numero5 < 0) {
            negativo++;
        }

        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
        System.out.println("Negativos: " + negativo);
        System.out.println("Positivos: " + positivo);
    }
}
