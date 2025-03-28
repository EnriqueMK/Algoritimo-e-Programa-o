import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sal, grat, sal_liq;

        System.out.print("Qual o seu salário: ");
        sal = scanner.nextDouble();

        grat = sal * 1.10;
        sal_liq = grat - (grat * 0.15);

        System.out.printf("%nSalário Bruto: R$%.2f %nSalário com Gratificação: R$%.2f %nSalário Líquido R$%.2f", sal, grat, sal_liq);

        scanner.close();





        
    } 
}
