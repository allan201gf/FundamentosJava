package CursoJavaLeonardoLeitao.oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;

    final List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }

    void removerCompra(Compra compra) {
        this.compras.remove(compra);
    }

    void removerTodasAsCompras() {
        compras.clear();
    }

    String compraMaisCara() {
        double valorMaisAlto = 0;

        for (Compra compra: compras) {
            if (compra.obterValorTotal() >= valorMaisAlto) {
                valorMaisAlto = compra.obterValorTotal();
            }

        }

        return "O valor da compra mais alta é de " + valorMaisAlto + ".";

    }

    double obterValorTotal() {
        double total = 0;

        for (Compra compra: compras) {
            total += compra.obterValorTotal();
        }

        return total;
    }


}
