// Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        int valor;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        valor = scanner.nextInt();
        System.out.printf("Antecessor: %d", valor - 1);
        System.out.printf("\nSucessor: %d", valor + 1);
    }
}
