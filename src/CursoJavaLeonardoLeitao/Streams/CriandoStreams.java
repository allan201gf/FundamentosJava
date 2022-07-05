package CursoJavaLeonardoLeitao.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Consumer<Integer> printI = System.out::println;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print); // exibe o langs

        String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };

        Stream.of(maisLangs).forEach(print); //Exibe o arrys
        Arrays.stream(maisLangs).forEach(print); //Exibe o arrys
        Arrays.stream(maisLangs, 1, 2).forEach(print); // Exibe o array do indice 1 até o 2 (não exibe o 2)
        System.out.println();

        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.forEach(print);
        outrasLangs.parallelStream().forEach(print); // Processa os dados em paralelo então perderá a sequencia de exibição

        // Gera a Stream de forma infinita
        //Stream.generate(() -> "a").forEach(print);
        //Stream.iterate(0, n -> n + 1).forEach(printI);




    }

}
