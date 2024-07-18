package Lesson10StringChar;

import java.util.Arrays;

public class Lesson_10 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String space = " ";

        char a = 'a';
        Character aa = 'a';
        Character aaa = new Character('a');
        System.out.println(a == aa);
        System.out.println(aa == aaa);
        System.out.println(aa.equals(aaa));
        System.out.println(str1 + space + str2 + space + str3);

        String str4 = str1 + space + str2 + space + str3;


        System.out.println(str4);
        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(4));
        for (int i = 0; i <= 4; i++) {
            System.out.println(str4.charAt(i));


        }
        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) == 'a') {
                System.out.println(str4.charAt(i));
            }

        }
        System.out.println();
        System.out.println(Character.toString('i' - 1));
        System.out.println(Character.toString('i'));
        System.out.println(String.valueOf('i' - 1));

        String[] arrStr = new String[str4.length()];
        System.out.println(Arrays.toString(arrStr));
        for (int i = 0; i < str4.length() ; i++){
            arrStr[i] = Character.toString(str4.charAt(i));


        }

    }

}

