package Tasks;

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
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length");
        int length;

        while (true){
            try{
                length=in.nextInt();
                if (length<1) throw new RuntimeException();
                break;
            }
            catch (Exception e){
                System.out.println("Try again");
                in.skip(".*");
            }

        }

        System.out.println("Fill your array");
        int [] array=new int[length];

        for (int i = 0; i < length; i++) {
            try{
                array[i]=in.nextInt();
            }
            catch (Exception e){
                System.out.println("Try again");
                in.skip(".*");
                i--;
            }
        }
        return array;
    }
}
