import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorInicial, valorFinal;
        System.out.print("Informe o valor inicial: ");
        valorInicial = scanner.nextInt();
        System.out.print("Informe o valor final: ");
        valorFinal = scanner.nextInt();
        System.out.println("Valores 👇🏻");
        for (int a = valorInicial, b = valorFinal + 1; a < b; a++) {
            System.out.println(a);
        }
        scanner.close();
    }
}
