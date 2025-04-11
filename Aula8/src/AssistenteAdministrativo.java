public class AssistenteAdministrativo extends Assistente {

    protected String turno;
    private final double adicionalNoturno;

    // Construtores

    // Construtor Padrão
    public AssistenteAdministrativo(String nome, double salario, int matricula) {
        super(nome, salario, matricula);
        this.turno = "Diurno";
        this.adicionalNoturno = 0;
    }

    // Construtor Genérico
    public AssistenteAdministrativo(String nome, double salario, int matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        if (turno.equalsIgnoreCase("noturno")) {
            System.out.printf("Salário + Adicional Noturno: R$%.2f\n", getSalario() + adicionalNoturno);
            System.out.printf("Adicional Noturno: R$%.2f\n", adicionalNoturno);
        }
        System.out.printf("Turno: %s\n", turno);
        System.out.println("Categoria: Administrativo");
    }
}
