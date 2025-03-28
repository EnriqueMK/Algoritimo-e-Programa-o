import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area, perimetro, raio, pi = 3.1416;

        System.out.print("Digite o valor do raio: ");
        raio = scanner.nextInt();

        area = pi * Math.pow(raio, 2);
        perimetro = 2 * pi * raio;

        System.out.printf("Área do círculo: %.2fcm² %nPerímetro do Círculo: %.2fcm", area, perimetro);

        scanner.close();

    }
}