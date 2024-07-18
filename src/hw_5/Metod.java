package hw_5;

public class Metod {
    public static String salaryToString(double salary) {
        String cents = String.format("%.2f",salary);
        return (int) salary + " руб " + cents.substring(cents.indexOf(".")+1) + " коп";
    }
    public static double calculateMonthlySalary(double dailyHours, double hourlyRate, int day) {
        return (dailyHours * hourlyRate) * day;
    }
//    public static String printEmployeeRecord(String fullName, double dailyHours, double hourlyRate) {
//        return String.format("%-25s%25s%n", "ФИО","Всего начисленно")
//                +String.format("%-25s%25s",fullName,salaryToString(calculateMonthlySalary(dailyHours, hourlyRate)));
//    }
    public static void main(String[] args) {

//        App.stVerifyEquals("ФИО                               Всего начисленно" +
//                        "Смирнова Мария Ивановна           70000 руб 00 коп",
//                printEmployeeRecord("Смирнова Мария Ивановна", 10, 350));
//
//        System.out.println(printEmployeeRecord("Смирнова Мария Ивановна", 10, 350));
//        System.out.println(printEmployeeRecord("Серебряков Иван Петрович", 10, 640));
    }








}
