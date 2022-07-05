package CursoJavaLeonardoLeitao.oo.composicao.UmPraMuitos.allan;

public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();

        gerente.nome = "Joao";

        gerente.funcionarios.add(new Funcionarios("Joaquim", 35, "Assistente"));
        gerente.funcionarios.add(new Funcionarios("Isabela", 23, "Auxiliar"));
        gerente.funcionarios.add(new Funcionarios("Pedro", 25, "Assistente"));
        gerente.funcionarios.add(new Funcionarios("Paulo", 43, "Coordenador"));
        gerente.funcionarios.add(new Funcionarios("Roberto", 22, "Auxiliar"));

        gerente.contratar("Allan", 23, "Assistente");

        System.out.println(gerente.mediaIdadeFuncionarios());
        System.out.println(gerente.totalFuncionarios());
        System.out.println(gerente.quantidadeNoCargo("Auxiliar"));
        System.out.println(gerente.quantidadeNoCargo("Coordenador"));

        System.out.println(gerente.totalFuncionarios());

//        gerente.exibirFuncionarios();

        gerente.demitirUltimoContratado();

        gerente.exibirFuncionarios();



    }
}
