/*HACKER RANK DS PROBLEM # 02
 * Problem Statement:Calculate the hourglass sum for every hourglass in , 
 * then print the maximum hourglass sum. The array will always be .
 */
import java.util.Scanner;

public class DS_P02 {
    public static void maxHourGlass() {
        //take 6x6 matrix as input
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[6][6];
        int max = 0;
        int hourglass = 0;
        int array[] = new int[16];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[max] = a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                max++;
            }
        }
        hourglass = array[0];
        for (int i = 0; i < 16; i++) {
            if (hourglass < array[i]) {
                hourglass = array[i];
            }
        }
        System.out.println(hourglass);
    }
}