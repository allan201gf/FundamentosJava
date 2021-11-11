package oo.composicao.Desafio;

public class Sistema {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Allan Ferreira");

        Compra compra1 = new Compra();

        compra1.adicionarItem("Caneta", 9.50, 100);
        compra1.adicionarItem(new Produto("Notebook", 2500.00), 2);

        Compra compra2 = new Compra();

        compra2.adicionarItem("Caderno", 10.00, 10);
        compra2.adicionarItem(new Produto("Impressora", 10000.00), 1);

        Compra compra3 = new Compra();

        compra3.adicionarItem("Celular", 1500.00, 1);

        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra3);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());

        cliente.removerCompra(compra1);
        cliente.removerTodasAsCompras();

        System.out.println(cliente.obterValorTotal());

        System.out.println(cliente.compraMaisCara());

    }
}
