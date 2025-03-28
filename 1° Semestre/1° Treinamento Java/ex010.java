import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c, cal;

        System.out.print("Digite o valor do cateto a: ");
        a = scanner.nextInt();

        System.out.print("Digite o valor do cateto b: ");
        b = scanner.nextInt();

        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        
        cal = a + b;

        c = Math.sqrt(cal);

        System.out.printf("%.2f", c);

        scanner.close();


    }
}