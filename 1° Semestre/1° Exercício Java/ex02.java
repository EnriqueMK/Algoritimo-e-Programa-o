import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe três valores
        System.out.println("Digite três valores: ");
        int n1 = scanner.nextInt(), n2 = scanner.nextInt(), n3 = scanner.nextInt();
        
        // Verifica e exibe o menor valor digitado
        if (n1 > n2 && n1 > n3) {
            System.out.println("O valor " + n1 + " é maior");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O valor " + n2 + " é maior");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("O valor " + n3 + " é maior");
        } else {
            System.out.println("Os valores digitados são iguais!");
        }
        scanner.close();
    }
}