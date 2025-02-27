import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        double angulo1, angulo2, angulo3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Ângulos de um Triângulo ---");
        System.out.print("Informe o primeiro ângulo: ");
        angulo1 = scanner.nextDouble();
        System.out.print("Informe o segundo ângulo: ");
        angulo2 = scanner.nextDouble();
        System.out.print("Informe o terceiro ângulo: ");
        angulo3 = scanner.nextDouble();

        double[] listaAngulos = {angulo1, angulo2, angulo3};

        for (int i = 0; listaAngulos.length > i; i++) {
            if (listaAngulos[i] == 90) {
                System.out.println("\nTRIÂNGULO RETÂNGULO");
                break;
            } else if (listaAngulos[i] > 90) {
                System.out.println("\nTRIÂNGULO OBTUSÂNGULO");
                break;
            }
        }

        if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
            System.out.println("\nTRIÂNGULO ACUTÂNGULO");
        }
    }
}
