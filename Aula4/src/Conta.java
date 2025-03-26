import java.util.Scanner;

// Usando o encapsulamento
public class Conta {

    private String nome;
    private int conta, saques;
    private double saldo;
    Scanner entrada = new Scanner(System.in);

    public Conta(String nome, int conta, double saldo_inicial) {
        this.nome = nome;
        this.conta = conta;
        saldo = saldo_inicial;
        saques = 0;

    }

    // É similar a função GET, pois, "estamos pegando dados"
    public void extrato(){
        System.out.println("\tEXTRATO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número da Conta: " + this.conta);
        System.out.printf("Saldo: R$%.2f\n", this.saldo);
        System.out.println("Saques realizados hoje: " + this.saques + "\n");
    }

    // É similar a função SET, pois, "estamos alterando valores"
    public void sacar(double valor){
        if (saldo>=valor){
            saldo -= valor;
            saques++;
            System.out.println("Valor Sacado: R$" + valor);
            System.out.println("Saldo Atualizado: R$" + saldo + "\n");
        } else {
            System.out.println("Atenção!!! Saldo da conta insuficiente. Faça um depósito\n");
        }
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depositado: R$" + valor);
        System.out.println("Novo Saldo: R$" + saldo + "\n");
    }

    public void iniciar(){
        int opcao;

        do {
            exibeMenu();
            opcao = entrada.nextInt();
            escolheOpcao(opcao);
        } while (opcao!=4);

    }

    public void exibeMenu(){
        System.out.println("\t Escolha a opção desejada:");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair");
        System.out.print("Opção: ");
    }

    public void escolheOpcao(int opcao) {
        double valor;
        switch (opcao) {
            case 1:
                extrato();
                break;
            case 2:
                if(saques<3){
                    System.out.print("Quanto deseja sacar? Informe o valor: R$");
                    valor = entrada.nextDouble();
                    sacar(valor);
                } else {
                    System.out.println("Limite de saques diário excedido");
                }
                break;
            case 3:
                System.out.print("Quanto você deseja depositar? Informe o valor: R$");
                valor = entrada.nextDouble();
                depositar(valor);
                break;
            case 4:
                System.out.println("Sistema encerrado");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

}
