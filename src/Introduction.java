package src;

import java.util.Scanner;

public class Introduction
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome \n:");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade\n:");
        int idade = scanner.nextInt();

        System.out.print("Digite sua nota\n:");
        double nota = scanner.nextDouble();

        scanner.close();

        System.out.printf("O seu nome é %s\nSua idade é %d\nSua nota é %.2f", nome, idade, nota);
    }
}