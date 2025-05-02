import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to find how many characters it has: ");
        String word = scanner.next();
        int characters = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                characters += 1;
            }
        }

        //return characters;
    }
    public static boolean is_valid_pal(String s) {
        if (s == null) return false;

        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        String filtered = cleaned.toString();
        String reversed = cleaned.reverse().toString();

        return filtered.equals(reversed);
    }
}
