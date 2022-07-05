package CursoJavaLeonardoLeitao.Classe;

public class Produto {


    // cria um produto passando o nome, preço e o desconto
    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    Produto() { // Permite criar um produto sem passar nenhum parametro
    }

    String nome;
    double preco;
    double desconto;

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

}
