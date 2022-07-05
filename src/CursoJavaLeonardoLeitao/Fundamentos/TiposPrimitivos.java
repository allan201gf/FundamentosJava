package CursoJavaLeonardoLeitao.Fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Informações do funcionario

        // Tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56889;
        long pontosAcumulados = 3234845223L; // colocar "L" no final para dizer que é um long, sempre que passar a quantidade dos interios

        // Tipos numericos reais
        float salario = 11445.44F; // colocar "F" para dizer que é float pois o padrão é double
        double vendasAcumuladas = 2991797103.43;

        // Tipo booleano
        boolean estaDeFerias = false; //true

        //Tipo caractere
        char status = 'a'; // ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Numero de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        // Salario do ID
        System.out.println(id + ": fanha -> R$ " + salario);

        // Férias
        System.out.println("Férias? " + estaDeFerias);

        // Status
        System.out.println("Status: " + status);

    }

}
