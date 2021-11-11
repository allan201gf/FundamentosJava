package Fundamentos.Operadores;

public class OperadoresRelacionais {

    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b);

        System.out.println(3 > 4); // maior
        System.out.println(30!= 7); // diferente
        System.out.println(3 >= 3); // maior ou igual
        System.out.println(3 < 7); // menor
        System.out.println(30 <= 7); // menor ou igual

        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);

    }
}
