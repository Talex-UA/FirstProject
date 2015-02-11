package Tasks;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String args[]) throws java.io.IOException {
        Scanner input = new Scanner(System.in);
        int number = 0;

        do{
            System.out.println("Please, enter your number (bigger or equal to 2).");
            try {
                number = input.nextInt();
            }

            catch (InputMismatchException e){
                System.out.println("It wasn't number, try again");
                }
            catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("Something went wrong, closing");
                return;
            }

            input.skip(".*");
        } while (number<2);


        System.out.println("2");
        for (int j = 3; j < number + 1; j=j+2) {
            finder:{
                if ((j%3==0 && j!=3)|| (j%5==0 && j!=5)) break finder;
            int root = (int) Math.sqrt(j);
                for (int k = root; k > 1; k--) {
                    if (j % k == 0) break finder;
                }
            System.out.println(j);
            }
        }
    }
}
