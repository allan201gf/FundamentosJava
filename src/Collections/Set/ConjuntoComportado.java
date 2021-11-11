package Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

//        Set<String> lista = new HashSet<String>(); // APenas string
        Set<String> lista = new TreeSet<String>(); // APenas string e com o Tree ele ordena a lista

        lista.add("Allan");
        lista.add("Carlos");
        lista.add("Ana");
        lista.add("Pedro");

        for(String candidato: lista) {
            System.out.println(candidato);
        }

        System.out.println(lista);



    }
}
