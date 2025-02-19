public class Exe11 {
    public static void main(String[] args) {
        // Crie um programa que declare uma variável do tipo double, atribua um valor a ela e
        // faça o casting para int. Imprima ambos os valores e comente sobre a possível perda de dados.
        double valorEmDouble = 5.5;
        System.out.println("Valor em Double: "+ valorEmDouble);
        int valorEmInt = (int) valorEmDouble;
        System.out.println("Valor em Int: " + valorEmInt);
    }
}
