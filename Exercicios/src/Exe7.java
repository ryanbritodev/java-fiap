// Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários
// e os salários, e devolvendo a média salarial. Utilize apenas 3 salários.

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do 1° funcionário: ");
        String funcionario1 = scanner.nextLine();
        System.out.print("Informe o salário do 1° funcionário: R$");
        double salarioFuncionario1 = scanner.nextDouble();
        System.out.print("Informe o nome do 2° funcionário: ");
        scanner.nextLine();
        String funcionario2 = scanner.nextLine();
        System.out.print("Informe o salário do 2° funcionário: R$");
        double salarioFuncionario2 = scanner.nextDouble();
        System.out.print("Informe o nome do 3° funcionário: ");
        scanner.nextLine();
        String funcionario3 = scanner.nextLine();
        System.out.print("Informe o salário do 3° funcionário: R$");
        double salarioFuncionario3 = scanner.nextDouble();
        System.out.printf("A média salarial entre os funcionários %s, %s e %s é de R$%.2f", funcionario1, funcionario2, funcionario3, (salarioFuncionario1 + salarioFuncionario2 + salarioFuncionario3) / 3);
    }
}
