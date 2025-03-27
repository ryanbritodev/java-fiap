public class Jogo {

    // Encapsulamento
    private String nome;
    private double duracao;
    private String genero;
    private int ano;
    private double preco;


    // No Intellij, é possível criar todos os métodos get/set selecionando os atributos e clicando com o botão direito em "Generate"
    public Jogo(String nome, double duracao, String genero, int ano, double preco){
        this.nome = nome;
        this.duracao = duracao;
        this.genero = genero;
        this.ano = ano;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInformacoes(){
        System.out.println("INFORMAÇÕES DO GAME");
        System.out.println("Nome: " + nome);
        System.out.println("Duração: " + duracao + " horas");
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de Lançamento: " + ano);
        System.out.print("Preço: R$" + preco);
    }

}