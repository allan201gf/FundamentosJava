package Controle;

public class Continue {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue; // Interrompe esta repetição e vai para a proxima, ou seja não deixara exibir os valores impares
            }

            System.out.println(i);
        }
    }
}
