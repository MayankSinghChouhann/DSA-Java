public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) System.out.print(i + " ");
        System.out.println();
        int n = 5;
        while (n > 0) { System.out.print(n + " "); n--; }
        System.out.println();
        int k = 0;
        do { System.out.print(k + " "); k++; } while (k < 3);
    }
}