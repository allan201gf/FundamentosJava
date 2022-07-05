package CursoJavaLeonardoLeitao.Fundamentos;

public class AreaCircuferencia {

    public static void main(String[] args) {

        double raio = 3.4;
        final double Pi = 3.14159; // "final" trava a variável e torna ela uma constante, letra maiúscula para constante

        double area = Pi * raio * raio;


        System.out.println("A Área é " + area);

    }
}
