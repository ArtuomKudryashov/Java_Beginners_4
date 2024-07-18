package hw_8;

import java.nio.charset.IllegalCharsetNameException;

public class MethodsForFirstPart {
    String c;

    String lb = "<<<<<<< <<<<<<<<<<<<<<<<<<<<<<<<<";
    String task = " Task №  ";
    String rb = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";


    public static String compare(Integer a, Integer a_1, Double b, Double b_1,
                                 String c, String c_1) {
        String result = "___________________________________________________________\n";
        result += String.format("|%-20s|%-20s|%15s|%n", "HW8", "HW8_1", "areEquals");
        result += "___________________________________________________________\n";


        result += String.format("|%12s%-8d|%-14s%-6d|%15b|%n", "Integer a = ", a, "Integer a_1 = ", a_1, (a.equals(a_1)));
        result += "___________________________________________________________\n";
        result += String.format("|%-11s%-9.1f|%-13s%-7.1f|%15b|%n", "Double b = ", b, "Double b_1 = ", b_1, (b.equals(b_1)));
        result += "___________________________________________________________\n";
        result += String.format("|%-11s%-9s|%-13s%-7s|%15b|%n", "String a = ", c, "String c_1 =", c_1, (c.equals(c_1)));
        result += "___________________________________________________________\n";

        return result;


    }
}

