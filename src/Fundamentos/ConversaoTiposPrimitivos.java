package Fundamentos;

public class ConversaoTiposPrimitivos {

    public static void main(String[] args) {

        double a = 1; //conversão implicita
        System.out.println(a); // 1.0

        float b = (float) 1.2430; // Converte double para float // explicita (CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; // necessário conversão explicita

        double e = 1.0;
        int f = (int) e; // necessário conversão explicita

    }
}
