import java.util.Scanner;

public class RecursiveAlphabet {

    public static void main(String[] args) throws Exception {
        letterSelect();
    }

    public static void letterSelect() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the letter you want to start from:");
        String inputLetter = in.nextLine();
        while (inputLetter.length() > 1) {
            System.out.println("You did not print a single letter!");
            inputLetter = in.nextLine();
        }
        System.out.println("You input this letter: " + inputLetter + ".");
        in.close();

        char character = inputLetter.charAt(0);

        do {
            System.out.println(character);
            --character;
        } while (character >= 'a');
    }
}
