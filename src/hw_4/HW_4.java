package hw_4;

import java.lang.reflect.Type;
import java.net.Proxy;
import java.util.SortedMap;

public class HW_4 {
    public static void main(String[] args) {

        String task = " Case # ";
        String condition = "Condition";
        String rsp = "       ";
        String lsp = "       ";
        String sp = " ";
        String bsp = "  ";
        String eq = " = ";
        String lbr = "( ";
        String rbr = " )";
        String and = " and ";
        char em = '!';
        char sc = ';';


        task(3);                               // метод создания номеров  задач
        int numb = 1;                              // Создаю  и инициализирую  переменную для начала  отсчета  к сводной таблице
        cas(1);


        int a = 2;
        int b = 7;
        boolean d = (a == a) && (b == b);

        String precon = lbr + a + eq + a + rbr + and + lbr + b + eq + b + rbr;

        System.out.println(d);

        int numb1 = numb;                          //  Блок для таблицы общей
        String precon1 = precon;
        boolean d1 = d;

        String line = "____________________________";
        String ll = "| ";
//        String numb =
        String tab1 = (line + "\n"
                + ll + rsp + sp + task + numb + sp + lsp + ll + "\n"
                + line + "\n"
                + ll + "\t\t" + sp + sp + condition + "\t\t" + sp + sp + sp + ll + "\n"
                + line + "\n"
                + ll + sp + precon + ll + "\n"
                + line + "\n"
                + ll + "\t" + rsp + bsp + d + bsp + sp + rsp + ll + "\n"
                + line);
        System.out.println(tab1);


        cas(2);

        line = "____________________________";
        numb++;


        a = 15;
        b = 3;
        precon = "Не(15 < 3)";
        boolean e = (!(a < b));

        System.out.println(e);

        int numb2 = numb;             //  Блок для таблицы общей
        String precon2 = precon;
        Boolean d2 = e;

        String tab2 = (line + "\n"
                + ll + rsp + sp + task + numb + sp + lsp + ll + "\n"
                + line + "\n"
                + ll + "\t\t" + sp + sp + condition + "\t\t" + sp + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t" + bsp + precon + "\t" + bsp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t" + rsp + bsp + d + bsp + sp + rsp + ll + "\n"
                + line);
        System.out.println(tab2);

        cas(3);
        line = "___________________________________";
        lsp = "       ";
        numb++;

        String pine = "Сосна";
        String oak = "Дуб";
        String cherry = "Вишня";
        String maple = "Клен";

        precon = "(Сосна = Дуб) ИЛИ (Вишня = Клён)";

        e = (pine.equals(oak) || cherry.equals(maple));
        System.out.println(e);

        int numb3 = numb;                   //  Блок для таблицы общей
        String precon3 = precon;
        Boolean d3 = e;

        String tab3 = (line + "\n"
                + ll + "\t\t\t" + sp + task + numb + "\t\t\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t" + condition + "\t\t\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + precon + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t\t" + e + "\t\t\t" + sp + sp + ll + "\n"
                + line);
        System.out.println(tab3);


        cas(4);
        numb++;
        precon = "Не(Сосна = Дуб)";
        e = (!(pine.equals(oak)));
        System.out.println(e);

        int numb4 = numb;                                  //  Блок для таблицы общей
        String precon4 = precon;
        Boolean d4 = e;

        String tab4 = (line + "\n"
                + ll + "\t\t\t" + sp + task + numb + "\t\t\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t" + condition + "\t\t\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t" + precon + "\t\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t\t" + e + "\t\t\t" + sp + sp + ll + "\n"
                + line);

        System.out.println(tab4);


        cas(5);
        numb++;

        precon = " (Не(15 < 3)) И (10 > 20)";
        int c = 10;
        int k = 20;

        e = ((!(a < b)) && (c > k));
        System.out.println(e);


        int numb5 = numb;                          //  Блок для таблицы общей
        String precon5 = precon;
        Boolean d5 = e;

        String tab5 = (line + "\n"
                + ll + "\t\t\t" + sp + task + numb + "\t\t\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t" + condition + "\t\t\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t" + precon + "\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t\t" + e + "\t\t\t" + sp + sp + ll + "\n"
                + line);


        System.out.println(tab5);


        cas(6);
        numb++;
        String theBigestSp = "                                                              ";
        precon = "(Глаза даны, чтобы видеть)    |" + "\n" + "|(Под третьим этажом находится    |" +
                "" + "\n" + "|второй этаж)";
        String totalprecon = "(Глаза даны, чтобы видеть)    |" + "\n" + theBigestSp + theBigestSp
                + "\t\t\t\t\t\t" + "|(Под третьим этажом находится    |"
                + "\n" + theBigestSp + theBigestSp + "\t\t\t\t\t\t" + "|второй этаж)";
        int z = 3;
        int w = 2;
        String con = "Глаза даны, чтобы видеть";
        String find = "Глаза даны, чтобы видеть";

        e = ((con.equals(find) && (3 > 2)));
        System.out.println(e);

//        e = (!(a < b) && ( c > k ));

        int numb6 = numb;                        //  Блок для таблицы общей
        String precon6 = precon;
        Boolean d6 = e;

        String tab6 = (line + "\n"
                + ll + "\t\t\t" + sp + task + numb + "\t\t\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t" + condition + "\t\t\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t" + precon + "\t\t\t\t\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t\t" + e + "\t\t\t" + sp + sp + ll + "\n"
                + line);
        System.out.println(tab6);

        cas(7);
        numb++;
        precon = "(6/2 = 3) ИЛИ (7*5 = 20)";
        a = 6;
        b = 2;
        c = 3;
        z = 7;
        w = 5;
        k = 20;
        e = (a / b == 3) || (z * w == k);
        System.out.println(e);

        int numb7 = numb;                              //  Блок для таблицы общей
        String precon7 = precon;
        Boolean d7 = e;

        String tab7 = (line + "\n"
                + ll + "\t\t\t" + sp + task + numb + "\t\t\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t" + condition + "\t\t\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t" + precon + "\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t\t\t" + e + "\t\t\t" + sp + sp + ll + "\n"
                + line);
        System.out.println(tab7);
        System.out.println();
        String spCase1 = "|                          |";
        String spCase2 = "                           |";
        String spCase3 = "                                  |";
        String spCase4 = "                   |";
        String spCase5 = "                                   |";
        totalprecon = "(Глаза даны, чтобы видеть)    |" + "\t\t" + precon7 + "\t" + sp + sp + ll + "\n"
                + spCase1 + spCase2 + spCase3 + spCase4 + spCase5 + "\t"
                + "(Под третьим этажом находится     |" + spCase5
                + "\n" + spCase1 + spCase2 + spCase3 + spCase4 + spCase5 + " второй этаж)                      |";


        line = "___________________________________________________________________________" +
                "______________________________________________________________________" +
                "__________________________________________________________________________";
        String total = (line + "\n"
                + ll + rsp + sp + task + numb1 + sp + lsp + ll + rsp + sp + task + numb2 + sp + sp + lsp + ll
                + "\t\t\t" + sp + task + numb3 + "\t\t\t" + sp + sp + ll + "\t" + task + numb4 + "\t" + sp + sp
                + ll + "\t\t\t" + task + numb5 + "\t\t\t" + sp + sp + ll + "\t\t\t" + sp + task + numb6
                + "\t\t\t" + sp + sp + ll + "\t\t\t" + sp + task + numb7 + "\t\t\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + "\t\t" + sp + sp + condition + "\t\t" + sp + sp + sp + ll + "\t\t" + sp + sp + condition
                + "\t\t" + sp + sp + sp + ll + "\t\t\t" + condition + "\t\t\t" + sp + sp + ll + "\t" + condition
                + "\t" + sp + sp + ll + "\t\t\t" + condition + "\t\t\t" + sp + sp + ll + "\t\t\t" + condition
                + "\t\t\t" + sp + sp + ll + "\t\t\t" + condition + "\t\t\t" + sp + sp + ll + "\n"
                + line + "\n"
                + ll + sp + sp + precon1 + ll + "\t\t" + bsp + precon2 + "\t" + bsp + sp + ll + precon3 + sp + ll
                + sp + precon4 + sp + sp
                + ll + "\t" + precon5 + "\t" + sp + sp + ll + "\t" + totalprecon + spCase5 + "\n"
                + line + "\n"
                + ll + "\t" + rsp + bsp + d1 + bsp + sp + rsp + ll + "\t" + rsp + bsp + d2 + bsp + sp + rsp
                + ll + "\t\t\t\t" + d3 + "\t\t\t" + sp + sp + ll + "\t" + d4 + "\t\t" + sp + sp
                + ll + "\t\t\t\t" + d5 + "\t\t\t" + sp + sp + ll + "\t\t\t\t" + d6 + "\t\t\t"
                + sp + sp + ll + "\t\t\t\t" + d7 + "\t\t\t" + sp + sp + ll + "\n"
                + line);
        System.out.println(total);

        String q2;


        task(4);
        cas(1);
        con = "В минуте 60 секунд";
        String con2 = "Работающие часы показывают время";

        String q = "В минуте 70 секунд";
        String q1 = "Работающие часы показывают время";

        e = (q.equals(con) || q1.equals(con2));
        System.out.println(e);

        casl();


        cas(2);
        a = 28;
        b = 7;
        c = 300;
        z = 5;
        e = ((!(a > b)) && (!(c / z == 60)));
        System.out.println(e);

        casl();

        cas(3);
        con = "Телевизор - электрический прибор";
        con2 = "Стекло - не дерево";

        q = "Телевизор - электрический прибор";
        q1 = "Стекло - дерево";

        e = (con.equals(q) && (con2.equals(q1)));
        System.out.println(e);

        casl();

        cas(4);
        a = 300;
        b = 100;

        if (!(300 < 100)) {
            System.out.println("Жажду можно утолить водой");

        } else {
            System.out.println("Что-то я не понял!");
        }
        casl();

        cas(5);
        a = 75;
        b = 81;
        c = 88;
        z = 88;

        if (!(300 < 100)) {
            System.out.println((c == z) + " 88 = 88");

        } else {
            System.out.println("Что-то не так в методе if");
        }

        casl();

        task(5);
        cas(1);


        a = 30;
        c = 20;
        int nat = 25;

        if (a > c && nat > c) {
                System.out.println("Aндрей и Наташа старше Светы.");
        } else {
                System.out.println("Aндрей или Наташа младше Светы.");
            }



        casl();
        cas(2);
        String u = "На полке стоят учебники,";
        String u1 = "а на столе лежат справочники";
        String cod = "На полке стоят учебники, а на столе лежат справочники";
        if (cod.equals(u + u1)) {
            System.out.println("На полке стоят учебники, а на столе лежат справочники");
        } else {
            System.out.println("Опять бардак");
        }
        cod = (" На полке стоят учебники, а на столе лежат справочники && на столе лежат справочники");
        boolean Na_polke_stoyt_uchebniki = true;
        boolean Na_stole_legat_spravochniki = true;
        if ((Na_polke_stoyt_uchebniki == true) && (Na_stole_legat_spravochniki == true)) {
            System.out.println(" На полке стоят учебники, а на столе лежат справочники ");
        } else {
            System.out.println("Опять бардак");

        }
        casl();
        cas(3);
        boolean Bolshaya_chast_devochki = true;
        boolean Ostalnie_malchiki = true;
        if ((Bolshaya_chast_devochki = true && (Ostalnie_malchiki = false))) {
            System.out.println(" Большая детей — девочки. Остальные - мальчики. ");
        } else {
            System.out.println("Кто-то из взрослых затисался  в ученики и хочет в школьную столовку!");

        }


        task(6);
        int mark;
        mark = 100;
        if (0 <= mark && mark <= 120) {
            if (16 <= mark && mark <= 120) {
                System.out.println("Водительские права можно получить, только когда исполнится 16 лет");
            } else {
                System.out.println("Тебе меньше 16, надо подождать до шестнадцати лет");
            }

        } else {
            System.out.println("Вы ввели  неверный возраст");
        }
        task(7);

        cod = "((!(Петя  едет в автобусе)) && читает книгу) || (!(смотрит в окно))";
        System.out.println(cod);

        task(8);
//        <Если с другом ты >?, <это хорошо>,
//                              : < плохо>

        String fr = "Если с другом ты";
        if (fr.equals("Если с другом ты")) {
            System.out.println("Если с другом ты " + "- хорошо" + sc);

        } else {
            System.out.println("(!(Если с другом ты) " + "- плохо)" + sc);

        }


        task(9);
        int age = 19;
        cas(1);
        q = " то ";

        if (18 <= age) {
            System.out.println("\u001B[32m" + "Если тебе больше 18 лет,\u001B[31m" + "то ты взрослый." + "\033[0m");
        } else {
            System.out.println("\u001B[34m" + "Иначе, ты - ребенок." + "\u001B[31m");
        }
        casl();
        cas(2);
        String land = "сухая";
        if (land.equals("сухая")) {
            System.out.println("\u001B[32m" + "Если земля сухая," + "\u001B[34m" + "значит," + "\u001B[31m"
                    + " нет дождя. " + "\033[0m");
        } else {
            System.out.println("\u001B[32m" + "Если земля мокрая," + "\u001B[34m" + "то" + "\u001B[31m"
                    + " идет дождь." + "\033[0m");
        }
        casl();

        cas(2);
        land = "мокрая";
        if (land.equals("сухая")) {
            System.out.println("Нет дождя ");
        } else {
            System.out.println("идет дождь.");
        }
        casl();
        cas(3);
        land = "Сухая";
        if (land.equals("Сухая")) {
            System.out.println("\u001B[32m" + "Если земля сухая," + "\u001B[34m" + "значит," + "\u001B[31m" + "нет дождя." + "\033[0m");
        } else if (land.equals("Мокрая")) {
            System.out.println("\u001B[32m" + "Если земля мокрая," + "\u001B[34m" + "то" + "\u001B[31m" + " идет дождь." + "\033[0m");

        } else {
            System.out.println("\u001B[34m" + "Иначе идет снег." + "\033[0m");

        }
        casl();


        cas(4);

        String sky = "тучи";
        if (sky.equals("тучи")) {
            System.out.println("\u001B[32m" + "Если на небе тучи," + "\u001B[31m" + "идет дождь" + "\033[0m");
        } else {
            System.out.println("\u001B[34m" + "иначе идет “слепой” дождь." + "\033[0m");
        }
        casl();


        cas(5);
        String dw = "Пятица";
        if (dw.equals("Суббота")) {
            System.out.println("\u001B[34m" + "Если сегодня суббота," + "\u001B[34m" + "значит," + "\u001B[31m" + "завтра воскресенье." + "\033[0m");

        } else if (dw.equals("Пятница")) {
            System.out.println("\u001B[32m" + "Если сегодня пятница," + "\u001B[34m" + "значит," + "\u001B[31m" + "вчера был четверг" + "\033[0m");
        } else {
            System.out.println("\u001B[34m" + "Иначе вчера был не четверг, а завтра - не воскресенье." + "\033[0m");
        }
        casl();
        cas(6);
        String sr = "Если на горе свистнул рак";
        if (sr.equals("на горе свистнул рак")) {
            System.out.println("Если на горе свистнул рак, значит, прошла вечность");
        } else {
            System.out.println("иначе ждите дальше");

        }
        casl();
        cas(6);
        boolean Na_gore_swisnul_rak = true;
        if ((Na_gore_swisnul_rak == false)) {
            System.out.println("\u001B[32m" + "Если на горе свистнул рак," + "\u001B[34m" + " значит," + "\u001B[31m" + "прошла вечность," + "\033[0m");
        } else {
            System.out.println("\u001B[34m" + "иначе ждите дальше" + "\033[0m");
        }
        casl();

        age = 15;
        String fs = "Если тебе 18 или ты закончил школdу";
        if (age >= 18 && fs.equals("Если тебе 18 или ты закончил школу")) {
            System.out.println("\u001B[32m" + "Если тебе 18" + "\u001B[34m" + "или" + "\u001B[32m" + "ты закончил школу," + "\u001B[34m" + "то" + "\u001B[31m" + "ты можешь не жить с родителями" + "\033[0m");
        } else {
            System.out.println("\u001B[34m" + ", иначе живи с родителями." + "\033[0m");
        }


        task(10);
        a = 13;
        if ((a % 2) == 0) {
            System.out.println(a * 2);
        } else {
            System.out.println(a * a);
        }

        task(11);
        mark = 19;
        if (0 < mark && mark <= 120) {
            if (0 < mark && mark <= 5) {
                System.out.println("Сижу дома");
            }
            if (5 <= mark && mark < 16) {
                System.out.println("В школу можно идти с 5 лет");
            }
            if (16 <= mark && mark < 18) {
                System.out.println("Машину можно водить с 16 лет");
            }
            if (18 <= mark && mark <= 120) {
                System.out.println("Машину можно водить с 16 лет" + "\n" + "Голосовать можно с 18 лет");
            }
        } else {
            System.out.println("Ввведены  не корректные данные");
        }

        task(12);
        int marks = 3;
        if (2 <= marks && marks <= 5) {
            if (marks == 5) {
                System.out.println("выдать похвальную грамоту и перевести в следующий класс");
            }
            if (marks == 4) {
                System.out.println("перевести в следующий класс");
            }
            if (marks == 3) {
                System.out.println("дать задание на лето и перевести в следующий класс");
            }
            if (marks == 2) {
                System.out.println("вызвать родителей и оставить в текущем классе на второй год");
            }
        } else {
            System.out.println("Ввведены  не корректные данные");
        }

        task(13);
        String exp = "Выражение ";
        a = 17;
        b = -14;
        if ((a % 3 == 0 && b % 3 == 0) || (a % 5 == 0 && b % 5 == 0) ||(a % 3 == 0 && b % 3 == 0 && a % 5 == 0 && b % 5 == 0)||(a % 2 == 0 && b % 2 == 0)||(a <= -1 || b <= -1)) {
            if (a % 3 == 0 && b % 3 == 0) {
                System.out.println(exp + "a + b " + eq + (a + b) + sc);
            }
            if (a % 5 == 0 && b % 5 == 0) {
                System.out.println(exp + "a - b " + eq + (a - b) + sc);
            }
            if ((a % 3 == 0 && b % 3 == 0) && (a % 5 == 0 && b % 5 == 0)) {
                System.out.println(exp + "a + b " + eq + (a + b) + sc);
                System.out.println(exp + "a - b " + eq + (a - b) + sc);


            }
            if ((a % 2 == 0 && b % 2 == 0)&&(a>=0&&b>=0)) {
                System.out.println(exp + "a*b " + eq + (a * b) + sc);

            }
            if ((a <= -1 || b <= -1)&&((a % 2 == 0 && b % 2 == 0))) {
                System.out.println(exp + "(a*b*(-1)) " + eq + ((a * b) * (-1)) + sc);
            }else {
            }



        } else {
            System.out.println(" Error");
        }
        task(14);
        hw214(10, 15, 20);

        task(15);
        hw218(40, 6, 100, 21);

        task(16);

        task(17);

        hw223C(35);

        task(18);
        hw418(6);




        task(19);

        a = -2;

        if ((a % 2) == 0) {
            System.out.println(a * 2);

        } else {
            System.out.println(a * a);
        }


//        checked19(2,5,0);                    // -2 5 0

        int[] arrres = {-4, 25, 0};
        int expectedresult = -4;
        int[] Actualresult = {arrres[0]};

        if (expectedresult == Actualresult[0]) {
            System.out.println("\u001B[32m" + "Pass" + "\033[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\033[0m");
        }

        task(20);
        mark = 4;
        if (0 < mark && mark <= 120) {
            if (0 < mark && mark < 5) {
                System.out.println("Сижу дома");
            }
            if (5 <= mark && mark < 16) {
                System.out.println("В школу можно идти с 5 лет");
            }
            if (16 <= mark && mark < 18) {
                System.out.println("Машину можно водить с 16 лет");
            }
            if (18 <= mark && mark <= 120) {
                System.out.println("Машину можно водить с 16 лет" + "\n" + "Голосовать можно с 18 лет");
            }
        } else {
            System.out.println("Ввведены  не корректные данные");
        }

        String[] expected = {"Сижу дома", "В школу можно идти с 5 лет", "Машину можно водить с 16 лет",
                "Машину можно водить с 16 лет" + "Голосовать можно с 18 лет", "Ввведены  не корректные данные"};
        String[] Actualres = {"Сижу дома", "В школу можно идти с 5 лет", "Машину можно водить с 16 лет",
                "Машину можно водить с 16 лет" + "Голосовать можно с 18 лет", "Ввведены  не корректные данные"};


        String[] expectedresult20 = {expected[0]};
        String[] Actualresult20 = {Actualres[0]};

        if (expectedresult20.equals(Actualresult20)) {
            System.out.println("\u001B[32m" + "Pass" + "\033[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\033[0m");
        }
        task(21);
        cas(1);

        short t = 30000;
        System.out.println();
        if (t / 10 == 0) {
            System.out.println("It’s a one-digit number.");
        } else if (t / 100 == 0) {
            System.out.println("It’s a two-digit number.");
        } else if (t / 1000 == 0) {
            System.out.println("It’s a three-digit number.");
        } else if (t / 10000 == 0) {
            System.out.println("It’s a four-digit number.");
        } else if (t / 100000 == 0&&(t<=Short.MAX_VALUE)&&(t>=Short.MIN_VALUE)) {
            System.out.println("It’s a five-digit number.");
        } else {
            System.out.println("Это оператор else");
        }
        casl();


        cas(2);
        t = -400;


        String tt = Integer.toString(t);
        a = String.valueOf(Math.abs(t)).length();


        System.out.println("Количество разрядов = " +a);
        casl();



        cas(3);
        t = -5;

        int nDigits = 0;
        while (t != 0) {
            nDigits++;
            t /= 10;
        }
        System.out.println("Количество разрядов = " + nDigits);


    }


//        String line = "__________________________________________________________________________________________";
//        String lb = "| ";
//        String numb = cas();


