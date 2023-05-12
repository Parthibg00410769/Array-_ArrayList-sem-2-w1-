package ie.atu;
import java.util.Scanner;
import java.util.Arrays;
public class ArrrayD {
    public static void main(String[] args) {

        //Declares an array of integers
        int[] anArray;

        //Allocates memory for 10 integers
        anArray = new int[10];

        //Initialise elements
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        //Print elements
        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: " + anArray[6]);
        System.out.println("Element at index 7: " + anArray[7]);
        System.out.println("Element at index 8: " + anArray[8]);
        System.out.println("Element at index 9: " + anArray[9]);

        //Try Catch to detect an out of bounds exception
        try {
            int indexValue = 0;

            //Enhanced for loop
            for (int value : anArray) {
                System.out.println("Element at index " + indexValue + " : " + value);
                indexValue++;
            }
            Scanner myScan = new Scanner(System.in);
            System.out.println("Please enter a new number: ");
            anArray[10] = myScan.nextInt();

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }
    }

}


