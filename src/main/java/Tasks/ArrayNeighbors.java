package Tasks;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArrayNeighbors {
    public static void main(String[] args) {
        int [] array=createarray();
        findneighborsindex(array);
    }

    public static void findneighborsindex(int[] array) {
        boolean b = true;
        for (int j = 1; b; j++) {
            for (int i = 0; i < array.length - j; i++) {
                int x = Math.abs(array[i] - array[i + j]);
                if (x == 1) {System.out.println(i); b = false;}
            }
        }
    }

    public static int [] createarray(){
        Scanner input = new Scanner(System.in);
        int length=0;

        while (true){
            try{
                System.out.println("Enter array length");
                length=input.nextInt();
            }

            catch (InputMismatchException e){}
            catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("Something went wrong, closing");
                System.exit(0);
            }

            if (length>=1) break;

            System.out.println("Please, try again");
            input.skip(".*");
        }

        System.out.println("Fill your array");
        int [] array=new int[length];

        for (int i = 0; i < length; i++) {
            try{
                array[i]=input.nextInt();
            }

            catch (InputMismatchException e){
                System.out.println("Try again");
                input.skip(".*");
                i--;
            }
            catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("Something went wrong, closing");
                System.exit(0);
            }
        }
        return array;
    }
}
