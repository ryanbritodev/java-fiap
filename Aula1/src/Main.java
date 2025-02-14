// Comentário

/*
Comentário
em
múltiplas
linhas
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System = em maiúsculo pq é um objeto
        // out = output
        // System.out.println("Palmeiras NÃO tem mundial");
        // System.out.println("VAI CORINTHIANS!!!");

        String nome, endereco;
        int idade;

        int numero = 11;
        numero++;
        System.out.println(numero);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite seu endereço: ");
        endereco = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        System.out.printf("Muito prazer, %s! Você mora na %s e tem %d anos de idade!", nome, endereco, idade);
    }
}