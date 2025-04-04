public class TesteVingadores {
    public static void main(String[] args) {
        // Criação de um heroi
        Herois vingador = new Herois("Homem de Ferro",48,true,1.75);
        System.out.println("Criando um heroi\n");
        System.out.println("Nome: " + vingador.nome);
        vingador.identificador = 123;
        System.out.println("Idade: " + vingador.idade);
        System.out.println("Possui armadura: " + vingador.armadura);
        System.out.println("Altura: " + vingador.altura);
        System.out.println("ID: " + vingador.identificador);

        // Criação de um vilão
        Vilao thanos = new Vilao("Thanos",300,false,2.20);
        thanos.matricula = 666;
        thanos.poder = "Destruir o planeta";
        System.out.println("\nCriando um Vilão\n");
        System.out.println("Nome: " + thanos.nome);
        System.out.println("Idade: " + thanos.idade);
        System.out.println("Possui armadura: " + thanos.armadura);
        System.out.println("Altura: " + thanos.altura);
        System.out.println("Matricula: " + thanos.matricula);
        System.out.println("Poder: " + thanos.poder);
    }
}


