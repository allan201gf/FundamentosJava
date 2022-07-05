package CursoJavaLeonardoLeitao.Fundamentos;

// Capturar do usuario os ultimos 3 salarios e fazer a media
// pode usar tanto com ponto quanto por virgula

import java.util.Scanner;

public class DesafioConvercao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro salário: ");
        String salario1 = entrada.nextLine();

        System.out.print("Digite o segundo salário: ");
        String salario2 = entrada.nextLine();

        System.out.print("Digite o terceiro salário: ");
        String salario3 = entrada.nextLine();

        salario1 = salario1.replace(",", ".");
        salario2 = salario2.replace(",", ".");
        salario3 = salario3.replace(",", ".");

        double valorSalario1, valorSalario2, valorSalario3;

        valorSalario1 = Double.parseDouble(salario1);
        valorSalario2 = Double.parseDouble(salario2);
        valorSalario3 = Double.parseDouble(salario3);

        double media = (valorSalario1 + valorSalario2 + valorSalario3) / 3;

        System.out.printf("A média dos salários é: R$%.2f \n", media);

        entrada.close();

    }

}
