import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        double sal, aumento;

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Qual o seu salário: ");
        sal = scanner.nextDouble();

        aumento = sal + (sal * 0.25);

        System.out.printf("Olá %s, você teve um aumento de 25 porcento no seu salário. %nSalário antigo: R$%.2f %nSalário Reajustado: R$%.2f", nome, sal, aumento);

        scanner.close();


    }
}