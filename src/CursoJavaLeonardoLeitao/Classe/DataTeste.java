package CursoJavaLeonardoLeitao.Classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 3;
        d1.mes = 8;
        d1.ano = 2021;

        Data d2 = new Data(2, 1, 1998);

        Data d3 = new Data(); // Não definimos parametros, então ela pega a data padrão que foi definida no construtor

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        System.out.println(d3.obterDataFormatada());

    }

}
