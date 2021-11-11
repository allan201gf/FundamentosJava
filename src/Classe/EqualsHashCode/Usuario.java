package Classe.EqualsHashCode;

import java.util.Objects;

public class Usuario {

    String nome;
    String email;

    // Utilizando o codigo abaixo, o equals funciona

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
