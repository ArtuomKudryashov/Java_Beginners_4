package hw_5;

import java.util.Formatter;

public class List {
    public static void main(String[] args) {
        pay("Иванов Денис Денисыч", "Отдел продаж", "Менеджер", 3, 10, 14,10000, 36000);
        pay("Сидоров Иван Петрович", "Отдел логистики", "Менеджер", 5, 10, 14,10000, 50000);
    }
    public static String salaryToString(double salary) {
        String cents = String.format("%.2f", salary);
        return (int) salary + " руб " + cents.substring(cents.indexOf(".") + 1) + " коп";
    }
    //Фио          отдел               Должность        болн дней      Day ocl      Дни отауска          All sal
    public static String pay(String fullname, String department, String position, int amountDayB, int day, int amountdayOtp,double avans, double PayCheck) {
        double otpDay = 1071.42;
        String sumOtp = salaryToString(otpDay * amountdayOtp);
        double bolnDay = 1333.33;
        String sumboln = salaryToString(bolnDay * amountDayB);
        double oclDay = PayCheck*2.7/100;
        //работаем с рублями
        double ocladR = oclDay * day;
        String oclST = salaryToString(ocladR);
        //Премии
        String oplataZaCval = salaryToString(PayCheck * 6/100);
        String premMonth = salaryToString(PayCheck * 14 / 100);
        String opPoIsplist = salaryToString(PayCheck * 22/100);
        String FSZN = salaryToString(PayCheck * 13 / 100);
        double uderZ = (PayCheck * 22 / 100) + (PayCheck * 13 / 100);
        String totalUderz = salaryToString(uderZ);
        String monthlyTotal = salaryToString((PayCheck - avans) - uderZ);
        System.out.println("Расчетный листок  за Март  2022");
        System.out.println();
        System.out.format("%-20s%-25s%n","ФИО", fullname);
        System.out.format("%-20s%-25s%n","Подразделение", department);
        System.out.format("%-20s%-25s%n","Должность", position);
        System.out.println();
        String line = "_____________________________________________________________________________________________________________________________";
        String line2 = "___________________________________________________________";
        System.out.println(line);
        System.out.format("|%-27s|%-8s|%-20s|%8s|%-57s|%n", "Начисленно:","Дни","Сумма","","Удержано:");
        System.out.println(line2 + "        " + line2);
        System.out.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Оплата по окладу",day,oclST,"","ФСЗН",FSZN);
        System.out.println(line2+ "        "+ line2);
        System.out.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Надбавка за квалификацию","",oplataZaCval,"","По исполнительному листу ",opPoIsplist);
        System.out.println(line2+ "        "+ line2);
        System.out.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Премия месячная","",premMonth,"","","");
        System.out.println(line2+ "        "+ line2);
        System.out.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Отпускные 03.09-03.22",amountdayOtp,sumOtp,"","","");
        System.out.println(line2+ "        "+ line2);
        System.out.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Оплата больничного листа",amountDayB,sumboln,"","","");
        System.out.println(line2+ "        "+ line2);
        System.out.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Всего начисленно","",salaryToString(PayCheck),"","Всего удержано",totalUderz);
        System.out.println(line2+ "        "+ line2);
        System.out.format("%-58s|%n","");
        System.out.println(line2);
        System.out.format("|%-57s|%n", "Выплачено");
        System.out.println(line2);
        System.out.format("|%-27s|%-8s|%-20s|%n", "Аванс","",salaryToString(avans));
        System.out.println(line2);
        System.out.format("|%-27s|%-8s|%-20s|%n", "Всего выплачено","",salaryToString(avans));
        System.out.println(line2);
        System.out.println();
        System.out.println(line2);
        System.out.format("|%-27s|%-8s|%-20s|%n", "К выплате за Март","",monthlyTotal);
        System.out.println(line2);
        return null;
    }


}
