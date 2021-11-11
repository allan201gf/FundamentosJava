package Classe.DesafioDoModulo;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    String comer(Comida nomeComida) {
        this.peso += nomeComida.pesoComida;
        return "Novo peso do " + this.nome + ": " + this.peso;
    }

}
