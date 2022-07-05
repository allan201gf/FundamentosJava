package CursoJavaLeonardoLeitao.Classe;

public class Data {

    // 01/01/1970
    Data() { // Caso não seja passado parametros para a data, esta será a data padrão
        dia = 1;
        mes = 1;
        ano = 1970;

    }

//    Data(int diaInicial, int mesInicial, int anoInicial) {
//        dia = diaInicial;
//        mes = mesInicial;
//        ano = anoInicial;
//    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    int dia;
    int mes;
    int ano;


    String obterDataFormatada() {
        final String formato = "%d/%d/%d"; // Constante local pois está dentro da classe
        return String.format(formato, dia, mes, ano);
    }

}
