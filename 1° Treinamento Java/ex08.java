import java.util.Scanner;

public class ex08 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sacoRacao, racaoGasta, sobra;

        System.out.print("Informe quantos Kg tem o saco de ração: ");
        sacoRacao = scanner.nextDouble();

        System.out.print("Quantidade de ração em gramas (g) para cada gato: ");
        racaoGasta = scanner.nextDouble();

        sobra = (sacoRacao * 1000) - ((racaoGasta *2 ) * 5);

        System.out.printf("%nQuantidade de gatos: 2 %nSaco de ração: %.1fKg %nRação gasta por gato: %.0f %nQuantidade de ração gasta por 5 dias: %.2fg", sacoRacao, racaoGasta, sobra);

        scanner.close();

    }
}