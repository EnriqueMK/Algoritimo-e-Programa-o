public class ex06 {
    public static void main (String[] args) {
        double a=1, b=-5, c=6, tri, x1, x2;
        tri = Math.pow(-5, 2) - 4 * a * c;
        x1 = ((-b) + tri) / (2 * a);
        x2 = ((-b) - tri) / (2 * a);
        System.out.printf("X1: %.0f %nX2: %.0f", x1, x2);
    }
}