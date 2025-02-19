import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        // Escreva um programa que peça ao usuário para inserir um número em
        // formato de string e converta esse valor para int, double e boolean. Imprima os resultados.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva um número em formato de String: ");
        String numeroEmString = scanner.nextLine();
        int numeroEmInt = Integer.parseInt(numeroEmString);
        double numeroEmDouble = Double.parseDouble(numeroEmString);
        boolean numeroEmBoolean = Boolean.parseBoolean(numeroEmString);

        System.out.println("\nNúmero em Int: " + numeroEmInt);
        System.out.println("Número em Double: " + numeroEmDouble);
        System.out.println("Número em Boolean: " + numeroEmBoolean);

    }
}
