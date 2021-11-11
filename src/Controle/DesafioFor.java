package Controle;

public class DesafioFor {

    public static void main(String[] args) {

        StringBuilder valor = new StringBuilder("#");

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(valor);
//            valor+= "#";
//        }

        // Versão do desafio
        // Não pode usar valor numérico para controlar o laço

        for (; valor.length() <= 5;) {
            System.out.println(valor);
            valor.append("#");
        }

    }
}
