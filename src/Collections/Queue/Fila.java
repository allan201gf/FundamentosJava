package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Allan"); //Adiciona elemento na fila
        fila.offer("Paulo"); // Também adiciona, mas se nao couber ele retorna false
        fila.offer("Luciene");
        fila.offer("Grazi");
        fila.offer("Enoque");

        System.out.println(fila.peek()); // Mostra o primeiro elemento da fila (retorna null se estiver vazia)
        System.out.println(fila.element()); // Mostra o primeiro elemento da fila (retorna erro)

        System.out.println(fila.poll()); // retorna o primeiro elemento e remove ele (null se nao tiver ninguem na fila)
        System.out.println(fila.remove()); //mesma coisa do pull mas retorna erro se estiver vazia

//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains(...);



    }
}
