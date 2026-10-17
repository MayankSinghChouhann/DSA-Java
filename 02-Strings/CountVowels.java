public class CountVowels {
    public static void main(String[] args) {
        String s = "Data Structures and Algorithms";
        int count = 0;
        for (char c : s.toLowerCase().toCharArray())
            if ("aeiou".indexOf(c) >= 0) count++;
        System.out.println("Vowels: " + count);
    }
}