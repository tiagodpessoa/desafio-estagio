package challenge;

import java.util.Scanner;

public class NumberOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência");
        } else {
            System.out.println("O número " + number + " não pertence à sequência");
        }

        scanner.close();
    }

    public static boolean isFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int a = 0, b = 1, c = 0;

        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }

        return c == num; //
    }

}
