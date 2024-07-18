package hw_7;

import java.util.Arrays;

public class Method {
    public static void task(int aa) {
        String c;
        c = "\uD83E\uDD6D";
        String lb = "<<<<<<< <<<<<<<<<<<<<<<<<<<<<<<<<";
        String task = " Задача № ";
        String rb = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.println(c+c+c+c+c+c+c+c+c+c+c+c+c + task + aa + c+c+c+c+c+c+c+c+c+c+c+c+c+c);

    }

    public static void cas(int a) {
        String lb = "~~~~~~~~~~~~ ";
        String ca = " Case # ";
        String rb = " ~~~~~~~~~~~~";
        String c="🧾";

        System.out.println(c+c+c+c+c+c+c+c + ca + a + c+c+c+c+c+c+c+c+c);

    }

    public static void cl() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void arrname(String[] tiger) {
        String sc = ";";
        for (int i = 0; i < tiger.length; i++) {
            System.out.println(tiger[i] + sc);
        }
    }

    /**
     * выводит число кратное а
     * @param tiger
     * @param a
     */
    public static void multipleofa(String[] tiger, int a) {

        for (int i = 0; i < tiger.length; i++) {
            if (i % a == 0) {
                System.out.println(tiger[i]);
            }
        }
    }

    public static void oddInd(String[] tiger, int a) {

        for (int i = 0; i < tiger.length; i++) {
            if (i % a != 0) {
                System.out.println(tiger[i]);
            }
        }
    }

    public static void feed(String[] feed) {
        for (int i = 0; i < feed.length; i++) {
            if (feed[i].equals(String.valueOf(Colors.GREY))) {
                System.out.println(i + " Накорми кота!");
            } else {
                System.out.println(i + " Уже кушал");
            }

        }

    }

    public static void age(int[] catAges) {
        for (int i = 0; i < catAges.length; i++) {
            if (catAges[i] < 2) {
                System.out.println(i + " Отнеси кота на прививку!");
            } else {
                System.out.println(i + " Привиты ");
            }

        }
    }

    public static double average(int[] a) {
        double ave = 0;
        for (int i = 0; i < a.length; i++) {
            ave = ave + a[i];


        }
        return ave / a.length;

    }

    public static double aver(int[] a) {
        return Arrays.stream(a).average().getAsDouble();
    }


    public static int[] arrneg(int a, int b, int c) {
        int e = 0;
        for (int i = a; i <= b; i++) {
            if (i % c != 0) {
                e++;
            }
        }

        int[] odd = new int[e];
        e = 0;
        for (int i = b; i >= a; i--) {
            if (i % c != 0) {
                odd[e] = i;
                e++;


            }

        }
        return odd;
    }
    ////Math.floor(Math.random()*(max-min+1)+min) formula
    static public double[] createAr() {
        double[] arr = new double[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round((Math.random()*(100000-1+1)+1)*100)/100D;
        }
        return arr;
    }
    static public int[] createArr( int[] arr) {
//        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.floor(Math.random()*(100000-1+1)+1));
        }
        return arr;
    }


}





