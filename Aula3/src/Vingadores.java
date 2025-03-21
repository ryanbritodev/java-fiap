public class Vingadores {

    // Atributos
    public String nome;
    public int idade;
    public String armadura;
    public double peso;
    public double altura;

    // Método Construtor
    public Vingadores(String nome, int idade, String armadura, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.armadura = armadura;
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos da Classe
    void salvar(){
        System.out.println(this.nome + " está salvando a cidade de NY!");
    }

    void lutar(){
        System.out.println(this.nome + " está lutando!");
    }

    void correr(){
        System.out.println(this.nome + " está correndo!");
    }

    void exibirInformacoes(){
        System.out.println("\n------ Informações do Herói ------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + Vingadores.this.idade);
        System.out.println("Armadura: " + Vingadores.this.armadura);
        System.out.println("Peso: " + Vingadores.this.peso + "kg");
        System.out.println("Altura: " + Vingadores.this.altura + "m");
    }

}
