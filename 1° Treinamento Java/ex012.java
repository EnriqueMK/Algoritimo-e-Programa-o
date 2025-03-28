import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede o valor do saque
        System.out.print("Digite o valor do saque: R$");
        double saque = scanner.nextDouble();

        // Cálculo das notas
        int nota100 = (int) saque / 100;
        saque = saque % 100;
        
        int nota50 = (int) saque / 50;
        saque = saque % 50;

        int nota20 = (int) saque / 20;
        saque = saque % 20;

        int nota10 = (int) saque / 10;
        saque = saque % 10;

        int nota5 = (int) saque / 5;
        saque = saque % 5;

        System.out.println("\nNotas sacadas");
        System.out.println("Notas de 100: " + nota100);
        System.out.println("Notas de 50: " + nota50);
        System.out.println("Notas de 20: " + nota20);
        System.out.println("Notas de 10: " + nota10);
        System.out.println("Notas de 5: " + nota5);

        scanner.close();

    }

}