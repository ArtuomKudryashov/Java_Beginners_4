package HW_6;

public class Methods_2 {
    public static void seq(int l, int a) {
        int end = a;
        for (int i = 0; end < l; i += 2) {
            System.out.println(i);
            end++;
        }

    }

    public static void seq2(int n) {
        int end = 1;
        for (int i = 2; end <= n; i = i * 2) {
            System.out.println(i);
            end++;
        }

    }

    public static void st(int n) {
        int end = 1;
        for (int i = 2; end <= n; i = i * 2) {
            System.out.println(i);
            end++;
        }

    }

    public static String task13() {
        String result1 = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";
        for (int i = 0; i < 10; i++) {
            result1 = result1 + i;
            result2 = result2 + i + i;
            result3 = result3 + i + i + i;
            result4 = result4 + i + i + i + i;

        }
        return result1 + result2 + result3 + result4;

    }

    public static void task14() {
        System.out.print(0);
        for (int i = 1; i < 6; i++) {
            System.out.print(", " + i + ", " + (i * -1));

        }
    }

    public static void task15() {
        int i;
        for (i = 0; i < 26; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task16(int n, int m, int l) {
        if (n % 2 == 0 && m % 2 == 0) {
            System.out.println("Проверь шаги и числа");
        } else {
            while (l > 0) {
                if (n % 2 != 0) {
                    System.out.println(n + " ");
                    l--;
                }
                n = n + m;
            }
        }
    }
    public static  void  task17(int n){
        int l = n + 5;
        for (; n < l;  n++){
            System.out.println("[" + (n + 1) + "]" + " = " + (n +2) );


        }


    }
    public  static  void  task18(int n , int l){
        if (n < l) {

               System.out.println("[" + (n) + "]" + " = " + n);
               for (; n < l; n++ ){
                   System.out.println("[" + (n + 1) + "]" + " = " + (2 * n));
                }


        }else {
            System.out.println("Invalid data");

        }

    }
    public  static  void task19(){
        int des = 0;
        int ed = 0;
        for (int i = 10; i < 100; i ++) {
            des = i /10;
            ed = i % 10;
            if (des - ed <=3 && ed - des <= 3){
                System.out.print(i + " ");
            }
        }
    }

}


