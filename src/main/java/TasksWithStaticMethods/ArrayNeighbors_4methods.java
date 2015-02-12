package TasksWithStaticMethods;

import java.util.Scanner;

public class ArrayNeighbors_4methods {
    public static void main(String[] args) {
        int [] intArray=getUserInput();
        int index = findNeighborsIndex(intArray);
        printIndex(index);
    }

    public static void printIndex(int index) {
        System.out.println(index);
    }

    public static int [] getUserInput() {
        Scanner input=new Scanner(System.in);
        String [] stringArray;
        int [] array;
        do{
            System.out.println("Please, enter your array using spaces between numbers");
            stringArray = input.nextLine().split("[ ]+");
            array = new int[stringArray.length];
            try{
                for (int i = 0; i < array.length; i++) {
                    array[i]=Integer.parseInt(stringArray[i]);
                }
            }
            catch(NumberFormatException e){
                System.out.println("You can use numbers only");
                array=new int[0];
            }
        } while (array.length<1);

        return array;
    }

    public static int findNeighborsIndex(int[] array) {
        for (int distance=0; true; distance++) {
            for (int i = 0; i < array.length-1; i++) {
                if (Math.abs(array[i]-array[i+1])==distance){
                    return i;
                }
            }
        }

    }
}
