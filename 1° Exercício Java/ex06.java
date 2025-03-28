import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sal, bonif, auxil, total;

        // Recebe seu salário
        System.out.print("Digite o seu salário R$");
        sal = scanner.nextDouble();

        // Verifica sua bonificação de acordo com seu salário base
        bonif = sal <= 2000 ? (sal * 1.10) - sal : sal <= 3000 ? (sal * 1.08) - sal : (sal * 1.05) - sal;

        //  Verifica seu auxílio de acordo com seu salário base
        auxil = sal <= 2000 ? 350 : 300;
        total = sal + bonif + auxil;

        System.out.printf("Salário base: R$%.2f \nBonificação: R$%.2f \nAuxilio: R$%.2f \nSalário Total: R$%.2f", sal, bonif, auxil, total);
        scanner.close();
    }
}