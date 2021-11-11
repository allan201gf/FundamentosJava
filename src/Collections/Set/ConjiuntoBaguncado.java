package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class ConjiuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); //char -> Charectere

        System.out.println(conjunto.size()); // Tamanho do conjunto

        conjunto.add("Teste");
        System.out.println(conjunto.size()); // Continua com 5 elementos pois não aceita repetição

        System.out.println(conjunto.remove("Teste")); // Retorna true se ele conseguir remover, false se não
        System.out.println(conjunto.size()); // Tamanho vai apra 4

        System.out.println(conjunto.contains("Allan")); // Retorna true se conter dentro da Collection

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums); // Retorna os numeros

//      conjunto.addAll(nums); // União entre 2 conjuntos
        conjunto.retainAll(nums); // Faz a intercessão
        System.out.println(conjunto);

        conjunto.clear(); // Limpa o conjunto
        System.out.println(conjunto);


    }
}
