package CursoJavaLeonardoLeitao.lambdas;

public class Produto {

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    final String nome;
    final double preco;
    final double desconto;

    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return "Nome: " + nome + " tem preço de R$ " + precoFinal;
    }

}
