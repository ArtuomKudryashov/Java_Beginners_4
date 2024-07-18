package hw_10;
import java.util.Locale;

import static helpers.Helper.*;
public class Methods {
    public static String spQA (String x){
        String a = "";
        if ( x.isEmpty()==true){
            a = a + "Строка пустая";
        } else if ( x.equals(x.trim())) {
            a = a + "Пробелов не было";
        }else{
            x.trim();
            a = a + "Лишние пробелы удалены";
        }
        return a;


    }
    public  static  String RemoveAlla (String x) {
        String a = "";
        if (x.isEmpty() == true) {
            a = a + "Строка пустая";
        } else {

            a = a + x.trim().replaceAll("a", "");
        }
        return a;
    }
    public  static  String RemoveAllZeros (String x) {
        String a = "";
        if (x.isEmpty() == true) {
            a = a + "Строка пустая";
        } else {

            a = a + x.trim().replaceAll("0", "").replaceAll(" ", "");


        }
        return a;
    }
    public  static  String RemoveAllSpaces (String x) {
        String a = "";
        if (x.isEmpty() == true) {
            a = a + "Строка пустая";
        } else {

            a = a + x.replaceAll(" ", "");


        }
        return a;
    }
    public static  int a(String x){
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
           if (x.toLowerCase().charAt(i)=='a'){
               count++;

            }

        }
        return count;
    }

    public static String quotes (String x, String lq, String point, String rq) {
        String a = "";
        if (x.isEmpty() == true) {
            a = a + "Строка пустая";
        } else {
            a = a + lq.concat(x.trim()).concat(point).concat(rq);
        }
        return a;
    }
}
