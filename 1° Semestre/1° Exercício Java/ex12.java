import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vai receber quatro valores
        System.out.println("Quatro notas do Aluno (0-100): ");
        double nota1 = scanner.nextDouble(), nota2 = scanner.nextDouble(), nota3 = scanner.nextDouble(), nota4 = scanner.nextDouble();

        // Calcula a média dos valores
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        String premio = "";

        System.out.print("Quantidade de Presenças (0-24): ");
        double presenca = scanner.nextInt();
        presenca = (presenca / 24) * 100;

        System.out.println("Média do Aluno: " + media);
        System.out.printf("Total de Presenças: %.2f%%\n", presenca);

        // Exibe o prêmio do aluno
        if (media > 80 && presenca == 100) {
            premio = "Excursão";
        } else if (media > 80 || presenca == 100) {
            premio = "Camiseta";
        } else if (media >= 70 && media <= 80 && presenca >= 90) {
            premio = "Squeeze";
        } else if (media >= 70 && media <= 80 || presenca >= 90) {
            premio = "Caneta Personalizada";
        } else {
            premio = "Não há Prêmio";
        }
        System.out.println("Resultado do Prêmio: " + premio);
        scanner.close();
    }
}