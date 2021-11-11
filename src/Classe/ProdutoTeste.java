package Classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3500.00, 0.15);

        Produto p2 = new Produto();
        p2.nome = "Celular";
        p2.preco = 2500;
        p2.desconto = 0.10;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());


    }
}
