package Tasks;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String args[]) throws java.io.IOException {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.println("Please, enter your number.");

        while (number==0) {
            try {
                number = input.nextInt();
            }

            catch (InputMismatchException e){}
            catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("Something went wrong, closing");
                return;
            }

            if (number >= 2) break;

            System.out.println("Please, try again");
            input.skip(".*");
            number=0;
        }

        System.out.println("2");
        for (int j = 3; j < number + 1; j=j+2) {
            finder:{
            int root = (int) Math.sqrt(j);
                for (int k = root; k > 1; k--) {
                    if (j % k == 0) break finder;
                }
            System.out.println(j);
            }
        }
    }
}
