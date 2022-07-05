package CursoJavaLeonardoLeitao.Fundamentos.Operadores;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        // Fazer potencia
        int a = 2;
        int b = (int) Math.pow(a, 3); // elevar "a" ^ 3
        double c = Math.pow(a, 3); // elevar "a" ^ 3

        // (6 * (3 + 2))² / (3 * 2)
        int exprecao1 = (int) Math.pow(((3 + 2) * 6), 2);
        exprecao1 = exprecao1 / (3 * 2);

        // ((1-5) * (2-7) / 2)²
        int exprecao2 = (int) Math.pow(((1-5) * (2-7) / 2), 2);

        // (exprecao1 - exprecao2)³
        int exprecao3 = (int) Math.pow((exprecao1 - exprecao2), 3);

        // exprecao3 / 10³
        int exprecao4 = (int) (exprecao3 / Math.pow(10, 3));

        System.out.println(exprecao4);


    }
}
