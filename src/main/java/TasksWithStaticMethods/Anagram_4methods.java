package TasksWithStaticMethods;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram_4methods {
    public static void main(String[] args) {

        UserIput input = new UserIput();

        input= getString(input);
        boolean res = areAnagrams(input);
        printResult(res);
    }

    public static void printResult(boolean isAnagram) {
        if (isAnagram){
            System.out.println("These phrases are anagrams");
        } else System.out.println("These phrases are NOT anagrams");
    }

    public static UserIput getString(UserIput userIput) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first phrase");
        userIput.input1=input.nextLine();
        System.out.println("Enter second phrase");
        userIput.input2=input.nextLine();
        return userIput;
    }

    public static boolean areAnagrams(UserIput userIput){
        char [] array1 = userIput.input1.toLowerCase().replaceAll("\\s+","").toCharArray();
        char [] array2 = userIput.input2.toLowerCase().replaceAll("\\s+","").toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}

class UserIput{
    String input1;
    String input2;
}