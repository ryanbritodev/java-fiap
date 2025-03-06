import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAMA DA TABUADA 🧮");
        System.out.print("Informe o número que deseja calcular: ");
        int valor = scanner.nextInt();
        for (int a = 1, b = 11; a < b; a++) {
            System.out.printf("%d x %d = %d\n", valor, a, valor * a);
        }
        scanner.close();
    }
}
