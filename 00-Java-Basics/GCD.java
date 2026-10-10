public class GCD {
    static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }

    public static void main(String[] args) {
        int a = 48, b = 18;
        int g = gcd(a, b);
        System.out.println("GCD: " + g + ", LCM: " + (a / g * b));
    }
}