package helpers;

import java.util.Arrays;

public class Helper {
    public static void task(int aa) {
        String c;
        c = "5";
        String lb = "<<<<<<< <<<<<<<<<<<<<<<<<<<<<<<<<";
        String task = " Задача № ";
        String rb = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.println(c+c+c+c+c+c+c+c+c+c+c+c+c + task + aa + c+c+c+c+c+c+c+c+c+c+c+c+c+c);



    }
    public   static  int printArray(int[]arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i> 0){
                System.out.print(", ");


            }
            System.out.print(arr[i]);

        }
        System.out.print("]");
        return 0;

    }



}