// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
// Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {

        int anos, meses, dias, anosEmDias, mesesEmDias;

        Scanner scanner = new Scanner(System.in);
        System.out.println("-------- PROGRAMA DA IDADE ---------");
        System.out.print("Digite quantos ANOS você tem de vida: ");
        anos = scanner.nextInt();
        System.out.print("Digite quantos MESES você tem de vida: ");
        meses = scanner.nextInt();
        System.out.print("Digita quantos DIAS você tem de vida: ");
        dias = scanner.nextInt();
        anosEmDias = anos * 365;
        mesesEmDias = meses * 30;
        System.out.println("Parabéns! Você possui " + (dias + anosEmDias + mesesEmDias) + " dias de vida 😄" );
    }
}