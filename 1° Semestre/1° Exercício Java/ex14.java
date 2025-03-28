import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double devendoTotal = 0;

        // Exibe um menu
        System.out.println("Código | Valor do Produto \n A001  | R$ 7,50 \n A002  | R$ 9,90 \n A003  | R$ 14,00 \n A004  | R$ 19,99");

        // Recebe o código do produto
        System.out.print("Digite o código do produto: ");
        String codigoProduto = scanner.nextLine().toUpperCase();

        // Recebe a quantidade comprada
        System.out.print("Quantidade comprada: ");
        int quantidadeComprada = scanner.nextInt();

        // Calcula a dívida total
        if (codigoProduto.equals("A001")) {
            devendoTotal = 7.50 * quantidadeComprada;
        } else if (codigoProduto.equals("A002")) {
            devendoTotal = 9.90 * quantidadeComprada;
        } else if (codigoProduto.equals("A003")) {
            devendoTotal = 14 * quantidadeComprada;
        } else if (codigoProduto.equals("A004")) {
            devendoTotal = 19.99 * quantidadeComprada;
        } else {
            System.out.print("Código Inválido!");
            System.exit(0);
        }

        System.out.printf("Você está devendo R$%.2f do código %s", devendoTotal, codigoProduto);
        scanner.close();
    }
}