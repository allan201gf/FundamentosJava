package CursoJavaLeonardoLeitao.oo.composicao.muitosPraMuitos;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java completo");
        Curso curso2 = new Curso("Web 2021");
        Curso curso3 = new Curso("React Native");

        // Adicionando aluno a partir do curso
        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        // Adicionando curso a partir do aluno
        aluno1.adicinarCurso(curso3);
        aluno2.adicinarCurso(curso3);
        aluno3.adicinarCurso(curso3);

        // Exibe as pessoas do curso
        for(Aluno aluno: curso3.alunos) {
            System.out.println("Estou matriculado no " + curso3.nome);
            System.out.println("e meu nome é " + aluno.nome);
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos); // exibe as pessoas que estudam com o aluno 1

        // Exibe todos que estão no curso de "Java Completo"
        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java completo");
        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.alunos);
        }

    }
}
