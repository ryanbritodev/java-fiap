public class Vilao {

    // Atributos
    public String nome;
    public int idade;
    public String armadura;
    public double peso;
    public double altura;

    // Método Construtor

    public Vilao(String nome, int idade,String armadura, double peso, double altura){

        this.nome = nome;
        this.idade = idade;
        this.armadura = armadura;
        this.peso = peso;
        this.altura = altura;

    }

    // Métodos da Classe
    void roubar(){
        System.out.println(this.nome+" está roubando o banco de NY!");
    }

    void lutar(){
        System.out.println(this.nome +" está lutando!");
    }

    void correr(){
        System.out.println(this.nome+" está correndo!");
    }

    void exibirInformacoes(){
        System.out.println("\n------ Informações do Vilão ------ ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + Vilao.this.idade);
        System.out.println("Armadura: " + Vilao.this.armadura);
        System.out.println("Peso: " + Vilao.this.peso + "kg");
        System.out.println("Altura: " + Vilao.this.altura + "m");
    }

}
