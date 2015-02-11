package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Enter first phrase");
        Scanner input1 = new Scanner(System.in);
        String s1 = input1.nextLine();

        System.out.println("Enter second phrase");
        Scanner input2 = new Scanner(System.in);
        String s2 = input2.nextLine();

        if (areAnagrams(s1,s2)){
            System.out.println("These phrases are anagrams");
        } else System.out.println("These phrases are NOT anagrams");

    }

    public static boolean areAnagrams(String s1, String s2){
        char [] array1 = s1.toLowerCase().replaceAll("\\s+","").toCharArray();
        char [] array2 = s2.toLowerCase().replaceAll("\\s+","").toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}