//    //case 1
//    public static int [] arr (int a, int b, int c, int d,int e){
//        int [] arr = new int [5];
//
//        arr[0]= a;
//        arr[1]= b;
//        arr[2]= c;
//        arr[3]= d;
//        arr[4]= e;
//
//        return arr;
//    }
////    case 2
//    public static int[] createArray(int a,int b,int c,int d,int e){
//        return new int[]{a,b,c,d,e};
//    }
//
//    //TASK 8
//    public static double[] createArray(double a, double b, double c, double d, double e) {
//        return new double[]{a,b,c,d,e};
//    }
//
//    //TASK 9
//    public static String[] createArray(String a,String b,String c,String d,String e) {
//        String returnes = "";
//        String [] arr = new String[5];
//        arr[0]= a;
//        arr[1]= b;
//        arr[2]= c;
//        arr[3]= d;
//        arr[4]= e;
//          return arr;
//
//
////        return new String[]{a, b, c, d, e};
//    }
//
//
//
//
//    //TASK  10
//    public static double [] arrMulti (int[]arr,double f){
//        double [] arrNewD = new double[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            arrNewD[i]=arr[i]*f;
//
//        }
//        return arrNewD;
//    }
//    //Task 11
//    public static int  posit (int []arr){
//        int count = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i] <0){
//                return -100 ;
//            } else
//                if (arr [i] %2 == 0){
//                count++;
//            }
//        }
//        return count;
//    }
//    //TASk12
//    public static int [] positOdd (int []arr) {
//        int[] arr2 = new int[]{-100};
//        int odd = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                System.out.println("Присутствует отрицательное число");
//                return arr2 ;
//            } else if (arr[i] % 2 != 0) {
//                odd++;
//            }
//        }
//        int [] odd1 = new  int [odd];
//        int count = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i] % 2 != 0){
//                odd1[count]= arr[i];
//                count++;
//            }
//        }
//        return odd1;
//    }
//    //    TASK13
//    public static boolean []  whole (int[] arr){
//        boolean [] arrNewD = new boolean[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>10){
//               arrNewD [i]= true;
//            }else {
//                arrNewD [i] = false;
//            }
//
//        }
//        return arrNewD ;
//
//    }
//    //Task 14
//    public static String  world (String[] arr){
//        String result = "";
//        for (int i = 0; i < arr.length; i++) {
//            result += arr[i];
//
//        }
//        return result;
//
//    }
////    TASK 15
//    public static int whole15 (int[] arr){
//        if( arr.length % 2 !=0) {
//            int count = 0;
//            for (int i = (arr.length + 1) / 2; i < arr.length; i++) {
//                count = count + arr[i];
//            }
//            return count;
//        } else {
//            int count = 0;
//            for (int i = (arr.length ) / 2; i < arr.length; i++) {
//                count = count + arr[i];
//
//            }
//            return count;
//        }
//    }
//    //    TASK 16
//    public static int [] multiplication (int a){
//        int [] arr =new int[11];
//            if (a < 1 || a>=10){
//                return arr;
//            } else {
//                for (int i = 0; i <= 10 ; i++) {
//                arr [i] = a * i;
//
//            }
//
//        }
//        return arr;
//    }
//    //Task 17
//    public static int[] choseCreateArray(int []arr) {
//
//        int countEven = 0;
//        int countOdd = 0;
//
//        int[] arrNew = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                countEven++;
//            } else {
//                countOdd++;
//                }
//            }
//        int [] countEven1 = new int[countEven];
//        int [] countOdd1 = new int[countOdd];
//        int even = 0;
//        int odd = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr [i] % 2==0) {
//                countEven1[even]= arr[i];
//                even++;
//
//            } else {
//                countOdd1[odd] = arr[i];
//                odd++;
//            }
//        }
//        if (countEven > countOdd){
//            return  countEven1;
//        } else if (countOdd> countEven) {
//            return countOdd1;
//
//
//        }else {
//            return new int []{};
//        }
//
//    }
////    TASK 18
//    public static double [] rand100(int a){
//        if (a <0 ) {
//            return null;
//        }
//
//            double [] arr = new double[a];
//        for (int i = 0; i < a ; i++) {
//            arr [i] = (1+Math.random()*99);
//
//
//        }
//        return  arr;
//    }
////    TASK 19
//
//    public static int [] randLofN(int l, int d) {
//        int[] arr = new int[l];
//        for (int i = 0; i < l; i++) {
//            if( l < 0&& d<0){
//                return arr;
//            }if(d == 1){
//                arr[i] = (int) (1 * d + Math.random() * 9);
//            }else if(d == 2){
//                arr[i] = (int) (10 + Math.random() * 99);
//            }else if(d == 3){
//                arr[i] = (int) (100 + Math.random() * 999);
//            }else if(d == 4){
//                arr[i] = (int) (1000 + Math.random() * 9999);
//            } else if(d == 5){
//                arr[i] = (int) (10000 + Math.random() * 9999);
//            }else if(d == 6){
//                arr[i] = (int) (10000 + Math.random() * 99999);
//            }else if(d == 7){
//                arr[i] = (int) (100000 + Math.random() * 999999);
//            }else if(d == 8){
//                arr[i] = (int) (1000000 + Math.random() * 9999999);
//            }else if(d == 9) {
//                arr[i] = (int) (10000000 + Math.random() * 99999999);
//            }else if(d == 10) {
//                arr[i] = (int) (100000000 + Math.random() * 2147483647);
//            }else{
//                return null;
//            }
//
//
//
//
//        }
//        return arr;
//    }
////    TASK 20
//    public static int [] twodigits(int [] arr){
//        if (arr ==null|| arr.length==0){
//            return null;
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr [i] < 0){
//                System.out.println( "Один или более элементов меньше либо равен 0");
//                return null;
//            }
//        }
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if ( arr[i]>=10&&arr[i]<100){
//                count++;
//            }
//        }
//        int [] intTwo =new int[count];
//        int m =0;
//        for (int i = 0; i <arr.length ; i++) {
//            if (arr[i]>=10&& arr[i]<100) {
//                intTwo[m] = arr[i];
//                m++;
//            }
//        }
//        return intTwo;
//    }
////    TASK 21
//    public static int [] difer (int [] arr21) {
//        int[] arr = new int[arr21.length];
//        int des = 0;
//        int ed = 0;
//        int[] razn = new int[arr21.length];
//        int count = 0;
//        for (int i = 0; i < arr21.length; i++) {
//            des = arr21[i] / 10;
//            ed = arr21[i] % 10;
//            int raz = Math.abs(des - ed);
//            razn[count] = raz;
//            count++;
//
//        }
//        return razn;
//
//
//    }
////    TASK 22
//    public static String [] phoneNumber (int [] arr22) {
//        if (arr22.length !=11){
//            System.out.println("Количество цифр не релевантно");
//            return null;
//        }
//        String phone = "";
//        for (int i = 0; i < arr22.length ; i++) {
//            if(i==0){
//                phone += arr22[i]+"(";
//            } else if (i==3) {
//                phone += arr22[i]+")";
//
//
//            }else if (i==6) {
//                phone += arr22[i]+"-";
//
//
//            }else if (i==8) {
//                phone += arr22[i]+"-";
//
//
//            }else {
//                phone+=arr22[i]+"";
//
//
//            }
//
//
//        }
//        return new String[]{  "\""+ phone+ "\"", "\"USA\""};
//
//
//
//
//
//    }
//    //Buble
//    public static int[] buble(int []array) {
//
//        boolean isSorted = false;
//        while (!isSorted) {
//            isSorted = true;
//            int temp;
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    isSorted = false;
//                }
//            }
//        }
//        return array;
//    }
//
//
//}
