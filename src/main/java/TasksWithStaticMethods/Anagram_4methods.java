package TasksWithStaticMethods;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram_4methods {
    public static void main(String[] args) {

        printResult(areAnagrams(getString()));
    }

    public static void printResult(boolean isAnagram) {
        if (isAnagram){
            System.out.println("These phrases are anagrams");
        } else System.out.println("These phrases are NOT anagrams");
    }

    public static UserInput getString() {
        Scanner input = new Scanner(System.in);
        UserInput userInput = new UserInput();
        System.out.println("Enter first phrase");
        userInput.input1=input.nextLine();
        System.out.println("Enter second phrase");
        userInput.input2=input.nextLine();
        return userInput;
    }

    public static boolean areAnagrams(UserInput userInput){
        char [] array1 = userInput.input1.toLowerCase().replaceAll("\\s+","").toCharArray();
        char [] array2 = userInput.input2.toLowerCase().replaceAll("\\s+","").toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
    static class UserInput {
        String input1;
        String input2;
    }

}

