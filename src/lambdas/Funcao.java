package lambdas;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        // Função para dizer se um numero é impar ou par
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar"; // Recebe inteiro e retorna String

        System.out.println(parOuImpar.apply(33));

        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

        Function<String, String> empougado = valor -> valor + " !!!";

        String resultadoFinal = parOuImpar
                .andThen(oResultadoE)
                .andThen(empougado)
                .apply(32);



        System.out.println(resultadoFinal);

    }
}
