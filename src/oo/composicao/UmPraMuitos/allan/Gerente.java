package oo.composicao.UmPraMuitos.allan;

import java.util.ArrayList;
import java.util.Objects;

public class Gerente {

    String nome;

    ArrayList<Funcionarios> funcionarios = new ArrayList<>();

    double mediaIdadeFuncionarios() {
        double media = 0;
        double total = 0;

        for(Funcionarios idade: funcionarios) {
            total += idade.idade;

        }

        total = total / funcionarios.size();

        return total;

    }

    int totalFuncionarios() {
        return funcionarios.size();
    }

    int quantidadeNoCargo(String cargo) {
        int total = 0;
        for (Funcionarios funcionario: funcionarios) {
            if (Objects.equals(funcionario.cargo, cargo)) {
                total++;
            }
        }
        return total;
    }

    void contratar(String nome, int idade, String cargo) {
        funcionarios.add(new Funcionarios(nome, idade, cargo));
    }

    void demitirUltimoContratado() {
        funcionarios.remove(funcionarios.size()-1);
    }

    void exibirFuncionarios() {
        for(Funcionarios funcionario: funcionarios) {
            System.out.printf(funcionario.nome + " " + funcionario.idade + " " + funcionario.cargo + "\n");
        }
    }


}
