// Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K),
// Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8;
// Ra = C * 1.8 + 32 + 459.67

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um valor em Graus Celsius (°C): ");
        double valorCelsius = scanner.nextDouble();
        System.out.printf("Valor em Kelvin (K): %.2fK", (valorCelsius + 273.15));
        System.out.printf("\nValor em Réaumur (Re): %.2fRe", (valorCelsius * 0.8));
        System.out.printf("\nValor em Rankine (Ra): %.2fRa", (valorCelsius * 1.8 + 32 + 459.67));
        System.out.printf("\nValor em Fahrenheit (F): %.2fF", (valorCelsius * 1.8 + 32));
    }
}
