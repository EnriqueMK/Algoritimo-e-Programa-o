import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilosComprado = 0, valorTotal = 0, conversaoGramas = 0, valorTotalImposto = 0;

        // Exibe o menu
        System.out.println(" Cód.  | Preço (g) \n1 a 4  | 10,00 \n5 a 7  | 25,00 \n8 a 10 | 35,00");

        // Recebe o código do produto
        System.out.print("Código do Produto: ");
        int codigoProduto = scanner.nextInt();

        // Recebe quantos Kg foi comprado
        System.out.print("Quantos Kilos foi comprado? ");
        kilosComprado = scanner.nextDouble();
        conversaoGramas = kilosComprado * 1000;

        // Calcula o valor da compra total sem imposto
        if (codigoProduto >= 1 && codigoProduto <= 4) {
            valorTotal = conversaoGramas * 10;
        } else if (codigoProduto >= 5 && codigoProduto <= 7) {
            valorTotal = conversaoGramas * 25;
        } else if (codigoProduto >= 8 && codigoProduto <= 10) {
            valorTotal = conversaoGramas * 35;
        } else {
            System.out.println("Insira apenas código do protudo da tabela");
            System.exit(0);
        }

        System.out.print("Cód. País Origem: (0-3): ");
        int codPais = scanner.nextInt();

        // Calcula o valor da compra total com imposto
        if (codPais == 2) {
            valorTotalImposto = valorTotal + (valorTotal * 0.15);
        } else if (codPais == 3) {
            valorTotalImposto = valorTotal + (valorTotal * 0.25);
        } else {
            System.out.print("Este código de País não existe!");
            System.exit(0);
        }
        System.out.printf("\nQuantidade Comprada %.2fg \nValor Total: R$%.2f \nPreço Total com Imposto: R$%.2f", conversaoGramas, valorTotal, valorTotalImposto);
        scanner.close();
    }
}