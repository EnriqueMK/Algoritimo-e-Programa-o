import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe dois valores
        System.out.println("Informe dois valores: ");
        int n1 = scanner.nextInt(), n2 = scanner.nextInt();

        // Verifica e exibe o maior valor digitado
        System.out.print(n1 > n2 ? "O número " + n1 + " é maior" : n2 > n1 ? "O número " + n2 + " é maior" : "Os valores digitados são iguais.");
        scanner.close();
    }
}