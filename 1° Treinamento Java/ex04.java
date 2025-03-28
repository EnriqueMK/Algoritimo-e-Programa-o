import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, altura;

        System.out.print("Informa o valor da base do triângulo: ");
        base = scanner.nextInt();

        System.out.print("Informa a altura do triângulo: ");
        altura = scanner.nextInt();

        int area = (base * altura) / 2;

        System.out.printf("Base: %d%nAltura: %d%nÁrea: %dm²", base, altura, area);

        scanner.close();
    }
}