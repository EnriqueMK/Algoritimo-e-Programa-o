import java.util.Scanner;

public class ex07 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b, c, tri, x1, x2;

        System.out.print("Digite o valor de a: ");
        a = scan.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = scan.nextDouble();

        System.out.print("Digite o valor de c: ");
        c = scan.nextDouble();

        tri = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        x1 = ((-b) + tri) / (2 * a);
        x2 = ((-b) - tri) / (2 * a);

        System.out.printf("X1: %.0f%n", x1);
        System.out.printf("X2: %.0f%n", x2);

        scan.close();
    }
}