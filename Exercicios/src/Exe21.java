import java.util.Scanner;

public class Exe21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite uma palavra/frase ou PARE para parar: ");
            String palavra = scanner.nextLine().toUpperCase().strip();

            if (palavra.equals("PARE")){
                System.out.print("Até mais! 👋🏻");
                break;
            }
        }
        scanner.close();
    }
}
