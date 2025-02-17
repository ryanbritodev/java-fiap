// Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A,
// em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura. Vamos declarar as
// variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e de raio. Agora
// vamos escrever a fórmula, conforme dita no enunciado e, em seguida, exibir na tela uma mensagem contendo o resultado.

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o raio da sua lata de óleo: ");
        double raio = scanner.nextDouble();
        System.out.print("Informe a altura da sua lata de óleo: ");
        double altura = scanner.nextDouble();
        System.out.printf("O valor do volume da sua lata de óleo é: %.2f", (3.14159 * raio * raio * altura));
        scanner.close();
    }
}
