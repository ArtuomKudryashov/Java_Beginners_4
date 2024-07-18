//package hw_8;
//
//import helpers.Helper;
//
//public class Methodfor26 {
//       public static int[] union(int[] arr, int[] arr2) {
//        if(arr.length==0&&arr2.length==0){
//            return new int[]{Integer.MIN_VALUE};
//        }
//        int[] superArr = new int[arr.length + arr2.length];
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            superArr[i] = arr[i];
//            count++;
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            superArr[count++] = arr2[i];
//        }
//        Helper.printArray(MethodsForFirstPart.buble(superArr));
//
//        int scount = 1;
//        for (int i = 1; i < superArr.length ; i++) {
//            if(superArr [i]!=superArr[i-1]){
//                scount++;
//            }
//        }
//        int [] ar = new int[scount];
//        int supcount =1;
//        for (int i = 1; i < superArr.length; i++) {
//            if (superArr[i] != superArr[i-1]) {
//                ar[supcount-1]=superArr[i-1];
//                ar[supcount++] =superArr[i];
//            }
//        }
//
//       return ar;
//
//
//
//
//    }
//
//}
