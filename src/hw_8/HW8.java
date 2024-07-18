package hw_8;



import java.util.Arrays;
import static helpers.Helper.*;

import static hw_8.MethodsForFirstPart.*;

public class HW8 {
    static Integer a = new Integer(100);
    static Double b = new Double(200);
    static String c = new String("Nikki");

    public static void main(String[] args) {

        task(6);
        System.out.println(compare(HW8_1.a, a, HW8_1.b, HW8.b, HW8_1.c, HW8.c));
    }
}

//        task(7);


//        System.out.println(Arrays.toString(arr((int) (1+Math.random()*Integer.MAX_VALUE), (int) (1+Math.random()*Integer.MAX_VALUE), (int) (1+Math.random()*Integer.MAX_VALUE),
//                (int) (1+Math.random()*Integer.MAX_VALUE), (int) (1+Math.random()*Integer.MAX_VALUE))));
//
//
//        System.out.println(Arrays.toString(arr(1,2,3,4,5)));
//
//        task(8);
//        System.out.println(Arrays.toString(createArray(Double.MIN_VALUE + Math.random() * Double.MAX_VALUE,
//                Double.MIN_VALUE + Math.random() * Double.MAX_VALUE,
//                Double.MIN_VALUE + Math.random() * Double.MAX_VALUE,
//                Double.MIN_VALUE + Math.random() * Double.MAX_VALUE,
//                Double.MIN_VALUE + Math.random() * Double.MAX_VALUE)));
//
//        task(9);
//        System.out.println(Arrays.toString(createArray("Hello ", "World", "My ", "First", "Project")));
//        System.out.println(Arrays.toString(createArray("Hello ", "World", "My ", "First", "Project")));
//
//        task(10);
//        System.out.println(Arrays.toString(arrMulti( createArray(1,2,3,4,5),2.5 )));
//
//        task(11);
//        System.out.println("Количество четных  положительных  чисел  = "
//                +posit(createArray(111,115,116,117,121)));
//
//         task(12);
//        System.out.println(Arrays.toString(positOdd(new int []{15,28,5,49,55,63,74,48})));
//
//        task(13);
//        System.out.println(Arrays.toString(whole(createArray(111,115,1,117,121))));
//
//        task(14);
//        System.out.println(world(new String [] {"GTA ", " SAN ", " Andreas "}));
//
//        task(15);
//        System.out.println(whole15(new int[]{(int)(Integer.MIN_VALUE+Math.random()*Integer.MAX_VALUE),
//                (int)(Integer.MIN_VALUE+Math.random()*Integer.MAX_VALUE),
//                (int)(Integer.MIN_VALUE+Math.random()*Integer.MAX_VALUE),
//                (int)(Integer.MIN_VALUE+Math.random()*Integer.MAX_VALUE),
//                (int)(Integer.MIN_VALUE+Math.random()*Integer.MAX_VALUE)}));
//        int [] arr ={1,2,3,4,5,6,7};
//        int [ ] arr2 = {1,2,3,4,5,6,7,8,9,10,11,-5,13,14};
//        System.out.println(whole15(arr));
//        System.out.println(whole15(arr2));
//
//
//        task(16);
//        System.out.println(Arrays.toString(multiplication(2)));
//
//        task(17);
//        System.out.println(Arrays.toString(choseCreateArray((arr2))));
//
//        task(18);
//        System.out.println(Arrays.toString(rand100(3)));
//
//        task(19);
//        System.out.println(Arrays.toString(randLofN(11,15)));
////        System.out.println(Integer.MAX_VALUE);
//
//        task(20);
//        System.out.println(Arrays.toString(twodigits(arr2)));
//
//        task(21);
//        System.out.println(Arrays.toString(difer(new int []{15,28,31,49,55,63,74,48})));
//
//        task(22);
//        System.out.println(Arrays.toString(phoneNumber(new int[]{1,8,0,0,1,2,3,4,5,6,7})));
//
//        task(23);
//        int[] array = new int[]{64, 36, -5,64,36,-57};
//        printArray(buble(array));
//
//        System.out.println("Упорядочанный Аррэй");
//        printArray(array);
//        System.out.println();
//        int count =0;
//        for (int i = 0; i < array.length-1; i++) {
//            if (array[i + 1] - array[i] != 0) {
//                count++;
//            }
//        }
//
//
//
//        System.out.println("Количество элемментов массива = "+ count);
//
//
//
//        int [] unique = new int[count];
//        int metters =0;
//        for (int i = 0; i < array.length-1; i++) {
//            if (array[i+1]- array[i]!=0) {
//                unique[metters]=array[i];
//                metters++;
//            }else {
//
//            }
//        }
//        printArray(unique);
//
//
//    }
//}



