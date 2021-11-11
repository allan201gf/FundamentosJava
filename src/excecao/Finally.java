package excecao;

import java.util.Scanner;

public class Finally {

    // Finally serve para executar um código mesmo tendo um erro ou não, no caso o close do Scanner

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println(7 / entrada.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finalmente..");
            entrada.close();
        }

        System.out.println("Fim!");
    }
}
