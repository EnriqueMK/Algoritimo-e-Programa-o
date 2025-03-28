import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe três valores 
        System.out.println("Digite 3 valores: ");
        int n1 = scanner.nextInt(), n2 = scanner.nextInt(), n3 = scanner.nextInt();

        // Verifica se o terceiro valor digitado está entre eles e exibe na tela
        System.out.println(n3 < n1 && n3 > n2 || n3 > n1 && n3 < n2 ? "O terceiro valor está entre eles" : "O terceiro valor não está entre os valores");
        scanner.close();
    }
}