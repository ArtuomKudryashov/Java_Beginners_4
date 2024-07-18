package hw_5;

import java.util.Formatter;

public class App_8 {
    public static void main(String[] args) {
        print("Иванов",5, "Math");
        print("Cидоров",4,"Phisic");



    }
    public static void print (String fulname, int mark, String subject) {

        System.out.printf("Студент %-15s получил %-3s по %-10s.\n", fulname, mark, subject);
        System.out.printf("%s %s");



    }
}
