package listas.ListaLigada;

public class TesteRemoveDoFim {

    public static void main(String[] args) {
        var lista = new ListaLigada();

        lista.adiciona("Allan");
        lista.adiciona("Paulo");

        lista.removeDoFim();

        System.out.println(lista);
    }

}
