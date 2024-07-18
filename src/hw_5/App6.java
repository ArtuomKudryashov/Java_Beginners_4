package hw_5;

public class App6 {
    public static void main(String[] args) {


        task(6);
        cas(1);
        double decim = 20.75;
        rub(20.75);
        casl();

        cas(2);
        String res =cas2(20.75);
        System.out.println(res);

        stVerifyEquals(res,"20 Руб. 75 Коп. ");

        task(7);

        System.out.println(weight(10.75));









    }
    public static void cas(int b) {

        System.out.println("~~~~~~~~~~~~~~~~~~~ " + b + " ~~~~~~~~~~~~~~~~~~~ ");
    }

    public static void casl() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void task(int aa) {
        String lb = "<<<<<<<<<<<<<<<<<<<<<<<<<<<< ";
        String task = " Задача № ";
        String rb = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.println(lb + task + aa + rb);
    }
    //------------------------------6-----------------------------------
    public static String rub (double cost) {
        String rub = " Руб ";
        String cent = " Коп ";

        System.out.println("Для центов переменная");
        double cents = cost * 100 % 100;  //75.0
        System.out.println(cents);

        System.out.println("Переводим число cost в стринг");
        String rubl = String.valueOf(cost);
        System.out.println(rubl);

        System.out.println("Переводим число cents в стринг");
        String centsTotal = String.valueOf(cents);
        System.out.println(centsTotal);
        System.out.println("Пишем результат");
        String result = rubl.substring(0, rubl.indexOf(".")) + rub + centsTotal.substring(0, centsTotal.indexOf(".")) + cent;
        System.out.println(result);
        return rubl;

    }

         public static String cas2(double cost){
        String rub = " Руб. ";
        String cent = " Коп. ";
        System.out.println("Переводим в стринг");
        String priceInCents = String.valueOf(cost);
        System.out.println(priceInCents);

        System.out.println("Выводим рубли  и копейки");
        String r= priceInCents.substring(0,2);
        String cop = priceInCents.substring(3,5);
        return r+rub+cop+cent;


//------------------------------7-----------------------------------




    }
    public static String weight (double weight) {
        String kg = " кг ";
        String gr = " гр ";

        System.out.println("Для гр переменная");
        double gram = weight * 100 % 100;  //75.0
        System.out.println(gr);

        System.out.println("Переводим число kg в стринг");
        String kgr = String.valueOf(weight);
        System.out.println(kgr);

        System.out.println("Переводим число gr в стринг");
        String grTotal = String.valueOf(gram);
        System.out.println(grTotal);
        System.out.println("Пишем результат");
        String result = kgr.substring(0, kgr.indexOf(".")) + kg + grTotal.substring(0, grTotal.indexOf(".")) + gr;
        System.out.println(result);
        return result;
    }
    public static void stVerifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\033[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\033[0m");
        }


    }
}
