package CursoJavaLeonardoLeitao.Arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        String dadosArray = Arrays.toString(notasAlunoA);

        System.out.println(dadosArray);


        // Coletando a media do array
        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }

        System.out.println(total / notasAlunoA.length);

        // Outra forma de iniciar um array
        double[] notasAlunoB = { 6.9, 8,9, 5.5, 10 };


    }
}
