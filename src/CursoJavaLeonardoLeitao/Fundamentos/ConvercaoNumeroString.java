package CursoJavaLeonardoLeitao.Fundamentos;

public class ConvercaoNumeroString {

    public static void main(String[] args) {

        Integer num1 = 10000;
        System.out.println(num1.toString()); //converte numero para String

        int num2 = 100000;
        System.out.println(Integer.toString(num2)); //converte numero para String

        System.out.println(("") + num2); //converte numero para String

    }
}
