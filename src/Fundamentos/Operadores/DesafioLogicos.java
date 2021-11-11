package Fundamentos.Operadores;

public class DesafioLogicos {

    public static void main(String[] args) {

        // Trabalho na terça (v ou f)
        // Trabalho na quinta (v ou f)

        boolean trabalho1 = false;
        boolean trabalho2 = true;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2; // ou exclusivo
        boolean comprouSorvete = trabalho1 || trabalho2;

        System.out.println("Comprou Tv 50\"? " + comprouTV50);
        System.out.println("Comprou Tv 32\"? " + comprouTV32);
        System.out.println("Comprou Sorvete ? " + comprouSorvete);

        // Operador unario
        System.out.println("mais saudável? " + !comprouSorvete);

    }
}
