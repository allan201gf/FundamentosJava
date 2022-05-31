package listas.Pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha<T> {

    private List<T> objects = new LinkedList<>();

    public void insere(T t) {
        objects.add(t);
    }

    public T remove() {
        return objects.remove(objects.size() - 1);
    }

    public boolean vazia() {
        return objects.isEmpty();
    }


}
