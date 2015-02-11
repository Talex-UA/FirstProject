package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Enter first phrase");
        String string1= getString();

        System.out.println("Enter second phrase");
        String string2= getString();

        if (areAnagrams(string1,string2)){
            System.out.println("These phrases are anagrams");
        } else System.out.println("These phrases are NOT anagrams");

    }

    private static String getString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static boolean areAnagrams(String string1, String string2){
        char [] array1 = string1.toLowerCase().replaceAll("\\s+","").toCharArray();
        char [] array2 = string2.toLowerCase().replaceAll("\\s+","").toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}
