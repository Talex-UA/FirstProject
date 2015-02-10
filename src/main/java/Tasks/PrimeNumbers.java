package Tasks;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String args[]) throws java.io.IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your number.");
        int number = 0;
        while (true) {
            try {
                number = input.nextInt();
                if (number < 2) throw new RuntimeException();
                break;
            } catch (Exception e) {
                System.out.println("Please, try again");
                input.skip(".*");
            }
        }

        for (int j = 2; j < number + 1; j++) {
            if (j % 2 != 0 || j==2) {
                int x = (int) Math.sqrt(j);
                int count = 0;
                for (int k = x; k > 1; k--) {
                    if (j % k == 0) count++;
                }
                if (count == 0) System.out.println(j);
            }

        }
    }
}
