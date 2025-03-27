public class BibliotecaDeJogos {
    public static void main(String[] args) {

        Jogo grandTheftAutoV = new Jogo("Grand Theft Auto V", 70, "Ação", 2013, 250);
        grandTheftAutoV.exibirInformacoes();

        grandTheftAutoV.setPreco(9999);
        System.out.print("\n\nValor do Jogo (após impostos do Taxad): R$" + grandTheftAutoV.getPreco());
    }
}
