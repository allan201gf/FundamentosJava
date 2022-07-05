package CursoJavaLeonardoLeitao.Fundamentos;

public class TipoStringEquals {

    public static void main(String[] args) {

        System.out.println("s" == "s"); // retorna true

        String s = new String("s");
        System.out.println("s" == s); //retorna false mesmo que o conteudo seja verdadeiro

        System.out.println("s".equals(s)); // equals compara apenas o conteudo, então retorna true

        System.out.println("s".equals("  s  ".trim())); // o trim remove todos os espaços, portanto é true
    }
}
