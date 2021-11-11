package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    // Ler num1
    // Ler num2
    // ler a operação (+,-,*,/,%)
    // Mostrar o resultado

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        Double num1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        Double num2 = entrada.nextDouble();

        System.out.print("Qual operação deseja fazer? ( =, -, *, /, % ): ");
        String operacao = entrada.next();

        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        System.out.println(resultado);


    }
}
