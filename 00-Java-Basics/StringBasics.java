public class StringBasics {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(new StringBuilder(s).reverse());
        System.out.println(s.indexOf("world"));
    }
}