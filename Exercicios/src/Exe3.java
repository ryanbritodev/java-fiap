// Informar um saldo e imprimir o saldo com reajuste de 1%.

public class Exe3 {
    public static void main(String[] args) {
        double saldo;
        saldo = 5435.34;
        System.out.printf("Saldo Atual: R$%.2f", saldo);
        System.out.println("\nAplicando o reajuste de 1%...");
        double saldoNovo = saldo + (saldo * 0.01);
        System.out.printf("Novo Saldo: R$%.2f", saldoNovo);
    }
}
