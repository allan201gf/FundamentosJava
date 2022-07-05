package CursoJavaLeonardoLeitao.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto"); // Adiciona o id 1
        usuarios.put(1, "Ricardo"); // substitui o id 1

        usuarios.put(2, "Allan");
        usuarios.put(3, "Paulo");
        usuarios.put(4, "Luciene");

        System.out.println(usuarios.size()); // tamanho
        System.out.println(usuarios.isEmpty()); // true se estiver vazio
        System.out.println(usuarios.keySet()); // exibe as chaves
        System.out.println(usuarios.values()); // Passa apenas os valores
        System.out.println(usuarios.entrySet()); // passa chave e valor

        System.out.println(usuarios.containsKey(1)); // True se conter a chave
        System.out.println(usuarios.containsValue("Allan")); // True se conter o valor

        System.out.println(usuarios.get(2)); // retorna o valor da chave 2
        System.out.println(usuarios.remove(3)); // Remove e exibe o que foi removido


        // Percorre as chaves
        for(int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        // Percorre sobre os valores
        for(String valor: usuarios.values()) {
            System.out.println(valor);
        }

        // Percorre tanto as chaves quanto os valores
        for(Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }

    }
}
