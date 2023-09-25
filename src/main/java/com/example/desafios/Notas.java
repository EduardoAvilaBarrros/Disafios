package com.example.desafios;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno:");
        int nota1 = scanner.nextInt();
        System.out.println("Digite a segunda nota do aluno:");
        int nota2 = scanner.nextInt();
        System.out.println("Digite a terceira nota do aluno:");
        int nota3 = scanner.nextInt();
        System.out.println("Digite a quarta nota do aluno:");
        int nota4 = scanner.nextInt();
        System.out.println("Digite a quinta nota do aluno:");
        int nota5 = scanner.nextInt();

        int notaTotal = (nota1 + nota2 + nota3 + nota4 + nota5);

        if (notaTotal == 0) {
            System.out.println("Este aluno está reprovado");
        } else {
            System.out.println("Esse aluno está aprovado");
        }
    }
}
