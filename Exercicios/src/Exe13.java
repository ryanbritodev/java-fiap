public class Exe13 {
    public static void main(String[] args) {
        // Crie um programa que faça narrowing casting de um float para um int.
        // Explique o que acontece com o valor após a conversão.

        float valorEmFloat = 5.2f;
        int valorEmInt = (int) valorEmFloat;
        System.out.println("Valor em Float: " + valorEmFloat);
        System.out.println("Valor em Int: " + valorEmInt);
    }
}
