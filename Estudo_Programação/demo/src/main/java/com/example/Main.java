package com.example;

import java.util.Scanner;

public class Main {

    public static double somarNotas(double[] notas, int posicao) {
        if (posicao == notas.length){
            return 0;
        }
        return notas[posicao] + somarNotas(notas, posicao + 1);
    }
    public static void main(String[] args) {
        String[] alunos = {"Breno", "Sarah", "João"};

        double[][] notas = {
            {10.0, 8.5, 9.5},
            {7.5, 5.0, 6.0},
            {5.5, 8.0, 10,0}
        };

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um aluno:");
        System.out.println("0 - Breno");
        System.out.println("1 - Sarah");
        System.out.println("2 - João");

        int indice = entrada.nextInt();

        if (indice >= 0 && indice < alunos.length){

            double soma = somarNotas(notas[indice], 0);

            double media = soma / notas[indice].length;

            System.out.println("\nNome " + alunos[indice]);


            System.out.println("Nota 1: " + notas[indice][0]);
            System.out.println("Nota 2: " + notas[indice][1]);
            System.out.println("Nota 3: " + notas[indice][2]);

            System.out.println("Soma: " + soma);
            System.out.printf("Média: %.2f%n", media);
        } else {
            System.out.println("Número de aluno inválido!");
        }

        entrada.close();
    }
}