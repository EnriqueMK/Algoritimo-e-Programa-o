import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        int n1, n2, opc;
        Scanner scanner = new Scanner(System.in);
        
        // Exibe o menu
        System.out.print("***** Menu de Opções ***** \n" + "1. Somar dois números \n" + "2. Raiz quadrada de um número \n" + "3. Elevar um número a potência \n\"**** Digite a opção desejada ****\n");
        opc = scanner.nextInt();

        // Verifica se a opção escolhida está no menu e executa a conta
        if (opc >= 1 && opc <= 3) {
            if (opc == 1) {
                System.out.println("Digite dois números:");
                n1 = scanner.nextInt();
                n2 = scanner.nextInt();
                int soma = n1 + n2;
                System.out.print("A soma dos dois valores é igual a " + soma);
            } else if (opc == 2) {
                System.out.println("Digite um número: ");
                n1 = scanner.nextInt();
                System.out.print("A raiz quadrada do número digitado é igual a: " + Math.sqrt(n1));
            } else {
                System.out.println("Digite um número e a potência:");
                n1 = scanner.nextInt();
                n2 = scanner.nextInt();
                System.out.print("A potência do valor digitado é igual: " + Math.pow(n1, n2));
            }
        } else {
            System.out.print("Digite apenas as opções da tabela!");
            System.exit(0);
        }
        scanner.close();
    }
}