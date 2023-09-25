package com.example.desafios;

import java.util.Scanner;

public class NoatsABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite sua segunda nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite sua terceira nota:");
        double nota3 = scanner.nextDouble();

        double notacompeso2 = nota1 * 0.2;
        double notacompeso3 = nota2 * 0.3;
        double notacompeso5 = nota3 * 0.5;

        double mediafinal = notacompeso2 + notacompeso3 + notacompeso5;
        System.out.println("A media do aluno e: " + mediafinal);
    }
}
