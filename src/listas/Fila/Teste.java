package listas.Fila;

public class Teste {

    public static void main(String[] args) {
        Fila<String> fila = new Fila();
        String aluno = "Aluno 1";
        String aluno2 = "Aluno 2";
        fila.insere(aluno);
        fila.insere(aluno2);

        System.out.println(fila);

        System.out.println(fila.vazia());

        String alunoRemovido = fila.remove();

        System.out.println(fila.vazia());

    }

}
