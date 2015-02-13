package TasksWithStaticMethods;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PrimeNumbers_4methods {
    public static void main(String args[]) throws java.io.IOException {

        int userInput = getUserInput();
        ArrayList<Integer> primeNumbersArray = getPrimeNumbersArray(userInput);
        printArrayList(primeNumbersArray);
    }

    public static void printArrayList(ArrayList<Integer> primeNumbersArray) {
        for(Integer x:primeNumbersArray){
            System.out.println(x);
        }
    }

    public static ArrayList<Integer> getPrimeNumbersArray(int userInput) {
        ArrayList<Integer> primeNumbersList = new ArrayList<>();
        if (userInput<2) return primeNumbersList;
        primeNumbersList.add(2);
        for (int j = 3; j < userInput + 1; j=j+2) {
            finder:{
                if ((j%3==0 && j!=3)|| (j%5==0 && j!=5)|| (j%7==0 && j!=7)) break finder;
                int root = (int) Math.sqrt(j);
                for (int k = root; k > 1; k--) {
                    if (j % k == 0) break finder;
                }
                primeNumbersList.add(j);
            }
        }
        return primeNumbersList;
    }

    public static int getUserInput() {
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
                System.exit(0);
            }

            input.skip(".*");
        } while (number<2);
        return number;
    }
}
