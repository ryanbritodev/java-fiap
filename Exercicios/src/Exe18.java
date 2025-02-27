import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        Scanner scannerzinho = new Scanner(System.in);
        System.out.println("--- Cálculo de Área ---");
        System.out.print("Informe a quantidade de lados do seu polígono: ");
        int lados = scannerzinho.nextInt();
        System.out.print("Informe a medida dos lados em centímetros (cm): ");
        double tamanho = scannerzinho.nextDouble();
        if (lados == 3) {
            System.out.println("\nTRIÂNGULO");
            double area = (Math.sqrt(3) * Math.pow(tamanho, 2)) / 4;
            System.out.printf("Área do Triângulo: %.2fcm", area);
        } else if (lados == 4) {
            double area = lados * lados;
            System.out.println("\nQUADRADO");
            System.out.printf("Área do Quadrado: %.2fcm", area);
        } else if (lados == 5) {
            System.out.println("\nPENTÁGONO");
        } else if (lados < 3) {
            System.out.println("\nNÃO É UM POLÍGONO");
        } else {
            System.out.println("\nPOLÍGONO NÃO IDENTIFICADO");
        }
    }
}
