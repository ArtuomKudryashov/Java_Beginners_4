package hw_3;

import java.awt.*;
import java.net.Proxy;

public class HW_3 {
    public static void main(String[] args) {

        String sh = "Short ";
        String shs = "short ";
        String by = "byte ";
        String in = "int ";
        String inte = "int ";
        String lon = "long ";
        String fl = "float ";
        String db = "Double ";
        String lb = "<<<<<<<<<<<<<<<<<<<<<<<<<<<< ";
        String task = " Задача № ";
        String rb = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        char sc = ';';
        String max = "Максимальное ";
        String value = " значение =  ";
        String ded = "разница = ";
        String negative = "негативное значение =";
        String positive = "позитивное значение = ";
        String eqs = "= ";
        String sp = " ";

        int taskn = 2;
        String border = lb + task + taskn + rb;
        System.out.println(border);

        byte a = 37;
        byte b = -45;
        System.out.println("\u0061");

        System.out.println(by+ "\u0061" +sp + eqs + a + sc + "\n" + by + "\u0062"+sp + eqs + b + sc);
        System.out.println();

        taskn = 3;
        border = lb + task + taskn + rb;

        System.out.println(border);

        int dif = 60000;
        short poz = Short.MAX_VALUE;
        short neg = (short) (poz - dif);
        System.out.println(sh + positive + poz + sc + "\n" + ded + dif + sc + "\n" + sh + negative + neg + sc);
        System.out.println();

        taskn = 4;
        border = lb + task + taskn + rb;
        System.out.println(border);
        String ll = "|         ";
        String cl = "           |               ";
        String rl = "           |";

        String title = "|      Type of verible        |                 Value               |";
        String line = "_____________________________________________________________________";
        max = " max ";
        String min = " min ";
        int i = Integer.MIN_VALUE;
        i = Integer.MAX_VALUE;

        System.out.println(line);
        System.out.println(title);
        System.out.println(line);
        System.out.println(ll + inte + min + cl + (i + 1) + rl);
        System.out.println(line);
        System.out.println(ll + inte + max + cl + sp + i + rl);
        System.out.println(line);
        System.out.println();

        taskn = 5;
        border = lb + task + taskn + rb;

        System.out.println(border);

        long phoneNumber = 1_800_999_8877l;
        System.out.println("My phone number is " + phoneNumber);
        System.out.println();

        taskn = 6;
        border = lb + task + taskn + rb;

        System.out.println(border);

        ll = "| ";
        cl = "       |                ";


        float f = 100.101101f;
        double d = 1000.101101;
        // Верхняя линия
        System.out.println(line);
        //Названия столбцов
        System.out.println(title);
        //Линия
        System.out.println(line);
        //Строка  float
        System.out.println(ll + fl + sp +sp + "\u0066" + eqs+ f + sp+ cl + f + rl);
        System.out.println(line);
        cl = "     |                ";
        rl = "          |";
        System.out.println(ll + db + "\u0064 " + eqs + d + sp + cl + d + rl);
        System.out.println(line);

        taskn = 7;
        border = lb + task + taskn + rb;
        System.out.println(border);

        String table6 = line + "\n" + title + "\n" + line + "\n"
                + ll + fl + " f = " + f + sp + sp + cl + f + sp + rl + "\n" + line + "\n" + ll + db
                + " d = " + d + cl + d + rl + "\n" + line;

        double t = 10.09999;
        double tw = 20.0999;

        Double dd = t + tw;

        double d1 = 10.09999;
        double d2 = 20.0999;
        double ds = d1 + d2;

        float ff = (float) ds;
//        System.out.println(table);

        System.out.println(table6 + "\n"
                + ll + fl + sp+ " ff = " + ff + sp  + sp + cl + f + sp + rl + "\n" + line + "\n" + ll + db + " dd= "
                + d + cl + d + rl + "\n" + line);
        String table7 = ll + fl + sp+" ff = " + ff  + sp + sp + cl + f + sp + rl + "\n" + line + "\n" + ll + db + " dd= "
                + d + cl + d + rl + "\n" + line;

        System.out.println("Через  переменные");
        System.out.println(table6 + "\n"
                          +table7);

        taskn = 8;
        border = lb + task + taskn + rb;

        System.out.println(border);

        float result = (float) 1.0 * 10 / 3;
        System.out.println("result = " + result);
        Double res = (double) 1.0 * 10 / 3;
        Double res1 = (double)  10 / 3;
        Double res2 = 1.0 * 10 / 3;

        System.out.println("result = " + res);

        taskn = 9;
        border = lb + task + taskn + rb;

        System.out.println(border);
        String fd = " f and d = ";

        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double reminder = f % d;
        System.out.println(" sum" + fd + sum);
        System.out.println(" product" + fd + product);
        System.out.println(" quotient" + fd + quotient);
        System.out.println(" reminder" + fd + reminder);

        taskn = 10;
        border = lb + task + taskn + rb;

        System.out.println(border);

        System.out.println("::      ::     ::::::::      ::          ::          ::::::::::    \n"
                         + "::      ::     ::            ::          ::          ::      ::    \n"
                         + "::      ::     ::            ::          ::          ::      ::    \n"
                         + "::::::::::     ::::::        ::          ::          ::      ::    \n"
                         + "::      ::     ::            ::          ::          ::      ::    \n"
                         + "::      ::     ::            ::          ::          ::      ::    \n"
                +          "::      ::     :::::::::     :::::::::   ::::::::::  ::::::::::    ");


        taskn = 12;
        border = lb + task + taskn + rb;
        System.out.println(border);


        line = "__________________________________________________________________________________________";
        title = "|  Type    | Size in bits |                min            |               max            |";
        ll = "| ";//1
        rl = "        | "; //8
        String rbl = "       |";
        String spB4 = "    "; //4
        String spSH5 = "   ";//3
        String spInt3 = "     ";//5
        String spDoub6 = "  ";//2
        String spb = "                "; //16


        System.out.println(line + "\n" + title);
        System.out.println(line);
        //|_2___5_____4____|2___1____4______8|__2____4 ____________16_____2________8| 2______3 __________16______2_________8
        //               11              15               32                              31
        System.out.println(ll + by + spB4 + ll + Byte.SIZE + spB4 + rl + Byte.MIN_VALUE + spb + spDoub6 + rl + Byte.MAX_VALUE + spb + spDoub6 + rl);
        System.out.println(line);
        System.out.println(ll + shs + spSH5 + ll + Short.SIZE + spSH5 + rl + Short.MIN_VALUE + spb + rl + Short.MAX_VALUE + spb + rl);
        System.out.println(line);
        System.out.println(ll + inte + spInt3 + ll + Integer.SIZE + spSH5 + rl + Integer.MIN_VALUE + spDoub6 + spInt3 + spB4 + rl + Integer.MAX_VALUE + spB4 + spDoub6 + spInt3 + rl);
        System.out.println(line);
        System.out.println(ll + lon + spB4 + ll + Long.SIZE + spSH5 + rl + Long.MIN_VALUE + spDoub6 + rl + Long.MAX_VALUE + spDoub6 + rl);
        System.out.println(line);
        System.out.println(ll + fl + spSH5 + ll + Float.SIZE + spSH5 + rl + (-Float.MAX_VALUE) + spB4 + spDoub6+spSH5  + rl + Float.MAX_VALUE + spInt3 + spB4 + rl);
        System.out.println(line);
        System.out.println(ll + db + spDoub6 + ll + Double.SIZE + spSH5 + rl + (-Double.MAX_VALUE) + rbl + Double.MAX_VALUE + rl);
        System.out.println(line);

        taskn = 11;
        border = lb + task + taskn + rb;
        System.out.println(border);


        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        double t8 = -1000000.001;
        Short t9 = 1010;


        System.out.println(by + "t1 = " + t1 + sc + "\n"
                        + sh + "t2 = " + t2 + sc + "\n"

                        + by + "t3 = " + t3 + sc + "\n"
                        + fl + "t4 = " + t4 + sc + "\n"
                        + in + "t5 = " + t5 + sc + "\n"
                        + lon + "t6 = " + t6 + sc + "\n"
                        + db + "t7 = " + t7 + sc + "\n"
                        + db + "t8 = " + t8 + sc + "\n"
                        + sh + "t9 = " + t9 + sc );


        taskn = 13;
        border = lb + task + taskn + rb;
        System.out.println(border);

        Integer num1 = 15;
        Integer num2 = 15;
        String iff = "Если ";
        String eq ="то результат сравнения методом .equal = ";
        boolean effect  = num1.equals(num2);
        System.out.println(iff + " num1 = num2 " +  eq + effect);

        // 2 case

        num1 = 117;
        effect  = num1.equals(num2);
        System.out.println(iff + " num1 > num2 " + eq + effect);

        //case 3
        num2 = 200;
        effect  = num1.equals(num2);
        System.out.println(iff + " num1 < num2 " +  eq + effect);

        taskn = 14;
        border = lb + task + taskn + rb;
        System.out.println(border);

        int number1 = 17;
        int number2 = 17;

        //case1 Если number1 = number2
        eq = " то результат сравнения методом.compare = ";
        int c  =Integer.compare(number1,number2);
        System.out.println(iff + "number1 == number2 " + eq + c );

        //case2  “Если number1 < number2
        number1 = 10;
        c  =Integer.compare(number1,number2);
        System.out.println(iff + "number1 < number2 " + eq + c );

        // case 3   “Если number1 > number2
        number2 = -100;
        c  =Integer.compare(number1,number2);
        System.out.println(iff + "number1 > number2 " + eq + c );


        taskn = 15;
        border = lb + task + taskn + rb;
        System.out.println(border);

        Float n1 = 234.9999F;               // работаю  со значением в 17 задаче
        int nu1 = n1.intValue();
        System.out.println(in + eqs+nu1+sc);


        taskn = 16;
        border = lb + task + taskn + rb;
        System.out.println(border);

        t = 156.00657;
        tw = 133.99343;
        String total = "Cумма двух переменных типа double методом.sym = ";
        System.out.println(total+Double.sum(t,tw));

        taskn = 17;
        border = lb + task + taskn + rb;
        System.out.println(border);

        Float n2 = 245.0069F;            // взял  из  15  задачи значение  n1
        //привожу переменные к  типу int
        nu1 = n1.intValue();
        int nu2 = n2.intValue();

        total = "Cумма двух переменных типа Float рассчитанная  методом sum() класса Integer = ";
        System.out.println(total+Integer.sum(nu1,nu2));

        taskn = 18;
        String taskl = Integer.toString(taskn);
        String point = ".1";
        border = lb + task + taskn + point + rb;
        System.out.println(border);

        Short short1 = 12000;
        Short short2 = 12300;

        String short1a = Float.toString(short1);               // short in  string
        String short2a = Float.toString(short2);                 // short in  string

        total = "12000 - 12300 = ";
        String amount =  total+ (short1-short2)+sc;
        System.out.println( amount);

        taskn = 18;
        point = ".2";
        border = lb + task + taskn + point + rb;
        System.out.println(border);

        short1 = 12500;
        short1a = Float.toString(short1);
        total = "12500 - 12300 = ";
        amount =  total+ (short1-short2)+sc;
        System.out.println(amount);

        taskn = 19;
        border = lb + task + taskn + rb;
        System.out.println(border);

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        total = "doub1 - doub2 = ";
        System.out.println(total+ Math.round((doub1-doub2)*1000.0)/1000.0);
        total = "str1 - str2 = ";
        double difer = Double.valueOf(str1) - Double.valueOf(str2);


        System.out.println( total + Math.round((difer)*1000.0)/1000.0);


        taskn = 20;
        border = lb + task + taskn + rb;
        System.out.println(border);

        double temp_cat = 38.3;
        double catsTempMax = temp_cat;
        temp_cat = 37.8;
        //Создаю и инициализирую переменную
        double catst = Double.sum(temp_cat,catsTempMax)/2;
        // вывод через переменную
        System.out.println(catst);
        //вывод  через  методы
        System.out.println(Double.sum(temp_cat,catsTempMax)/2);
        System.out.println("round");
        System.out.println(Math.round(catst));





        // case 1
        double maxim = Double.MAX_VALUE;
        Double minim = -Double.MAX_VALUE;

        System.out.println(max+positive+maxim);
        System.out.println(min+negative+minim);

        Math.pow(maxim,minim);
        System.out.println(Math.pow(maxim,minim));

        System.out.println ("Минимальное двойное значение =" +  (- Double.MAX_VALUE));
        System.out.println ("Max double value = "  + Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(-Float.MAX_VALUE);

        taskn = 21;
        border = lb + task + taskn + rb;
        System.out.println(border);
        Number n = Long.MAX_VALUE;
        String neq = " n = ";
        System.out.println("Переменная n может принимать значения: \n" + neq + n+sc);
        n =10;
        System.out.println(neq + n + sc);
        n = 10.999999999;
        System.out.println(neq + n+ sc);
        System.out.println("Это возможно, потому что Number оберточный тип и " + "\n"+ "включает в себя " +
                "все числовые типы переменных");

        taskn = 22;
        border = lb + task + taskn + rb;
        System.out.println(border);
        Integer numberInteger = 100;
        int z = 5;
        System.out.println(numberInteger.getClass().getSimpleName());
        System.out.println(numberInteger+z);


        System.out.println(numberInteger.toString().getClass().getSimpleName());
        System.out.println(numberInteger.toString()+z);


        taskn = 23;
        border = lb + task + taskn + rb;
        System.out.println(border);
        double cc;
        cc = 36.6;
        double  gf = cc*9/5+32;

        String gr = cc + " градуса  по цельсию = " + Math.round(gf*1000.0)/1000.0 + " градусов по Фаренгейту";
        String gr1 = cc + " градуса  по цельсию = " + String.format("%.4f",gf) + " градусов по Фаренгейту";
        System.out.println(gr);
        System.out.println(gr1);

        int kg = 50;
        int pd = 50;
        double   constanta =2.20462262185;
        double  pounds = kg * constanta;
        double  kilo = pd / constanta;

//        double kg = pounds / 2.046;
        gr = kg+ " kilogram = "+pounds+ " lbs,  50 lb = " + kilo + "kg";
        System.out.println(gr);













































    }
}


















