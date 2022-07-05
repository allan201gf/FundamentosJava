package CursoJavaLeonardoLeitao.lambdas;

import java.util.function.Predicate;

public class Predicado { // Predicate recebe um paremetro e returna true ou false

    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 3983.89, 0.15);

        Predicate<Produto> isCaro =
                prod -> (prod.preco * (1 - prod.desconto)) >= 750;

        System.out.println(isCaro.test(produto));

    }

}
