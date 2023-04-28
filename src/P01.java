/*HACKER RANK PROBLEM # 01
 * Problem Statement:In an array, , of size , each memory location has some unique index,  (where ), 
 * that can be referenced as  or .
 *  Reverse an array of integers.
 */

import java.util.Scanner;

public class P01 {
    public static void reverseIntArray() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int max = 0;
        int array[] = new int[n];
        int arrayReverse[] = new int[n];

        System.out.println("Enter Array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        // Loop to reverse array
        for (int i = n - 1; i >= 0; i--) {
            arrayReverse[max] = array[i];
            max++;
        }
        // Loop to print arrayReverse
        for (int i = 0; i < n; i++) {
            System.out.print(arrayReverse[i] + " ");
        }
    }
}
