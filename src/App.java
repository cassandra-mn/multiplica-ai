public class App {
    public static void main(String[] args) {
        int numero = 9;

        System.out.println("Tabela de multiplicação de " + numero);

        for (int i = 1; i < 10; i++) {
            int produto = numero * i;
            System.out.println(numero + " * " + i + " = " + produto);
        }
    }
}
