package Classes;

public class Class326 {
    public static void main(String[] args) {
        //Задача с  5-го урока
        // Даны 3 числа.
        // Необходимо найти максимально точную разницу
        // между минимальным числом и средним значением.
        // Если разница больше 3.51,
        // показать пользователю сообщение "Большой разброс чисел",
        // иначе показать сообщение "Маленький разброс чисел"

        int a = 5;
        int b = 2;
        int c = 10;
        System.out.println("Минимальное значение");
        System.out.println(returnMinOfThree(a,b,c));
        System.out.println("Среднее");
        System.out.println(average(a,b,c));
//        System.out.println("Разница м/у мин и среднем");
//        System.out.println(countDifferenceBetweenMinAndAverage(a,b,c));
        System.out.println("Шаги положительные");
//        double plus = returnAbs(returnMinOfThree(a,b,c)-average(a,b,c));
        double plus1= countDifferenceBetweenMinAndAverage(a,b,c);
        System.out.println(plus1);
        System.out.println("Разброс");

        String res = displayMessage(a,b,c);
        System.out.println(res);
    }

    public static int returnMinOfThree (int a, int b, int c){ // 1)min число
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min < c) {

            return min;
        } else {
            min = c;

            return min;
        }
    }

    public static double average(int a, int b, int c) {               //2) среднее значение

        return ((double)a + b + c) / 3;
    }
    public static double returnAbs(double number) {                  // 3 ) разница  не может быть  отрицательной
        if (number < 0) {
            number = (-1) * number;
        }
        return number;
    }

    public static double countDifferenceBetweenMinAndAverage(int a, int b, int c) {   //4)  находим разницу мин и среднего
        double min = returnMinOfThree(a, b, c);
        double average = average(a, b, c);

        return returnAbs(min - average);              // вызов  метода 3
    }

    public static String displayMessage(int a, int b, int c) {           //разброс
        String message;

        if (countDifferenceBetweenMinAndAverage(a, b, c) > 3.51 ) {
            message = "Большой разброс чисел";
            System.out.println(message);
        } else {
            message = "Маленький разброс чисел";
            System.out.println(message);
        }

        return message;
    }





}
