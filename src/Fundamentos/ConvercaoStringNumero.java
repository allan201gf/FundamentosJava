package Fundamentos;

import javax.swing.*;

public class ConvercaoStringNumero {

    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número"); // exibe janela para o usuario digitar texto
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número");

        System.out.println(valor1 + valor2); // Faz uma concatenação pos os valores são string

        double numero1 = Double.parseDouble(valor1); // Converte de string para double
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;

        System.out.println("Soma é " + soma);

    }
}
