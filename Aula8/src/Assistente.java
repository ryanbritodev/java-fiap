public class Assistente extends Funcionario {

    protected int matricula;

    public Assistente(String nome, double salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Cargo: Assistente");
        System.out.printf("Matrícula: %s\n", matricula);
    }

}