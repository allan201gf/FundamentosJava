package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        // Forma que faziamos anteriormente
        System.out.println("Usando o for");
        for (int i = 0; i < aprovados.size() ; i++) {
            System.out.println(aprovados.get(i));
        }

        System.out.println("\nUsando o foreach");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }

        System.out.println("\nUsando o Iterator");
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nUsando Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); //Laço interno!!

    }

}
