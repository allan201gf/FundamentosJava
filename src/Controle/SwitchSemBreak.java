package Controle;

public class SwitchSemBreak {

    public static void main(String[] args) {

        String faixa = "marrom";

        // o switch quando encontra a condição verdadeira ele executa as de baixo também

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("A faixa é preta e as debaixo");
            case "marrom":
                System.out.println("A faixa é marrom e as debaixo");
            case "roxa":
                System.out.println("A faixa é roxa e as debaixo");
            case "verde":
                System.out.println("A faixa é verde e as debaixo");
            case "laranja":
                System.out.println("A faixa é laranja e as debaixo");
            case "vermelha":
                System.out.println("A faixa é vermelha e as debaixo");
            case "amarela":
                System.out.println("A faixa é amarela e as debaixo");
                break;
            default:
                System.out.println("Nenhuma faixa");

        }
    }
}
