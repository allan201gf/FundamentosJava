package listas.ListaLigada;

public class TesteAdicionaPorPosicao {

    public static void main(String[] args) {
        var lista = new ListaLigada();

        lista.adiciona("Allan");
        lista.adiciona(0, "Paulo");
        lista.adiciona(1, "Joao");

        System.out.println(lista);
    }

}
