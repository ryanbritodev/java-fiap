// Fazer um programa que imprima a média aritmética dos números 8, 9 e 7. A média dos números 4, 5 e 6.
// A soma das duas médias. A média das médias.

public class Exe2 {
    public static void main(String[] args) {
        System.out.print("Média aritmética dos números 8, 9 e 7: ");
        double media1 = (8 + 9 + 7) / 3.0;
        double media2 = (4 + 5 + 6) / 3.0;
        System.out.println(media1);
        System.out.print("Média aritmética dos números 4, 5 e 6: ");
        System.out.println(media2);
        double somaMedias = media1 + media2;
        System.out.print("Soma das duas médias: ");
        System.out.println(somaMedias);
        double mediaDasMedias = somaMedias / 2;
        System.out.print("Média das médias: ");
        System.out.println(mediaDasMedias);
    }
}