    public static void task(int aa) {
        String lb = "<<<<<<<<<<<<<<<<<<<<<<<<<<<< ";
        String task = " Задача № ";
        String rb = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.println(lb + task + aa + rb);


    }

    public static void cas(int nc) {
        System.out.println("Case #  " + nc);
    }

    public static void casl() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void hw214(int k, int l, int m) {
        String res = "Результат деления ";
        String na = " на ";
        String rem = " , a остаток от деления = ";
        System.out.println(res + " k " + na + "k = " + (k / k) + rem + k % k);
        System.out.println(res + " k " + na + "l = " + (k / l) + rem + k % l);
        System.out.println(res + " k " + na + "m = " + (k / m) + rem + k % m);
        System.out.println(res + " l " + na + "l = " + (l / l) + rem + l % l);
        System.out.println(res + " l " + na + "k = " + (l / k) + rem + l % k);
        System.out.println(res + " l " + na + "m = " + (l / m) + rem + l % m);
        System.out.println(res + " m " + na + "l = " + (m / l) + rem + m % l);
        System.out.println(res + " m " + na + "k = " + (m / k) + rem + m % k);
        System.out.println(res + " m " + na + "m = " + (m / m) + rem + m % m);


    }

    public static void hw218(int apple, int student, int apple2, int student2) {

        String es = " Если ";
        String dev = " поделить на ";
        String pup = " учеников, то каждый ученик получит по ";
        String ap = " яблок(а), и ";
        String rr = " яблок(а) останется учителю.";


        String agr = es + apple + dev + student + pup + apple / student + ap + apple % student + rr;
        System.out.println(agr);


        agr = es + apple2 + dev + student2 + pup + apple2 / student2 + ap + apple2 % student2 + rr;

        System.out.println(agr);
    }

