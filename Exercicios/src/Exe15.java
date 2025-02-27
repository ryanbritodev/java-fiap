import java.util.Arrays;
import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        int primeiroValor;
        int segundoValor;
        int terceiroValor;

        Scanner scanner = new Scanner(System.in);
        System.out.print("1° valor: ");
        primeiroValor = scanner.nextInt();
        System.out.print("2° valor: ");
        segundoValor = scanner.nextInt();
        System.out.print("3° valor: ");
        terceiroValor = scanner.nextInt();

        scanner.close();

        int[] arrayValores = {primeiroValor, segundoValor, terceiroValor};

        Arrays.sort(arrayValores);

        System.out.println("Números Ordenados:");
        for (int numero : arrayValores) {
            System.out.print(numero + " ");
        }
    }
}
