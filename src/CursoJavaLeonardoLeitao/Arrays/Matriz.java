package CursoJavaLeonardoLeitao.Arrays;

import java.util.Scanner;

/*
 * Algoritimo para cálcular a media de notas da turna considerando varios alunos utilizando Scanner, Array e Forearch
 * @Allan201GF
 */

public class Matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdeAlunos = entrada.nextInt();

        System.out.print("Quantos notas por Aluno? ");
        int qtdeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
        double total = 0;

        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {

                System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
                notasDaTurma[i][j] = entrada.nextDouble();
                total += notasDaTurma[i][j];

            }
            
        }

        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("A média da turna é " + media);

        entrada.close();

    }
}