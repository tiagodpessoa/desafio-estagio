package challenge;

import java.util.Scanner;

public class NumberTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        verifyLetterA(input);

        scanner.close();
    }

    public static void verifyLetterA(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                counter++;
            }
        }

        if (counter > 0) {
            System.out.println("A letra 'a' aparece " + counter + " vez(es) na palavra que você enviou.");
        } else {
            System.out.println("A letra 'a' não aparece na palavra que você enviou.");
        }
    }

}
