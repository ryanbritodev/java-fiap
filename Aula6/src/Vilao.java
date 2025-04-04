public class Vilao extends Vingadores {

    public Vilao(String nome, int idade, boolean armadura, double altura){
        super(nome, idade,armadura, altura); // executando o construtor da classe mãe
                                             // reaproveitando da classe mãe
    }

    // Atributos exclusivos de vilao
    public  String poder;
    public  int matricula;

}
