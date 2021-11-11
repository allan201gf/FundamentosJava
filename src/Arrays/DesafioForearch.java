package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Algoritimo para cálcular a media de notas de um aluno utilizando Scanner, Array e Forearch
 * @Allan201GF
 */

public class DesafioForearch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas você deseja informar? ");
        int quantiaNotas = entrada.nextInt();

        double[] notas = new double [quantiaNotas];
        double total = 0;
        double notaAtual = 0;
        double media = 0;

        System.out.println(Arrays.toString(notas));

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota número " + (i+1) + ": ");
            notaAtual = (double) entrada.nextDouble();

            System.out.println(notaAtual);

            notas[i] = notaAtual;

        }

        entrada.close();

        for(double nota: notas) {
            total += nota;
        }

        media = total / notas.length;

        System.out.println("A média das notas digitadas é " + media);






    }

}
