import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro número: ");
        String valor1 = scanner.nextLine();

        System.out.print("Digite o valor do segundo número: ");
        String valor2 = scanner.nextLine();

        System.out.println("Valores antes da troca:");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);

        String troca = valor1;
        valor1 = valor2;
        valor2 = troca;

        System.out.println("Valores depois da troca: ");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);

        scanner.close();

    }
}