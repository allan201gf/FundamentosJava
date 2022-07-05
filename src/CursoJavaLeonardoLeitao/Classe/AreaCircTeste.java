package CursoJavaLeonardoLeitao.Classe;

public class AreaCircTeste {


    public static void main(String[] args) {

        AreaCirc a = new AreaCirc(5.6);

        System.out.println(a.area());
        System.out.println(AreaCirc.area(100));

        int aa = 2;
        int bb = aa;

        aa++;
        bb--;
        System.out.println(aa);
        System.out.println(bb);


    }
}
