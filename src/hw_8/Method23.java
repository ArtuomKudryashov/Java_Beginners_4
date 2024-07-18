//package hw_8;
//
//
//
//public class Method23 {
//    public static int [] unic(int []arr){
//        if(arr.length==0||arr.length==1){
//            return arr;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] < 0){
//                return arr;
//            }
//
//        }
//       MethodsForFirstPart.buble(arr);
//
//        int scount = 1;
//        for (int i = 1; i < arr.length ; i++) {
//            if(arr [i]!=arr[i-1]){
//                scount++;
//            }
//        }
//        int [] ar = new int[scount];
//        int supcount =1;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] != arr[i-1]) {
//                ar[supcount-1]=arr[i-1];
//                ar[supcount++] =arr[i];
//            }
//        }
//
//        return ar;
//
//
//    }
//    public static String dif24(int[]arr){
//        unic(arr);
//        System.out.println("");
//        int dif = arr.length-unic(arr).length;
//        return "Количество уникальных = "+unic(arr).length
//                +" Количество не уникальных =  "+dif;
//    }
//    public static int [] ind(int [] arr, int a , int b){
//        if (arr.length==0|| arr.length==1||a < 0 || b < a || b >arr.length) {
//                    return new int[]{0, 0, 0, 0};
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] < 0){
//                return new int[]{1,1,1,1,1,1};
//            }
//
//        }
//        int count =0;//      3+  8-3
//        for (int i = 0; i <=(b-a); i++) {
//            count++;
//
//            }
//        System.out.println(count);
//        int [] ind = new int[count];
//        count =0;
//        for (int i = a; i <=b; i++) {
//            ind [count]=arr[i];
//            count++;
//        }
//        return ind;
//    }
//
//}
