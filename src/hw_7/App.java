package hw_7;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String sc = ";";

        Method.task(1);
        String[] tiger = {"Грызя", "Даллас", "Мартин", "Тайсон", "Декстер",
                "Джерри", "Гуффи", "Джек"};
        Method.arrname(tiger);


        Method.task(2);
        tiger[4] = "Рыжик";
        tiger[1] = "Черныш";
        Method.arrname(tiger);


        Method.task(3);
        String[] tigerColors = new String[8];
        tigerColors[0] = String.valueOf(Colors.GREY);
        tigerColors[1] = String.valueOf(Colors.BLACK);
        tigerColors[2] = String.valueOf(Colors.GREY);
        tigerColors[3] = String.valueOf(Colors.BROWN);
        tigerColors[4] = String.valueOf(Colors.RED);
        tigerColors[5] = String.valueOf(Colors.GREY);
        tigerColors[6] = String.valueOf(Colors.RED);
        tigerColors[7] = String.valueOf(Colors.GREY);
        Method.arrname(tigerColors);

        Method.task(4);
        int[] catAges = new int[8];
        for (int i = 0; i < 8; i++) {
            catAges[i] = (int) (1 + Math.random() * 12);
            System.out.println(catAges[i] + sc);

        }
        Method.task(5);
        int a = 0;
        for (int i = 0; i < tigerColors.length; i++) {
                a += 1;
                System.out.println(a);
            }
        Boolean [] isCatRed = new Boolean[a];
        for (int i = 0; i < a; i++) {
            if (tigerColors[i].equals(String.valueOf(Colors.RED))) {
                System.out.println(isCatRed[i]=true);
            } else {
                System.out.println(isCatRed[i]=false);
            }

        }
        System.out.println(Arrays.toString(isCatRed));

        Method.task(6);
        Method.cas(1);
        System.out.println(tiger[5]);
        Method.cl();
        System.out.println();


        Method.cas(2);
        Method.multipleofa(tiger,2);

        Method.cl();
        System.out.println();

        Method.cas(3);
        Method.multipleofa(tiger,4);
        Method.cl();
        System.out.println();

        Method.cas(4);
        Method.oddInd(tigerColors,2);
        Method.cl();


        Method.cas(5);
        Method.multipleofa(tigerColors,3);
        Method.cl();




        Method.task(7);
        Method.feed(tigerColors);
        Method.cl();

        Method.task(8);
        Method.age(catAges);
        Method.cl();

        Method.task(9);
        System.out.println(tiger[tiger.length-1] + ", "+ "\n"
                + tigerColors[tigerColors.length-1]+", "
                + catAges[catAges.length-1]);

        Method.task(10);
        for (int i = 0; i < catAges.length; i++) {
            if(catAges[i] > 2){
                System.out.println("Name " +tiger[i] + " Age  " + catAges[i]);
            }

        }
        Method.task(11);
        for (int i = 0; i < 8 ; i++ ) {
            if (tiger[i].equals("Рыжик")&&isCatRed[i]==true ){
                System.out.println("Накорми кота!");
            }
            
            
        }
        Method.task(12);
        double age = 0;
        for (int i = 0; i < catAges.length; i++) {
            age +=  catAges[i];
        }
        System.out.println( age+" Общий возраст, средний возраст = " + (age/ catAges.length));
        System.out.println(Arrays.stream(catAges).average().getAsDouble());

        Method.task(13);
        Arrays.sort(catAges);// Что ты такое?

        System.out.println(Arrays.toString(catAges));
        System.out.println(catAges[0]);

        Method.task(14);
        Arrays.sort(catAges);
        System.out.println(Arrays.toString(catAges));
        System.out.println(catAges[catAges.length-1]);

        Method.task(15);
        a = 0;
        for (int i = 0; i < tigerColors.length; i++) {
            if (tigerColors[i].equals(String.valueOf(Colors.GREY))) {
                a++;
            }
        }
        System.out.println("Количество серых котов " + a);

        Method.task(16);
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0 && catAges [i]<= 3) {
                System.out.println("Имя кота " + tiger [i] + " " + catAges[i]);
            }

        }
        Method.task(17);
        a = 0;
        for (int i = 0; i <= 10; i = i +2 ) {
            System.out.println(i);
            a++;


        }
        System.out.println(a);
        int [] even = new int[a];
        a = 0;
        for (int i = 0; i <=10 ; i++) {
            if (i % 2 == 0){
                even [a] = i;
                a++;
            }
        }
        System.out.println(Arrays.toString(even));

        Method.task(18);
        Method.cas(1);

        Method.average(catAges);
        System.out.println(Method.average(catAges));
        Method.cl();

        Method.cas(2);
        System.out.println(Method.aver(catAges));


        Method.task(19);
        for (int i = 0; i < Method.arrneg(-1000,-900,2).length; i++) {
            System.out.println(Method.arrneg(-1000,-900,2)[i]);
        }
        Method.task(19);
        int[] even1 = Method.arrneg(-1000,-900,2);
        for (int i = 0; i < even1.length ; i++) {
            System.out.println(even1[i]);

        }


        Method.task(20);
        Method.cas(1);
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= ((int)(Math.random() * Integer.MAX_VALUE));

        }
        System.out.println(Arrays.toString(arr));
        Method.cl();

        Method.cas(2);
        Method.createAr();
        System.out.println(Arrays.toString(Method.createAr()));

        Method.cl();

        Method.cas(3);
        Method.createAr();
        System.out.println(Arrays.toString(Method.createArr(new int[5])));








    }


}
