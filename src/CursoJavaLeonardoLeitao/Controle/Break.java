package CursoJavaLeonardoLeitao.Controle;

public class Break {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if(i == 5) {
                break; //o break interrompe a ação
            }

            System.out.println(i);
        }

        System.out.println("Fim");
    }
}
