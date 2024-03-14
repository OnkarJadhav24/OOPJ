import java.util.Scanner;

class Q5 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Invalid input");
        }
}

}
