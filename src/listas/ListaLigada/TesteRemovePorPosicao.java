package listas.ListaLigada;

public class TesteRemovePorPosicao {

    public static void main(String[] args) {
        var lista = new ListaLigada();

        lista.adiciona("Allan");
        lista.adiciona("Paulo");
        lista.adiciona("Joao");

        lista.remove(1);

        System.out.println(lista);
    }
}
