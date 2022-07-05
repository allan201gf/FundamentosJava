package CursoJavaLeonardoLeitao.Classe;

public class AreaCirc {

    double raio;

    // Static para definir a variavel pela classe
    // Final para travar a variavel e torna-la constante
    // Double para definir numero com ponto flutiante
    static final double pi = 3.14;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return raio * raio * pi;
    }

    static double area(double raio) {
        return raio * raio * pi;
    }

}
