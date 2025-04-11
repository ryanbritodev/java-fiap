public class Teste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Jéssica", 50000);
        Assistente assistente = new Assistente("Ryan", 2500, 554497);
        AssistenteTecnico assistenteTecnico = new AssistenteTecnico("Pedro", 1500, 578297, 500);
        AssistenteAdministrativo assistenteAdministrativo = new AssistenteAdministrativo("Lucas", 2000, 562184, "Noturno", 250);

        gerente.exibeDados();
        System.out.println();
        assistente.exibeDados();
        System.out.println();
        assistenteTecnico.exibeDados();
        System.out.println();
        assistenteAdministrativo.exibeDados();

    }
}
