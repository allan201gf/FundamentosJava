package Classe;

public class DesafioPrimeiroTrauma {

    int a = 3; // Não pode mexer aqui

    static int b = 4;

    public static void main(String[] args) {

        // Aqui pode mecher

        // Para conseguir acessar a variavel "a" fora do metodo.
        DesafioPrimeiroTrauma p = new DesafioPrimeiroTrauma();

        System.out.println(p.a);
        System.out.println(b);

    }


}