    public static void hw223C(int cc) {
        String gc = " градусов(a)  по цельсию = ";
        String Far = " градусов(а) по Фаренгейту";

        double gf = cc * 9 / 5 + 32;

        String gr = cc + gc + Math.round(gf * 1000.0) / 1000.0 + Far;
        String gr1 = cc + gc + String.format("%.4f", gf) + Far;
        System.out.println(gr);

    }

    public static void hw418(int imin) {
        String ll = "|         ";
        String cl = "           |               ";
        String rl = "           |";
        String inte = "int ";
        String sp = " ";
        String ii = "i²";

        String title = "|      Type of verible        |                 Value               |";
        String line = "_____________________________________________________________________";
        String max = " max ";
        String min = " min ";


        System.out.println(line);
        System.out.println(title);
        System.out.println(line);
        System.out.println(ll + inte + min + cl + (imin + 1) + rl);
        System.out.println(line);
        System.out.println(ll + inte + max + cl + sp + imin + rl);
        System.out.println(line);
        System.out.println(ll + "\t" + ii + sp + "\t\t\t\t" + sp + sp + ll + "\t\t\t\t" + (imin*imin) + rl);
        System.out.println(line);
        System.out.println();






//    public static void checked19(int a,int b, int c){
//
//
//
//        int [] arr19 ={-2,5,0};
//        for(int i =0; i < arr19.length; i++) {
//            if ((arr19[i] % 2) == 0) {
//                System.out.println(arr19[i] * 2);
//
//            } else {
//                System.out.println(arr19[i] * arr19[i]);
//            }
//        }
//        System.out.println(arr19[0]);
//        System.out.println(arr19[1]);
//        System.out.println(arr19[2]);
//        }




    }


}
