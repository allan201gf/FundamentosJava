package CursoJavaLeonardoLeitao.Classe;

public class ValorVsReferencia {

    public static void main(String[] args) {

        double a = 2;
        double b = a; // Atribuição por valor

        a++;
        b--;

        System.out.println(a + " " + b); // retorna 3 e 1

        Data d1 = new Data(1,6,2022);
        Data d2 = d1; // Atribuição por referencia (objeto)

        d1.dia = 31;
        d2.mes = 12;

        // Retornam as datas iguais, as duas variaveis apontam para o mesmo endereço em memoria.
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        // Volta para a data
        voltarDataParaValorPadrao(d1);

        // Retornam as datas iguais, as duas variaveis apontam para o mesmo endereço em memoria.
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c); //Continua sendo 5, pois é primitivo

    }

    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a) {
        a++;
    }

}
