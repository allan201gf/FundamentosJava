package CursoJavaLeonardoLeitao.Fundamentos;

public class TipoString {

    public static void main(String[] args) {

        System.out.println("Olá pessoal".charAt(0)); // Letra no indice 0

        String s = "Boa tarde!";
        System.out.println(s.concat("!!!")); // Concatenar

        System.out.println("Boa tarde" + "!!!"); //Concatenar

        System.out.println(s.startsWith("tarde")); //Retorna true se a frase começa com "Tarde"

        System.out.println(s.length()); //Comprimento da String

        System.out.println(s.endsWith("tarde!")); // Retorna true se termina com "tarde!"

        System.out.println(s.equals("Boa tarde!")); //Retorna true se for igual

        System.out.println(s.equalsIgnoreCase("boa tarde!")); // Retorna true se for igual, minuscula ou maiuscula

        var nome = "Allan"; // Associa a uma String
        var sobrenome = "Ferreira";
        var idade = 23; // Tipo Inteiro
        var salario = 1500.54;

        System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f \n",
                nome, sobrenome, idade, salario); // Nome: Allan Ferreira tem 23 anos e ganha R$1500,54

        System.out.println("Frase qualquer".contains("qual")); //Retorna true se dentro da frase conter "qual"

        System.out.println("Frase qualquer".indexOf("qual")); // Mostra o indice que começa a palavra digitada

        System.out.println("Frase qualquer".substring(6)); //Exibe a partir do indice 6

        System.out.println("Frase qualquer".substring(6, 8)); // Exibew do indice 6 até 8 (Não exibe o numero 8)


    }
}
