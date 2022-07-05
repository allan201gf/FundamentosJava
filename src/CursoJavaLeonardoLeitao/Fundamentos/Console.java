package CursoJavaLeonardoLeitao.Fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Entrada pelo console

        System.out.print("QUal seu nome? ");

        String nome = entrada.nextLine();

        //Pode ser utilizado nextInt(), etc.. para outros tipos

        System.out.println("O seu nome é: " + nome);

        entrada.close(); //Quando parar de usar o Scanner passar esse comando para para-lo e não consumir recursos


    }
}
