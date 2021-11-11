package Fundamentos;

public class NotacaoPonto {

    public static void main(String[] args) {

        double a = 2.4;

        String s = "Bom dia X";
        s = s.toUpperCase(); // Deixa o texto maiúsculo
        s = s.replace("X", "Senhora"); // Troca X por senhora
        s = s.concat("!!!"); // Concatema com o texto

        System.out.println(s);

        System.out.println("Allan".toUpperCase()); //transforma o texto direto em maiusculas

        String y = "Bom dia X"
                .replace("X", "Allan")
                .toUpperCase()
                .concat("!!!");

        System.out.println(y);

        //Tipos primitivos não tem o operador "."

    }
}
