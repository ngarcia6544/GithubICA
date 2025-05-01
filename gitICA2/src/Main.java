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
}