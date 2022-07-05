package CursoJavaLeonardoLeitao;/*
 * Jogo da velha desemvolvido em Java;
 * O jogo funciona apenas através do console;
 *
 * Nome das posições no tabuleiro para fazer as jogadas
 *
 * A1/A2/A3
 * B1/B2/B3
 * C1/C2/C3
 *
 * Desenvolvido por Allan Garcia Ferreira.
 *
 * A incrementar:
 * 1) opção de empate
 * 2) melhorar a estrutura do código
 *
 */

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        // Define as variaveis iniciais
        Scanner entrada = new Scanner(System.in);
        String[][] posicao = new String[3][3];
        boolean alguemGanhou = false;
        String jogadorX = "";
        String jogadorO = "";
        String jogada = "";
        String ganhador = "";

        // a resposta pode ser maiuscula ou minuscula
        System.out.print("Quer iniciar o jogo? (S / N): ");
        String jogar = entrada.nextLine();


        if (jogar.toUpperCase().equals("S")) {



            // Coletar nome dos jogadores
            System.out.print("Digite o nome do X: ");
            jogadorX = entrada.nextLine();

            System.out.print("Digite o nome do O: ");
            jogadorO = entrada.nextLine();

            // Zera as posicoes para começar o jogo
            posicao[0][0] = "-";
            posicao[0][1] = "-";
            posicao[0][2] = "-";
            posicao[1][0] = "-";
            posicao[1][1] = "-";
            posicao[1][2] = "-";
            posicao[2][0] = "-";
            posicao[2][1] = "-";
            posicao[2][2] = "-";

            // Laço de repetição para continuar o jogo até existir um ganhador
            while (alguemGanhou == false) {

                // Solicitar a jogada do jogador X
                System.out.print(jogadorX + " faça sua jogada ");
                jogada = entrada.nextLine();

                // Faz a marcação do JogadorX
                switch (jogada) {
                    case "A1" -> posicao[0][0] = "X";
                    case "A2" -> posicao[0][1] = "X";
                    case "A3" -> posicao[0][2] = "X";
                    case "B1" -> posicao[1][0] = "X";
                    case "B2" -> posicao[1][1] = "X";
                    case "B3" -> posicao[1][2] = "X";
                    case "C1" -> posicao[2][0] = "X";
                    case "C2" -> posicao[2][1] = "X";
                    case "C3" -> posicao[2][2] = "X";
                }

                // Ebibe o tabuleiro com a ultima jogada
                System.out.println(posicao[0][0] + "/" + posicao[0][1]  + "/" + posicao[0][2] );
                System.out.println(posicao[1][0] + "/" + posicao[1][1]  + "/" + posicao[1][2] );
                System.out.println(posicao[2][0] + "/" + posicao[2][1]  + "/" + posicao[2][2] );

                // Verifica se o Jogador X ganhou
                if (posicao[1][0] == "X" && posicao[1][1] == "X" && posicao[1][2] == "X") {
                    ganhador = jogadorX;
                    alguemGanhou = true;
                    break;
                }
                if (posicao[2][0] == "X" && posicao[2][1] == "X" && posicao[2][2] == "X") {
                    ganhador = jogadorX;
                    alguemGanhou = true;
                    break;
                }
                if (posicao[0][0] == "X" && posicao[1][0] == "X" && posicao[2][0] == "X") {
                    ganhador = jogadorX;
                    alguemGanhou = true;
                    break;
                }
                if (posicao[0][1] == "X" && posicao[1][1] == "X" && posicao[2][1] == "X") {
                    ganhador = jogadorX;
                    alguemGanhou = true;
                    break;
                }
                if (posicao[0][2] == "X" && posicao[1][2] == "X" && posicao[2][2] == "X") {
                    ganhador = jogadorX;
                    alguemGanhou = true;
                    break;
                }
                if (posicao[0][0] == "X" && posicao[1][1] == "X" && posicao[2][2] == "X") {
                    ganhador = jogadorX;
                    alguemGanhou = true;
                    break;
                }
                if (posicao[0][2] == "X" && posicao[1][1] == "X" && posicao[2][0] == "X") {
                    ganhador = jogadorX;
                    alguemGanhou = true;
                    break;
                }

                System.out.print(jogadorO + " faça sua jogada ");
                jogada = entrada.nextLine();

                // Faz a marcação do JogadorO
                switch (jogada) {
                    case "A1" -> posicao[0][0] = "O";
                    case "A2" -> posicao[0][1] = "O";
                    case "A3" -> posicao[0][2] = "O";
                    case "B1" -> posicao[1][0] = "O";
                    case "B2" -> posicao[1][1] = "O";
                    case "B3" -> posicao[1][2] = "O";
                    case "C1" -> posicao[2][0] = "O";
                    case "C2" -> posicao[2][1] = "O";
                    case "C3" -> posicao[2][2] = "O";
                }

                // Ebibe o tabuleiro com a ultima jogada
                System.out.println(posicao[0][0] + "/" + posicao[0][1]  + "/" + posicao[0][2] );
                System.out.println(posicao[1][0] + "/" + posicao[1][1]  + "/" + posicao[1][2] );
                System.out.println(posicao[2][0] + "/" + posicao[2][1]  + "/" + posicao[2][2] );

                // Verifica se o jogador O ganhou
                if (posicao[0][0] == "O" && posicao[0][1] == "O" && posicao[0][2] == "O") {
                    ganhador = jogadorO;
                    alguemGanhou = true;
                    break;
                }
                if (posicao[1][0] == "O" && posicao[1][1] == "O" && posicao[1][2] == "O") {
                    ganhador = jogadorO;
                    alguemGanhou = true;
                    break;
                }
                if (posicao[2][0] == "O" && posicao[2][1] == "O" && posicao[2][2] == "O") {
                    ganhador = jogadorO;
                    alguemGanhou = true;
                    break;
                }
                if (posicao[0][0] == "O" && posicao[1][0] == "O" && posicao[2][0] == "O") {
                    ganhador = jogadorO;
                    alguemGanhou = true;
                    break;
                }
                if (posicao[0][1] == "O" && posicao[1][1] == "O" && posicao[2][1] == "O") {
                    ganhador = jogadorO;
                    alguemGanhou = true;
                    break;
                }
                if (posicao[0][2] == "O" && posicao[1][2] == "O" && posicao[2][2] == "O") {
                    ganhador = jogadorO;
                    alguemGanhou = true;
                    break;
                }
                if (posicao[0][0] == "O" && posicao[1][1] == "O" && posicao[2][2] == "O") {
                    ganhador = jogadorO;
                    alguemGanhou = true;
                    break;
                }
                if (posicao[0][2] == "O" && posicao[1][1] == "O" && posicao[2][0] == "O") {
                    ganhador = jogadorO;
                    alguemGanhou = true;
                    break;
                }


            }

            // Exibe o ganhador
            System.out.println("O ganhador é " + ganhador + "!!!!");

        } else {

            // Fecha o jogo caso a opção seja não jogar
            System.out.println("Jogo fechado");

        }

        entrada.close();

        }

}
