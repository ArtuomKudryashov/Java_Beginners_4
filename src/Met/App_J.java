package Met;

import helpers.Helper;

import static Met.Method_J.*;

public class App_J {
    public static void main(String[] args) {
                      //       0  1   2    3   4  5  6  7   8   9   10 11 12  13  14
        int[] arr = new int[]{10, 15, 45, 45, 14, 3, 5, 10, 15, 14, 3, 5, 14, 45, 3};

        Helper.printArray(unikal(arr));


    }
}