public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void exibeDados() {
        System.out.println("Dados do Funcionário");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Salário: R$%.2f\n", salario);
    }

}
