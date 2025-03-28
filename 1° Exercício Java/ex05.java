import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura, peso_ideal;

        // Recebe seu sexo
        System.out.print("Digite seu sexo [M/F]: ");
        String sexo = scanner.nextLine().toUpperCase();

        // Recebe sua altura em centímetros
        System.out.print("Digite o sua altura (em cm): ");
        altura = scanner.nextDouble();

        // Verifica seu sexo e calcula seu peso ideal
        if (sexo.equals("M")) {
            peso_ideal = 52 + (0.75 * (altura - 152.4));
        } else if (sexo.equals("F")) {
            peso_ideal = 52 + (0.67 * (altura - 152.4));
        } else {
            System.out.print("Sexo Inválido: Digite apenas M ou F!");
            scanner.close();
            return;
        }
        System.out.printf("Sexo: %s \nAltura: %.0fcm \nPeso ideal: %.2fKg", sexo, altura, peso_ideal);
        scanner.close();
    }

}