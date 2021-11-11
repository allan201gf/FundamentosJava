package Fundamentos;

public class Inferencia {

    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);


        // Podemos definir a variável sem dizer o tipo, o propria java define o tipo,
        // mas nas podemos redefinir a variável mudando o tipo, por exemplo, de double para ‘string’
        var b = 4.5;
        System.out.println(b);

        var c = "texto";
        System.out.println(c);
    }
}
