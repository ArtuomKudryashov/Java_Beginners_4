package hw_4;

public class thirteen {
    public static void main(String[] args) {
        checkNumbers(30, -30);

    }
    String numb = "Так как оба числа делятся на";
    String rem = "без остатка,";


    public static Integer checkNumbers(int a, int b) {
        int result = 0;
        if (a % 3 == 0 && b % 3 == 0) {
            result = a + b;
            System.out.println("Делится  2 числа  на 3 тогда : a+b =" + result);
        }
        if (a % 5 == 0 && b % 5 == 0) {
            result = a - b;
            System.out.println("Делится 2 числа на 5 тогда  a-b = " + result);
        }
        if (a % 2 == 0 && b % 2 == 0) {
            result = a * b;
            System.out.println("Делится 2 числа на  2 без остатка, тогда " + result);
            if (a < 0 || b < 0) {
                result = result * -1;
                System.out.println("Так как оба числа делятся на 2 без остатка,но одно  или два числа отрицательных мы " +
                        "предыдущий результат умножаем на -1, тогда  " + result);
            }
        }
        if (!(a % 3 == 0 && b % 3 == 0) && !(a % 5 == 0 && b % 5 == 0) && !(a % 2 == 0 && b % 2 == 0)) {
            System.out.println("Error");
        }
        return result;
    }
}



