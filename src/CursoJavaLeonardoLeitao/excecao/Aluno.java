package CursoJavaLeonardoLeitao.excecao;

import java.util.Objects;

public class Aluno {

    public final String nome;
    public final Double nota;

    public String toString() {
        return nome + " tem nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(nota, aluno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }

    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }
}
