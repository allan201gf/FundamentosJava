package listas.ListaLigada;

public class TesteAdicionaNoFim {

    public static void main(String[] args) {
        var lista = new ListaLigada();

        lista.adiciona("Allan");
        lista.adiciona("Paulo");

        System.out.println(lista);
    }

}
