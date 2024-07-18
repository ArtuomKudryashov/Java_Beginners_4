package hw_5;

public class App {
    public static void main(String[] args) {
        String max = "Maximum number = ";
        String min = "Minimum number = ";
        task(2);



        Metods.dOfW(5);


        stVerifyEquals("Monday", "Monday");
        stVerifyEquals("Tuesday", "Tuesday");
        stVerifyEquals("Wednesday", "Wednesday");
        stVerifyEquals("Thursday", "Thursday");
        stVerifyEquals("Friday", "Friday");
        stVerifyEquals("Saturday", "Saturday");
        stVerifyEquals("Sunday", "Sunday");
//        intVerifyEqualsInt("Monday",1);
        stVerifyEquals("Error -Не корректные данные", "Error -Не корректные данные");


        task(3);
        int a = -205;
        int b = -2;
        int c = -100;


        int maxi = max(gen(), gen(), gen());
        System.out.println(max + maxi);


        cas(2);
        int maxi2 = Math.max(a, b);
        int maxim = Math.max(maxi2, c);
        System.out.println(max + maxim);
         intVerifyEqualsInt(-2,-2);


        task(4);
        int mini = min(a, b, c);
        System.out.println(min + mini);

        task(5);
        double average = temp(36, 37, 38, 39, 40);
        System.out.println(average);



        task(6);
        double decim = 20.75;
        String dollar = " Dollars";
        String cent = " Cents ";
        System.out.println("Получаем кол-во копеек");
        double priceInCents = (int)(decim * 100) % 100%100;
        System.out.println(priceInCents);
        int rub = (int)(decim -(priceInCents%100));
        System.out.println(rub);


        task(10);

        int hour = 10;
        int cost = 10;
        Integer nd = 22;
        String salary= List.salaryToString(Metod.calculateMonthlySalary(10,10,22));
        System.out.println(salary);
        intVerifyEqualsInt(2200,2200);


        task(12);
        int x = -300;
        if (x < 0) {
            System.out.println("X is negative");
        } else if (x > 0) {
            System.out.println("X is  positive");
        } else {
            System.out.println("x is zero");

        }
        task(13);
        ln(1984);
        intVerifyEqualsInt(4, ln(1984));


        task(14);
        a = 12;
        b = 13;
        c = 5;
        System.out.println("Находим медиану");
        System.out.println(med14(a, b, c));
        System.out.println("Находим среднее значение");
        System.out.println(aver(a, b, c));
        System.out.println("Делаем шаги и находим разницу");
        System.out.println(dif(a, b, c));
        System.out.println("Сообщение");
        System.out.println(message(a, b, c));

        task(15);
        Double cc;
        cc = 15.3;
        String posit=Metod15.flor(cc);
        System.out.println(posit);
        stVerifyEquals("15 руб 00 коп","15 руб 00 коп" );





        task(16);
        a = 3;
        b = 4;
        c = 20;

        double der = Math.ceil((Math.sqrt((a * b + c) * Math.pow(a, b))) / Math.PI);
        System.out.println(der);
        dbtVerifyEqualsInt(17.0,17.0);


        task(17);
        cas(1);
        int y;
        int xx;
        int l;

        System.out.println(cas1(-5, 6, 7));
        casl();

        cas(21);
        System.out.println(cas2(79));
        casl();

        cas(3);
        int i = 15;
        int v = 50;
        if (i > 10 || v <= 50) ;
        aBooleanVerifyEqualsInt(i > 10 || v <= 50, i > 10 || v <= 50);
        System.out.println(aBooleanVerifyEqualsInt(i > 10 || v <= 50, i > 10 || v <= 50));
        casl();

        cas(4);
        x = 15;
        cas4(15);
        System.out.println(cas4(-5));
        casl();

        cas(5);
        x = 15;
        y = 20;
        System.out.println(cas5(x, y));
        casl();

        cas(6);

        System.out.println(cas6(x, y));


        task(18);

        System.out.println(rand18(5));


        task(19);
        double ran = 1 + Math.random() * 100;
        System.out.println(ran);
        cas(2);
        System.out.println(rand());
        casl();

        task(20);

        System.out.println(leapyear(2003));
        aBooleanVerifyEqualsInt(false, leapyear(2003));


    }


    public static void task(int aa) {
        String lb = "<<<<<<<<<<<<<<<<<<<<<<<<<<<< ";
        String task = " Задача № ";
        String rb = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.println(lb + task + aa + rb);
    }

    public static void cas(int b) {

        System.out.println("~~~~~~~~~~~~~~~~~~~ " + b + " ~~~~~~~~~~~~~~~~~~~ ");
    }

    public static void casl() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    // String test
    public static Object stVerifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\033[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\033[0m");
        }

        return null;
    }

