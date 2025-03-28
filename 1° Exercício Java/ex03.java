import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe quatro notas de 0 a 100
        System.out.println("Digite 4 notas para a média (0 a 100): ");
        double n1 = scanner.nextDouble(), n2 = scanner.nextDouble(), n3 = scanner.nextDouble(), n4 = scanner.nextDouble();

        String status;
    
        // Calcula a média das quatro notas
        double media = (n1 + n2 + n3 + n4) / 4;

        // Verifica a média e exibe a situação do aluno
        if (media >= 0 && media <= 20) {
            status = "Péssimo";
        } else if (media <= 40) {
            status = "Ruim";
        } else if (media <= 60) {
            status = "Regular";
        } else if (media <= 80) {
            status = "Bom";
        } else {
            status = "Ótimo";
        }
        System.out.printf("Média do aluno: %.2f \nClassificação: %s", media, status);
        scanner.close();
    }
}