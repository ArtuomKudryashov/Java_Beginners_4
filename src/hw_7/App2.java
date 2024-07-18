package hw_7;

import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
        Method.task(22);
         int[] rendarr =  Method.createArr(new int[10]);
        int counteven = 0;
        int countodd  = 0;
        for (int i = 0; i < rendarr.length ; i++) {
            if (rendarr[i] % 2 ==0) {
                counteven++;
            } else {
                countodd++;
            }

        }
        double [] arreven = new double[counteven];
        double [] arrodd=  new double[countodd];
        counteven = 0;
        countodd = 0;
        for (int i = 0; i < rendarr.length ; i++) {
            if (rendarr[i] % 2 ==0) {
                arreven[counteven] = rendarr[i];
                counteven++;
            } else if (rendarr[i] % 2 !=0) {
                arrodd[countodd] = rendarr[i];
                countodd++;
            }else{
                System.out.println("Error");
            }
        }
        System.out.println(Arrays.toString(arreven));
        System.out.println(Arrays.toString(arrodd));

    }
}
