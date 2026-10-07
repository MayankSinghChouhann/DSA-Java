public class EvenOdd {
    static boolean isEven(int n) { return (n & 1) == 0; }

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++)
            System.out.println(i + (isEven(i) ? " is even" : " is odd"));
    }
}