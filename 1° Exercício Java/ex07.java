import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso, altura, imc;
        String resul;

        // Recebe seu peso em Kg
        System.out.print("Digite seu peso (em Kg): ");
        peso = scanner.nextDouble();

        // Recebe sua altura em centímetros
        System.out.print("Digite sua altura (em cm): ");
        altura = scanner.nextDouble();

        // Calcula o imc do usuário
        imc = (peso / (altura * altura)) * 10000;

        // Verifica o valor do imc e armazena a situação
        if (imc <= 16) {
            resul = "Magreza Severa";
        } else if (imc <= 17) {
            resul = "Magreza Moderada";
        } else if (imc <= 18.5) {
            resul = "Magreza Leve";
        } else if (imc <= 25) {
            resul = "Normal";
        } else if (imc <= 30) {
            resul = "Obesidade Leve";
        } else if (imc <= 40) {
            resul = "Obesidade Severa";
        } else {
            resul = "Obesidade Mórbida";
        }
        System.out.printf("Peso: %.2fKg \nAltura: %.2f \nResultado do IMC: %s", peso, altura, resul);
        scanner.close();
    }
}