package CursoJavaLeonardoLeitao.Generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {

        CaixaNumero<Integer> caixaA = new CaixaNumero<>();
        caixaA.guardar(5);
        System.out.println(caixaA.abrir());

    }

}
