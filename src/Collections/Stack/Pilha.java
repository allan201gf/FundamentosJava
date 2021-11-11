package Collections.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        // Este trabalha igual o Queue, mas ao contrario deste o primeiro a entrar é o ultimo a sair.

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno principe");
        livros.push("Don Quixote");
        livros.push("O hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.remove());

    }

}
