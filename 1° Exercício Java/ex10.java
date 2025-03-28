import java.util.Scanner;

public class ex10 {
    public static void main(String[] rags) {
        Scanner scanner = new Scanner(System.in);

        // Recebe o horário do começo do jogo
        System.out.println("Hora e minuto de início: ");
        int horaInicio = scanner.nextInt(), minutoInicio = scanner.nextInt();

        // Recebe o horário do final do jogo
        System.out.println("Hora e minuto do final: ");
        int horaFinal = scanner.nextInt(), minutoFinal = scanner.nextInt();

        // Converção para minutos
        int minutoInicioTotal = horaInicio * 60 + minutoInicio;
        int minutoFinalTotal = horaFinal * 60 + minutoFinal;

        // Se for menor ou igual, adiciona 24 horas em minutos
        if (minutoFinalTotal <= minutoInicioTotal) {
            minutoFinalTotal += 24 * 60;
        }

        int duracaoTotalMinuto = minutoFinalTotal - minutoInicioTotal;
        int ducaraoHoras = duracaoTotalMinuto / 60;
        int duracaoMinutos = duracaoTotalMinuto % 60;

        System.out.printf("A duração do jogo foi de %d hora(s) e %d minuto(s).%n", ducaraoHoras, duracaoMinutos);
        scanner.close();
    }
}