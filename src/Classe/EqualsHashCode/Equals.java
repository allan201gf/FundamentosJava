package Classe.EqualsHashCode;

import java.util.Date;

public class Equals {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Allan Garcia";
        u1.email = "allan201gf@gmai.com";

        Usuario u2 = new Usuario();
        u2.nome = "Allan Garcia";
        u2.email = "allan201gf@gmai.com";

        System.out.println(u1 == u2); // Retorna false pois ele compara endereços de memoria
        System.out.println(u1.equals(u2)); // Funciona devido ao objeto equals definido em usuarios

        System.out.println(u2.equals(new Date())); //Retorna false

        // Hashcode será passado em outra aula


    }
}
