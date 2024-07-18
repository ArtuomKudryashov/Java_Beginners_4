package hw_5;

public class Metods {
    //Дни недели 2 задача

    public static String dOfW(int a) {

        String day = " This day is ";

        String dayOfWeek = "";
        if (a == 1) {
            dayOfWeek = (day + "Monday");
        } else if (a == 2) {
            dayOfWeek = (day + "Tuesday");
        } else if (a == 3) {
            dayOfWeek = (day + "Wednesday");
        } else if (a == 4) {
            dayOfWeek = (day + "Thursday");
        } else if (a == 5) {
            dayOfWeek = (day + "Friday");
        } else if (a == 6) {
            dayOfWeek = (day + "Saturday");
        } else if (a == 7) {
            dayOfWeek = (day + "Sunday");
        } else {
            dayOfWeek = "Error -Не корректные данные";
        }
        return dayOfWeek;

    }

}
