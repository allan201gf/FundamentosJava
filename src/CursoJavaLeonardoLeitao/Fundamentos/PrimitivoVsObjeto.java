package CursoJavaLeonardoLeitao.Fundamentos;

public class PrimitivoVsObjeto {

    public static void main(String[] args) {

        String s = "texto qualquer"; //é um objeto, com notação . tem atributos e comportamentos
        String p = new String("texto"); // mesma coisa da linha de cima

        //Wrappers sdão a versão objeto dos tipos primitivos
        int a = 123; //não tem comportamento associado
        System.out.println(a);

    }
}
