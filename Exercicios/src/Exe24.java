public class Exe24 {
    public static void main(String[] args) {
        System.out.println("Números de 1 até 1000 divisíveis por 5 👇🏻");
        for (int a = 1, b = 1001; a < b; a++) {
            if (a % 5 == 0) {
                System.out.println(a);
            }
        }
    }
}
