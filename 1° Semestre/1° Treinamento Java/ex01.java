import java.util.Scanner;
public class ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double nota1, nota2, nota3;
		int peso1 = 1; 
        int peso2 = 3; 
        int peso3 = 4;
		 
		System.out.print("Digite o valor da nota 1: ");
		nota1 = scanner.nextInt();
		
		System.out.print("Digite o valor da nota 2: ");
		nota2 = scanner.nextInt();
		
		System.out.print("Digite o valor da nota 3: ");
		nota3 = scanner.nextInt();
		
		double mediaP = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);
		
		System.out.printf("Nota | Peso %n%.2f | %d %n%.2f | %d %n%.2f | %d %nA média das notas é igual a: %.2f", nota1, peso1, nota2, peso2, nota3, peso3, mediaP);
		
		scanner.close();
	}
}