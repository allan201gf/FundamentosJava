package listas.ListaLigada;

public class TesteTamanho {

    public static void main(String[] args) {
        var lista = new ListaLigada();

        lista.adiciona("Allan");
        lista.adiciona("Paulo");

        System.out.println(lista.tamanho());

        lista.adiciona("Joao");

        System.out.println(lista.tamanho());
    }
}
