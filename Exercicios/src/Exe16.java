import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        double altura;
        double peso;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---- Calcular Peso Ideal ----");
            System.out.println("1. Feminino");
            System.out.println("2. Masculino");
            System.out.print("> ");
            int opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.print("\nInforme sua altura: ");
                altura = scanner.nextDouble();
                peso = (62.1 * altura) - 44.7;
                break;
            } else if (opcao == 2) {
                System.out.print("\nInforme sua altura: ");
                altura = scanner.nextDouble();
                peso = (72.7 * altura) - 58;
                break;
            } else {
                System.out.println("\nOpção inválida! Tente novamente\n");
            }
        }

        System.out.printf("\nO seu peso ideal é %.2fkg", peso);
    }
}
