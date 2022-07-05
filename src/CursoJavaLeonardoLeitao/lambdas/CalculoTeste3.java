package CursoJavaLeonardoLeitao.lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {

        //NÃO int -> Double
        //double -> Double

        BinaryOperator<Double> calculo = (x, y) -> { // Não precisa definir uma interface calculo
          return x + y;
        };

        System.out.println(calculo.apply(2.0, 3.0));

        BinaryOperator<Integer> calculo2 = (x, y) -> { // Não precisa definir uma interface calculo
            return x + y;
        };

        System.out.println(calculo2.apply(2, 3));

        calculo = (x, y) -> x * y;

        System.out.println(calculo.apply(2.0, 3.0));


    }

}
