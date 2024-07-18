package hw_5;

public class New {
    public static void main(String[] args) {
        System.out.println(pay("Иванов Денис Денисыч", "Отдел продаж", "Менеджер", 3, 10, 18, 10000, 36000));
        System.out.println(pay("Сидоров Иван Петрович", "Отдел логистики", "Менеджер", 5, 10, 16, 10000, 50000));
    }

    public static String salaryToString(double salary) {
        String cents = String.format("%.2f", salary);
        return (int) salary + " руб " + cents.substring(cents.indexOf(".") + 1) + " коп";
    }

                                    //Фио             Отдел              Должность        Болн дней       Day ocl      Дни отпуска  Аванс         All sal
    public static String pay(String fullname, String department, String position, int amountDayB, int day, int amountdayOtp,double avans, double PayCheck) {

        double otpDay = PayCheck*2.97/100;
        String sumOtp = salaryToString(otpDay * amountdayOtp);
        double bolnDay = PayCheck*3.7/100;
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
                +String.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Премия месячная","",premMonth,"","","")
                +line2 + "        " + line2+"\n"
                +String.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Отпускные 03.09-03.22",amountdayOtp,sumOtp,"","","")
                +line2 + "        " + line2+"\n"
                +String.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Оплата больничного листа",amountDayB,sumboln,"","","")
                +line2 + "        " + line2+"\n"
                +String.format("|%-27s|%-8s|%-20s|%8s|%-35s|%21s|%n", "Всего начисленно","",salaryToString(PayCheck),"","Всего удержано",totalUderz)
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
