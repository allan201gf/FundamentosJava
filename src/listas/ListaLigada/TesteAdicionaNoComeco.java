package listas.ListaLigada;

public class TesteAdicionaNoComeco {

    public static void main(String[] args) {
        var lista = new ListaLigada();

        lista.adicionaNoComeco("Allan");
        lista.adicionaNoComeco("Paulo");

        System.out.println(lista);
    }

}
