package TasksWithStaticMethods;

import java.util.*;

public class PrimeNumbers_4methods {
    public static void main(String args[]) {
        printArrayList(getPrimeNumbersArray(getUserInput()));
    }

    public static void printArrayList(List<Integer> primeNumbersArray) {
        primeNumbersArray.forEach(System.out::println);
    }

    public static List<Integer> getPrimeNumbersArray(int userInput) {
        List<Integer> primeNumbersList = new ArrayList<>();
        if (userInput < 2) return primeNumbersList;
        primeNumbersList.add(2);
        for (int j = 3; j <= userInput; j = j + 2) {
            if ((j % 3 == 0 && j != 3) || (j % 5 == 0 && j != 5) || (j % 7 == 0 && j != 7)) {
                continue;
            }
            int root = (int) Math.sqrt(j);
            boolean isPrime = true;
            if (root%2==0) root--;
            for (int k = root; k > 1; k -= 2) {
                if (j % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbersList.add(j);
            }
        }
        return primeNumbersList;
    }

    public static int getUserInput() {
        Scanner input = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("Please, enter your number (bigger or equal to 2).");
            try {
                number = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("It wasn't number, try again");
            } catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("Something went wrong, closing");
                System.exit(0);
            }

        } while (number < 2);
        return number;
    }
}
