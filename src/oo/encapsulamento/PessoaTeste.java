package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Allan", -30);
//        p1.idade = -30; // altera variavel
//        System.out.println(p1.idade); // Lê variavel

        p1.setIdade(25);

        System.out.println(p1.getIdade());

    }
}
