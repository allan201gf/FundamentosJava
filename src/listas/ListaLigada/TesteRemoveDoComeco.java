package listas.ListaLigada;

public class TesteRemoveDoComeco {

    public static void main(String[] args) {
        var lista = new ListaLigada();

        lista.adiciona("Allan");
        lista.adiciona("Paulo");

        lista.removeDoComeco();

        System.out.println(lista);
    }

}
