package listas.ListaLigada;

public class TesteContemElemento {

    public static void main(String[] args) {
        var lista = new ListaLigada();

        lista.adiciona("Allan");
        lista.adiciona("Paulo");

        System.out.println(lista.contem("Allan"));
        System.out.println(lista.contem("Joao"));
    }
}
