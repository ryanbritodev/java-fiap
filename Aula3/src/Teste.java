import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        // Instânciando um objeto de scanner
        Scanner scanner = new Scanner(System.in);

        // Array de Heróis e de Vilões
        ArrayList<Vingadores> listaHerois = new ArrayList<Vingadores>();
        ArrayList<Vilao> listaViloes = new ArrayList<Vilao>();

        // Mensagem de boas-vindas
        System.out.println("------ PROGRAMA DOS VINGADORES ------");
        System.out.println("""
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣴⣶⣶⣾⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⣠⣴⣿⣿⣿⠿⠿⠛⣻⣿⣿⣿⣿⣿⣿⣿⣦⣄⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⣠⣾⣿⡿⠛⠉⠀⠀⠀⣰⣿⣿⣿⠟⣿⣿⣿⣿⢿⣿⣷⣦⠀⠀⠀⠀
                ⠀⠀⢠⣾⣿⡟⠁⠀⠀⠀⠀⠀⣰⣿⣿⣿⡟⠀⣿⣿⣿⣿⠀⠈⢻⣿⣷⡄⠀⠀
                ⠀⢠⣿⣿⠏⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⡟⠀⠀⣿⣿⣿⣿⠀⠀⠀⠹⣿⣿⡄⠀
                ⢀⣿⣿⠏⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⡿⠁⠀⠀⣿⣿⣿⣿⠀⠀⠀⠀⠸⣿⣿⡄
                ⣸⣿⡟⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⠃⠀⠀⠀⣿⣿⣿⣿⠀⠀⠀⠀⠀⢻⣿⣇
                ⣿⣿⡇⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⠇⠀⠀⠀⠀⣈⠻⣿⣿⠀⠀⠀⠀⠀⢸⣿⣿
                ⣿⣿⡇⠀⠀⠀⠀⢠⣿⣿⣿⣿⣯⣤⣤⣤⣤⣤⣿⣶⣌⠻⠀⠀⠀⠀⠀⢸⣿⣿
                ⢻⣿⣇⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⣸⣿⡟
                ⠘⣿⣿⡄⠀⢠⣿⣿⣿⣿⡿⠿⠿⠿⠿⠿⠿⢿⣿⣿⠟⢋⠀⠀⠀⠀⢠⣿⣿⠃
                ⠀⠹⣿⡿⢀⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠸⠋⣡⣴⣿⠀⠀⠀⣠⣿⣿⠏⠀
                ⠀⠀⠙⢁⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠚⠛⠛⠛⠀⢀⣴⣿⣿⠋⠀⠀
                ⠀⠀⢀⣾⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⣿⠟⠁⠀⠀⠀
                ⠀⢀⣾⣿⣿⣿⣿⠏⣰⣿⣶⣦⣤⣤⣤⣤⣤⣤⣴⣶⣿⣿⡿⠛⠁⠀⠀⠀⠀⠀
                ⢀⣾⣿⣿⣿⣿⡟⠀⠈⠙⠛⠻⠿⠿⠿⠿⠿⠿⠟⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀\n""");

        while (true) {

            // Menu principal
            System.out.println("\nQuem você deseja cadastrar?");
            System.out.println("[1] Herói");
            System.out.print("[2] Vilão\n> ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                // Cadastro das informações
                System.out.print("Informe um nome para seu herói: ");
                String nome = scanner.nextLine();

                System.out.print("Informe uma idade para o seu herói: ");
                int idade = scanner.nextInt();

                System.out.print("Informe o nome da armadura do seu herói: ");
                String armadura = scanner.nextLine();
                scanner.nextLine();

                System.out.print("Informe o peso do seu herói: ");
                double peso = scanner.nextDouble();

                System.out.print("Informe a altura do seu herói: ");
                double altura = scanner.nextDouble();

                Vingadores heroi = new Vingadores(nome, idade, armadura, peso, altura);
                listaHerois.add(heroi);
                heroi.exibirInformacoes();
                heroi.lutar();
                heroi.correr();
                heroi.salvar();

            } else if (opcao == 2) {
                // Cadastro das informações
                System.out.print("Informe um nome para seu vilão: ");
                String nome = scanner.nextLine();

                System.out.print("Informe uma idade para o seu vilão: ");
                int idade = scanner.nextInt();

                System.out.print("Informe o nome da armadura do seu vilão: ");
                String armadura = scanner.nextLine();
                scanner.nextLine();

                System.out.print("Informe o peso do seu vilão: ");
                double peso = scanner.nextDouble();

                System.out.print("Informe a altura do seu vilão: ");
                double altura = scanner.nextDouble();

                Vilao vilao = new Vilao(nome, idade, armadura, peso, altura);
                listaViloes.add(vilao);
                vilao.exibirInformacoes();
                vilao.correr();
                vilao.roubar();
                vilao.lutar();
            }

            // Cadastros feitos
            System.out.println("\nHeróis Cadastrados: ");
            if (listaHerois.isEmpty()) {
                System.out.println("Nenhum herói cadastrado até o momento!");
            } else {
                for (Vingadores vingadores : listaHerois) {
                    System.out.println(vingadores.nome);
                }
            }
            System.out.println("\nVilões Cadastrados: ");
            if (listaViloes.isEmpty()) {
                System.out.println("Nenhum vilão cadastrado até o momento!");
            } else {
                for (Vilao vilao : listaViloes) {
                    System.out.println(vilao.nome);
                }
            }

            System.out.println("\nDeseja cadastrar um novo héroi/vilão?");
            System.out.println("[1] Sim");
            System.out.print("[2] Não\n> ");
            int flag = scanner.nextInt();

            if (flag == 1) {
                continue;
            } else {
                System.out.print("\nAté mais! 👋🏻");
                break;
            }
        }

        // Fechando o scanner
        scanner.close();
    }
}
