package CursoJavaLeonardoLeitao.oo.encapsulamento;

public class Pessoa {

    Pessoa(String nome, int idade) {
        setIdade(idade);
        setNome(nome);
    }

    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

}
