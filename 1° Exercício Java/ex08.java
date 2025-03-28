import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado1, lado2, base;
        String resul = "";

        // Recebe os valores do triângulo
        System.out.println("Digite os dois lados e a base do triângulo: ");
        lado1 = scanner.nextInt();
        lado2 = scanner.nextInt();
        base = scanner.nextInt();

        // Verifica se as laterais do triângulo não são maior que a base
        if (lado1 + lado2 <= base || lado1 + base <= lado2 || lado2 + base <= lado1) {
            System.out.print("A soma das laterais tem que ser maior que a base.");
            System.exit(0);
        } else {
            
            // Verifica o tipo de triângulo e armazena 
            if (lado1 == lado2 && lado2 == base) {
                resul = "Equilátero";
            } else if (lado1 == lado2 || lado1 == base || lado2 == base) {
                resul = "Isósceles";
            } else {
                resul = "Escaleno";
            }
        }
        System.out.printf("O triângulo é %s", resul);
        scanner.close();
    }
}