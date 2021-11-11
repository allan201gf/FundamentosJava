package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);
        UnaryOperator<Double> impostoMinucial = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("Ipad", 3235.89, 0.13);

        String preco = precoFinal
                .andThen(impostoMinucial)
                .andThen(frete)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preco final é " + preco);

    }
}
