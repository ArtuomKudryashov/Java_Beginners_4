package hw_5;

public class MetodMonth {

    public static void intVerifyEqualsInt(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println(  "\u001B[32m" + "Pass" + "\033[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\033[0m");
        }

    }
    public static void intVerifyEqualsInt(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(  "\u001B[32m" + "Pass" + "\033[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\033[0m");
        }

    }
    public static String month(int a){

        if ( a == 1) {
          return "Monday";
        }else if ( a == 2){
            return "Tuesday";
        }else if ( a == 3) {
            return "Wednesday";
        }else if (a == 4){
            return "Thusday";
        }else  if (a ==5){
            return "Friday";
        }else if (a ==6) {
            return "Suturday";
        }else if (a == 7) {
            return "Sunday";
        }else {
            return "Error - Не корректные данные";
        }
    }
}
