package listas.Fila;

import java.util.LinkedList;
import java.util.List;

public class Fila<T> {

    private List<T> objetos = new LinkedList<>();

    public void insere(T t) {
        objetos.add(t);
    }

    public T remove() {
        return objetos.remove(0);
    }

    public boolean vazia() {
        return objetos.isEmpty();
    }

    @Override
    public String toString() {

        StringBuilder todos = new StringBuilder("[");

        for (int i = 0; i < objetos.size(); i++) {
            todos.append(objetos.get(0));

            if (objetos.size() > i + 1) {
                todos.append(" - ");
            }
        }

        todos.append("]");
        return todos.toString();
    }
}
