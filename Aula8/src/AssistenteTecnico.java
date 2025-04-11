public class AssistenteTecnico extends Assistente {
    private final double bonus;

    public AssistenteTecnico(String nome, double salario, int matricula, double bonus) {
        super(nome, salario, matricula);
        this.bonus = bonus;
    }


    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.printf("Salário + Bônus: R$%.2f\n", salario + bonus);
        System.out.println("Categoria: Técnico");
        System.out.printf("Bônus: R$%.2f\n", bonus);
    }

}
