package src;

import java.util.Scanner;

public class Classe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota\n:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite outra nota\n:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite sua última nota\n:");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        String situacao;

        if (media >= 6) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }
        System.out.printf("Sua primeira nota é %s\nSua segunda nota é %s\nSua terceira nota é %s\nSua média é %.2f\nE sua situação é %s", nota1, nota2, nota3, media, situacao);
    }
}
