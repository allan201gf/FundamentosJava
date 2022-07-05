package CursoJavaLeonardoLeitao.Collections.List;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        // Para as comparações é necessario usar o HashCode

        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Allan"));
        lista.add(new Usuario("Grazi"));
        lista.add(new Usuario("Luciene"));
        lista.add(new Usuario("Paulo"));
        lista.add(new Usuario("Enoque"));

        // Exibe o indice 3
        System.out.println(lista.get(3));

        lista.remove(1); // remove pelo indice e retorna o valor removido
        lista.remove(new Usuario("Paulo")); // Remove pelo objeto

        System.out.println("Tem ? " + lista.contains(new Usuario("Luciene"))); // Retorna true se contem

        for (Usuario u: lista) {
            System.out.println(u.nome);
        }

    }
}
