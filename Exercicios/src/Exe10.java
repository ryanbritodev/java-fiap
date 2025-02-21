import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        // Escreva um programa que declare três variáveis do tipo float e calcule a média delas. Mostre o resultado no console.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        float num1 = scanner.nextFloat();
        System.out.print("Digite o segundo valor: ");
        float num2 = scanner.nextFloat();
        System.out.print("Digite o terceiro valor: ");
        float num3 = scanner.nextFloat();
        scanner.close();

        System.out.printf("Média do Valores: %s", (num1 + num2 + num3) / 3);
    }
}
