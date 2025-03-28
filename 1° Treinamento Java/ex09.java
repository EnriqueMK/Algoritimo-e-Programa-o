import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pes, pol, jar, mil;

        System.out.print("Digite o valor da medida em pés: ");
        pes = scanner.nextInt();
        
        pol = pes * 12;
        jar = pes / 3;
        mil = pes / 5280;

        System.out.printf("Conversões: %nPolegadas: %.2f %nJardas: %.2f %nMilhas: %.2f", pol, jar, mil);

        scanner.close();


    }
}