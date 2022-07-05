package CursoJavaLeonardoLeitao.excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) throws Exception {

        try {
            geraErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        geraErro2();

        System.out.println("Fim!");

    }

    // Não checada ou não verificada
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro #01");
    }

    // Exceção checada ou verificada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro #02");
    }

}
