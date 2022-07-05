package CursoJavaLeonardoLeitao.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        Integer total1 = nums.stream().reduce(soma).get();
        System.out.println(total1);

        Integer total2 = nums.stream().reduce(0, soma); // passando um valor inicial, não é necessario usar o get
        System.out.println(total2);

        //Resultado foi um Opcional<Integer>...
        nums.stream()
                .filter(n -> n > 5)
                .reduce(soma) //vai somar os valores maiores que 5
                .ifPresent(System.out::println); // se tiver presente chama a função

    }

}
