package hw_3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class app {
    public static void main(String[] args) {
//        double d1 = 1.0;
//        double d2 = 3.0;
//        double d = d1 / d2;
//        System.out.println("double d : " + d);
//
//        float f = (float) d;
//        System.out.println("float f : " + f);

        String [] arr= new String[5];
        System.out.println(Arrays.toString(arr));

        arr [2] = "Apple";
        System.out.println(Arrays.toString(arr));

        arr [3] = "Orrange";
        System.out.println(Arrays.toString(arr));

        arr [2] = "Peach";
        System.out.println(Arrays.toString(arr));

        int [][] ar = new  int [5][5];
        System.out.println(Arrays.deepToString(ar));


        ar [2][3]= 5;
        System.out.println(Arrays.deepToString(ar));

        String [] test = {"Orange","Apple", "Grape"};
        System.out.println(Arrays.toString(test));

        System.out.println(test[1]);


        test [2] = "Apple";
        System.out.println(Arrays.toString(test));






          
    }
}
