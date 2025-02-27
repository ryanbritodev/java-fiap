import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {
        double lado1, lado2, lado3;
        System.out.println("--- Tipos de Triângulos ---");
        System.out.print("Informe o tamanho do 1° lado: ");
        Scanner scanner = new Scanner(System.in);
        lado1 = scanner.nextDouble();
        System.out.print("Informe o tamanho do 2° lado: ");
        lado2 = scanner.nextDouble();
        System.out.print("Informe o tamanho do 3° lado: ");
        lado3 = scanner.nextDouble();

        if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
            System.out.println("\nTRIÂNGULO EQUILÁTERO");
        } else if (lado1 == lado2 && lado1 != lado3) {
            System.out.println("\nTRIÃNGULO ISÓSCELES");
        } else if (lado2 == lado3 && lado2 != lado1) {
            System.out.println("\nTRIÂNGULO ISÓSCELES");
        } else if (lado3 == lado1 && lado3 != lado2)   {
            System.out.println("\nTRIÂGULO ISÓSCELES");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("\nTRIÂNGULO ESCALENO");
        }
    }
}
