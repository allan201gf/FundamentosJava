package CursoJavaLeonardoLeitao.Controle;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = entrada.nextDouble();

        if (media >= 7) {
            System.out.println("Passou de ano");
        } else if (media >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
