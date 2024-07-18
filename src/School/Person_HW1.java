package School;

public class Person_HW1 {
    public static void main(String[] args) {


        /*“Если человек родился в … году, то его возраст - разница между 2020 и …”. */

        int yob  = 1990;

        String a = "Если человек родился в ";
        String y = " году";
        String dif = ",то его возраст ";
        int year = 2022;

        System.out.println(a + yob + y + dif + ( year - yob ));



    }
}