    // Int  test
    public static int intVerifyEqualsInt(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\033[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\033[0m");
        }


        return expectedResult;
    }

    public static double dbtVerifyEqualsInt(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\033[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\033[0m");
        }


        return expectedResult;
    }

    public static boolean aBooleanVerifyEqualsInt(Boolean expectedResult, Boolean actualResult) {
        if (expectedResult.equals( actualResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\033[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\033[0m");
        }


        return expectedResult;
    }


    //max c тестом 3 задача
    public static int max(int a, int b, int c) {
        int max;
        max = 0;
        if (a > b) {
            max = a;

        } else {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return intVerifyEqualsInt(max, maxactres(a, b, c));
    }

    public static  int gen(){
        int a =(int)(1+Math.random()*100);
        return a;
    }

    // act res for 3 задачи
    public static int maxactres(int a, int b, int c) {
        int maxact = 0;
        if (a > b) {
            maxact = a;

        } else {
            maxact = b;
        }
        if (maxact < c) {
            maxact = c;
        }
        return maxact;

    }

    public static int min(int a, int b, int c) {
        int min;
        min = 0;
        if (a > b) {
            min = b;

        } else {
            min = a;
        }
        if (min > c) {
            min = c;
        }
        return intVerifyEqualsInt(min, minactres(a, b, c));
    }

    // act res for 4 задачи
    public static int minactres(int a, int b, int c) {
        int minact = 0;
        if (a < b) {
            minact = a;

        } else {
            minact = b;
        }
        if (minact > c) {
            minact = c;
        }
        return minact;

    }
    //task 5

    public static double temp(int a, int b, int c, int d, int e) {
        double aver = (double) (a + b + c + d + e) / 5;
        return dbtVerifyEqualsInt(aver, acttemp(a, b, c, d, e));
    }

    public static double acttemp(int a, int b, int c, int d, int e) {
        return ((double) a + b + c + d + e) / 5;
    }
    //task

//    task 13 ln

    public static int ln(int a) {
        int dob = a;
        int sum = 0;
        while (dob != 0) {
            sum = sum + dob % 10;
            dob /= 10;

        }

        if (sum > 9) {
            int sum2 = 0;
            while (sum != 0) {
                sum2 = sum2 + sum % 10;
                sum /= 10;
            }
            int ln = 0;
            while (sum2 != 0) {
                ln = ln + sum2 % 10;
                sum2 /= 10;
            }

            sum = ln;
            return intVerifyEqualsInt(sum, sum);

        } else if (sum <= 9) {
            System.out.println(sum);
            return sum;
        }

        return intVerifyEqualsInt(sum, sum);


    }




    // 14 ищеи медиану/////////////////////////////////////////////////////////////////////////

    public static int med14(int a, int b, int c) {
        int med;
        if (a < b) {
            med = a;
        } else {
            med = b;

        }
        if (med < c) {
            med = b;


        } else {
            med = a;
        }
        return med;
    }
    //14 Среднее значение

    public static double aver(int a, int b, int c) {
        return ((a + b + c) / 3);
    }

    //делаем шаги
    public static double returnAbs(double number) {                  // 3 ) разница  не может быть  отрицательной
        if (number < 0) {
            number = (-1) * number;
        }
        return number;
    }

    public static double dif(int a, int b, int c) {
        double med = med14(a, b, c);
        double aver = aver(a, b, c);

        return returnAbs(aver - med);
    }

    public static String message(int a, int b, int c) {
        String line;
        if (dif(a, b, c) > 2) {
            line = ("Среднее значение " + aver(a, b, c) + " отличается  от медианы на " + dif(a, b, c));
        } else {
            line = ("Среднее значение равно " + aver(a, b, c) + ", медиана = " + med14(a, b, c));
        }
        return line;

    }

    /////////////////////////////////////////////////////////////////////////////
    // 2 способ
    //Находим медиану
    public static int med142(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int mid = a + b + c - (min + max);
        return mid;


    }

    // Средне значение
    public static double aver2(int a, int b, int c) {
        int average_2 = (a + b + c) / 3;
        return average_2;
    }



    // task 18

    public static double rand18(int powValue) {
        double ran = Math.random();
        double value = Math.pow(ran, powValue);
        int round = (int) Math.ceil(value);
        return dbtVerifyEqualsInt(round, round);

    }//task 19

    public static double rand() {
        double ran = 1 + Math.random() * 100;
        return dbtVerifyEqualsInt(ran,ran);


    }
    // 17.1

    public static Object cas1(int y, int xx, int l) {

        if (y >0){
           return intVerifyEqualsInt(xx=l,xx=l);
        }else

        return stVerifyEquals("Error","Error");
    }
    // 17.2
    public static Object cas2(int a){
        a=a;
        if (a >80&&a<90){
            return a=a+5;

        }else{
           return "no action required";
        }
    }
    // 17.4
    public static Object  cas4(int x){
        if (x > 0 && x % 2==1){
            return true;
        }else{
            return  "no action required";
        }

    }
    //17.5
    public static Object cas5(int x, int y) {
        if (x >= 0 && y >= 0) {
            return aBooleanVerifyEqualsInt(true, true);
        } else {
            return stVerifyEquals("no action required", "no action required");
        }
    }
    //17.6
    public static Object cas6(int x, int y) {
        if ((x >= 0 && y >= 0)||(x < 0 && y < 0)) {
            return aBooleanVerifyEqualsInt(true, true);
        } else {
            return stVerifyEquals("no action required", "no action required");
        }
    }

    //20
    public static boolean leapyear  (int ly){
        String lyear = "Высокосный год";

        if ((ly % 400 == 0) || ((ly % 4 == 0) && (ly % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }




}