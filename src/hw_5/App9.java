package hw_5;

public class App9 {
    public static void main(String[] args) {
        /*Написать метод, который принимает на вход 2 параметра
         -  цену и количество товара (может быть вес товара, или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.

         * */

        System.out.println(countTotalPrice(2,10));


    }

    public  static String countTotalPrice (double price, double amount){
        double totalPrice = 0;
        totalPrice = price * amount;
        String totalPriceWhithRubles =totalPrice + " рублей";
        return totalPriceWhithRubles;

    }


}
