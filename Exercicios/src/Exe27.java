import java.util.Scanner;

public class Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor inicial: ");
        int valorInicial = scanner.nextInt();
        System.out.print("Informe o valor final: ");
        int valorFinal = scanner.nextInt();

        int valorAnterior = 1;

        System.out.println("Valores no intervalo especificado 👇🏻");
        for (int a = valorInicial; a < valorFinal + 1; a++) {
            int temp = a * valorAnterior;
            System.out.println(temp);
            valorAnterior = temp;
        }
        scanner.close();
    }
}
