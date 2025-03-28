import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Básico | R$150,00 \nBronze | R$220,00 \nPrata  | R$310,00 \nOuro   | R$450,00");

        // Recebe o valor do plano
        System.out.print("Digite o valor do seu plano: R$");
        int valorPlano = scanner.nextInt();
        String planoNome = "";

        // Exibe o tipo do plano
        switch (valorPlano) {
            case 150:
                planoNome = "Básico"; 
                break;
            case 220:
                planoNome = "Bronze";
                break;
            case 310:
                planoNome = "Prata";
                break;
            case 450:
                planoNome = "Ouro";
                break;
            default:
                System.out.print("Digite apenas os valores da tabela!");
                System.exit(0);
                break;
        }
        System.out.println("Seu plano é " + planoNome);
        scanner.close();
    }
}