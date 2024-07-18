package hw_5;

public class New2 {
    public static void main(String[] args) {

        // Печатает  Зарплатную  ведомость
        System.out.println(vedomost("Смирнова Мария Ивановна", 35997.54,"Серебряков Иван Петрович",36322.65));

        //Выводит Расчетные  листки работников
        System.out.println(pay("Смирнова Мария Ивановна", "Отдел логистики", "Менеджер",  3, 10, 14, 10000));
        System.out.println(pay("Серебряков Иван Петрович", "Отдел продаж", "Менеджер", 4, 10, 13, 10000));

        //Тестируем
        salar("Смирнова Мария Ивановна", 35997.54,"Серебряков Иван Петрович",36322.65);



    }
  // Тест
    public static void  salar(String fullname, double totalMonth, String fullname2, double totalMonth2) {
        String totalmonth = salaryToString(totalMonth);
        String totalmonth2 = salaryToString(totalMonth2);
        if (fullname.equals("Смирнова Мария Ивановна") && totalmonth.equals("35997 руб 54 коп") && fullname2.equals("Серебряков Иван Петрович") && totalmonth2.equals("36322 руб 65 коп")){
            System.out.println("\u001B[32m" + "Pass" + "\033[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\033[0m");
        }

    }
// Метод перевода  дроби в рубли и копейки

    public static String salaryToString(double salary) {
        String cents = String.format("%.2f", salary);
        return (int) salary + " руб " + cents.substring(cents.indexOf(".") + 1) + " коп";


    }
    //Мнтод печатает Зарплатную   ведомость

    public static String vedomost(String fullname, double totalMonth1, String fullname2, double totalMonth2) {
        String lineV= "_____________________________________________________________________";
        String totalMonthSt1  = salaryToString(totalMonth1);
        String totalMonthSt2  = salaryToString(totalMonth2);


        return String.format("%45s%n", "ЗАРПЛАТНАЯ ВЕДОМОСТЬ")
                + lineV +"\n"
                +String.format("|%-30s|%-20s|%-15s|%n","ФИО","Сумма", "Роспись")
                + lineV +"\n"
                +String.format("|%-30s|%-20s|%-15s|%n",fullname,totalMonthSt1,"")
                + lineV + "\n"
                +String.format("|%-30s|%-20s|%-15s|%n",fullname2,totalMonthSt2,"")
                + lineV + "\n";
    }
    //Метод  печатает расчетные листки

                                   //Фио             Отдел              Должность    Болн дней    Day ocl      Дни отпуска     Аванс
    public static String pay(String fullname, String department, String position, int amountDayB, int day, int amountdayOtp,double avans) {



        double bolnDay = 1333.33;                        // Стоимость дня  больничного
        double sumbolnich = bolnDay * amountDayB;
        String sumboln = salaryToString(bolnDay * amountDayB);

        double otpDay = 1071.42;// Стоимость дня отпуска
        double sumOtpDay = otpDay * amountdayOtp;
        String sumOtp = salaryToString(otpDay * amountdayOtp);

        double oclDay = 1000.00;                          // Стоимость дня работы
        double sumOcl = oclDay * day;
        String oclST = salaryToString(sumOcl);

        double sumMonth = sumbolnich + sumOtpDay + +sumOcl;                //29000
        double TotalMonth =sumMonth * 6.89/100 + sumMonth * 17.24/100 + sumMonth;
//        System.out.println(TotalMonth);                                       //35997

        //Премии
        String oplataZaCval = salaryToString(sumMonth * 6.89/100);
        String premMonth = salaryToString(sumMonth * 17.24 / 100);
        String opPoIsplist = salaryToString(TotalMonth * 21.75/100);
        String FSZN = salaryToString(TotalMonth * 13 / 100);
        double uderZ = (TotalMonth * 21.75 / 100) + (TotalMonth * 13 / 100);
        String totalUderz = salaryToString(uderZ);
        String monthlyTotal = salaryToString((TotalMonth - avans) - uderZ);
        String line = "_____________________________________________________________________________________________________________________________";
        String line2 = "___________________________________________________________";
        return String.format("%n%35s%n%n","Расчетный листок  за Март  2022")
                +String.format("%-20s%-25s%n","ФИО", fullname)
                +String.format("%-20s%-25s%n","Подразделение", department)
                +String.format("%-20s%-25s%n%n","Должность", position)
                +line+"\n"
                +String.format("|%-27s|%-8s|%-20s|%8s|%-57s|%n", "Начисленно:","Дни","Сумма","","Удержано:")
                +line2 + "        " + line2+"\n"
                +String.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Оплата по окладу",day,oclST,"","ФСЗН",FSZN)
                +line2 + "        " + line2+"\n"
                +String.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Надбавка за квалификацию","",oplataZaCval,"","По исполнительному листу ",opPoIsplist)
                +line2 + "        " + line2+"\n"
                +String.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Премия за месяц","",premMonth,"","","")
                +line2 + "        " + line2+"\n"
                +String.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Отпускные 03.09-03.22",amountdayOtp,sumOtp,"","","")
                +line2 + "        " + line2+"\n"
                +String.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Оплата больничного листа",amountDayB,sumboln,"","","")
                +line2 + "        " + line2+"\n"
                +String.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Всего начисленно","",salaryToString(TotalMonth),"","Всего удержано",totalUderz)
                +line2 + "        " + line2+"\n"
                +String.format("%-58s|%n","")
                +line2+"\n"
                +String.format("|%-57s|%n", "Выплачено")
                +line2+"\n"
                +String.format("|%-27s|%-8s|%-20s|%n", "Аванс","",salaryToString(avans))
                +line2+"\n"
                +String.format("|%-27s|%-8s|%-20s|%n", "Всего выплачено","",salaryToString(avans))
                +line2+"\n\n"+line2+"\n"
                +String.format("|%-27s|%-8s|%-20s|%n", "К выплате за Март","",monthlyTotal)
                +line2;
    }

}
