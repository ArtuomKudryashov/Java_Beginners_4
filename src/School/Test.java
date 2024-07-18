package School;

public class Test {
    public static void main(String[] args) {



   mult(5,10);

   mult(6,9);

   task(1);
   person("Sergey", 30);

   task(2);
   person ("Daria", 17);


    }
    public  static void task (int a){
        String lb ="<<<<<<<<<<<<<<<<<<<<<<<<<<<<<";
        String task = "Задача № ";
        String rb = ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.println(lb+task+(a) +rb );
    }
    public  static void mult (int a, int b) {

        System.out.println(a * b);
    }
    public  static void person (String c, int b) {

        System.out.println("Имя человека = " + c + " Его возраст = " + b);
    }
}
