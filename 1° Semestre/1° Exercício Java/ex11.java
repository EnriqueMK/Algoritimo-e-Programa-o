import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe três valores
        System.out.println("Digite as três notas da média: ");
        double nota1 = scanner.nextDouble(), nota2 = scanner.nextDouble(), nota3 = scanner.nextDouble();

        // Calcula a média dos valores
        double media = (nota1 + nota2 + nota3) / 3;

        // Armazena a situação do aluno
        String resul = media < 5 ? "Reprovado" : media <= 6 ? "Recuperação" : "Aprovado";

        // Exibe a situação do aluno
        if (resul.equals("Recuperação")) {

            System.out.print("O aluno entrou em recuperação: ");
            double notaRecuperacao = scanner.nextDouble();
            media = (media + notaRecuperacao) / 2;

            if (media < 6) {
                System.out.println("Você foi Reprovado!"); 
            } else {
                System.out.println("Você foi aprovado pela Recuperação!");
            }
            System.out.printf("Sua média foi %.2f", media);
            System.exit(0);
        } 

        System.out.printf("Sua média foi %.2f", media);
        System.out.printf("\nVocê foi %s!", resul);
        scanner.close();
    }
}