// Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a
// quantidade de salários mínimos esse usuário ganha e imprima o resultado.

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        double salarioMinimo, salarioUsuario;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o salário mínimo do ano atual: ");
        salarioMinimo = scanner.nextDouble();
        System.out.print("Informe o seu salário: ");
        salarioUsuario = scanner.nextDouble();
        double quantidadeDeSalariosMinimos = salarioUsuario / salarioMinimo;
        String quantiadeDeSalariosMinimosFormatado = String.valueOf(quantidadeDeSalariosMinimos).replace(",", ".").substring(0, 4);

        System.out.printf("O salário do usuário corresponde a %sX salários mínimos", quantiadeDeSalariosMinimosFormatado);
    }
}
