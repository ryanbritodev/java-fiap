import java.util.Scanner;
import java.util.Random; // Números aleatórios

public class Caixa {
    public static void main(String[] args) {

        // Encapsulamento ---> Segurança

        // Modificadores de acesso

        // public ----> Sem proteção (tanto método quanto atributo)
        // Pode ser acessado/enxergado por qualquer outro método ou atributo

        // protected ---->
        // private ----> Com proteção (está "encapsulado", acesso ao método ou atributo é limitado)


        String nome;
        double inicial;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Através do comando abaixo, nós sorteamos um número
        // de conta de 4 dígitos, gerando números de 0 até 9998 (somando + 1)
        int conta = 1 + random.nextInt(9999);
        System.out.println("Cadastrando um novo cliente...");
        System.out.print("Digite o nome do cliente: ");
        nome = scanner.nextLine();
        System.out.print("Digite o valor inicial depositado na conta: R$");
        inicial = scanner.nextDouble();

        Conta minhaConta = new Conta(nome, conta, inicial);

        minhaConta.iniciar();
        scanner.close();

    }
}