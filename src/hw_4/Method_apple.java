package hw_4;

public class Method_apple {


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            System.out.println( decApples(i));
        }
    }





    public static String decApples(int apple) {

        int appleLastNumber = apple % 10; // Находим на какое число заканчивается наше число
        String apples = ""; //Пустая строка для записи
        boolean appleExclusion = (apple % 100 >= 11) && (apple % 100 <= 14); // Переменна для исключений между 11 и 14
        if (appleLastNumber == 1) // Если окончание 1: одно яблоко
            apples = "яблоко";
        else if (appleLastNumber == 0 || appleLastNumber >= 5) // Если окончание 0 или больше или равно 5: ноль яблок, пять яблок
            apples = "яблок";
        else if (appleLastNumber >= 2) // Если окончание от 2 до 5 ти: два яблока, три яблока
            apples = "яблока";
        if (appleExclusion) // Если исключение: 11 яблок, 12 яблок, 13 яблок, 14 яблок.
            apples = "яблок";
        return apples;
    }
}