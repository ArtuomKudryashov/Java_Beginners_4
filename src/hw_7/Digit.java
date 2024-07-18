package hw_7;

import java.util.Arrays;

public class Digit {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,7,8}, {4}, {9,8,5}, {8,7,9,152}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[2].length ; j++) {
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();

        }

    }
}
