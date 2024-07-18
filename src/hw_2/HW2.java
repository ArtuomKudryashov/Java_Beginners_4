package hw_2;

public class HW2 {
    public static void main(String[] args) {
        int k = 5;
        int l = 10;
        int m = 15;
        String sp = " ";

        int taskn = 12;
        String task = ("\u2714" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" +
                "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + " Задача # " + taskn + "\u2710" + "\u2710" + "\u2710" + "\u2710" +
                "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" +
                "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2714");
        System.out.println(task);
        System.out.println(k + "\n" + l + "\n" + m);

        taskn = 13;
        task = ("\u2714" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" +
                "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + " Задача # " + taskn + "\u2710" + "\u2710" + "\u2710" + "\u2710" +
                "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" +
                "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2710" + "\u2714");
        System.out.println(task);


        System.out.println("k = " + k + sp + "l = " + l + sp + "m = " + m);
        System.out.println(k + " " + l + " " + m);

        taskn = 14;


        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);
        String fix = ", ";
        System.out.println(k + fix + m + fix + l);

        taskn = 15;
        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);
        char sc = ';';
        System.out.println("int k = " + k + sc + "\n" + "Int l = " + l + sc + "\n" + "int m = " + m + sc);

        taskn = 16;
        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);
        System.out.println("Sum of k and l = " + (k + l));
        System.out.println("k * m = " + (k * m));
        System.out.println("Разность переменных  l  и m = " + (l - m));

        taskn = 17;
        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);

        String res = "Результат деления ";
        String na = " на ";
        String rem = " , a остаток от деления = ";
        k = 13;
        l = 49;
        m = 15;

        System.out.println(res + " k " + na + "k = " + (k / k) + rem + k % k);
        System.out.println(res + " k " + na + "l = " + (k / l) + rem + k % l);
        System.out.println(res + " k " + na + "m = " + (k / m) + rem + k % m);
        System.out.println(res + " l " + na + "l = " + (l / l) + rem + l % l);
        System.out.println(res + " l " + na + "k = " + (l / k) + rem + l % k);
        System.out.println(res + " l " + na + "m = " + (l / m) + rem + l % m);
        System.out.println(res + " m " + na + "l = " + (m / l) + rem + m % l);
        System.out.println(res + " m " + na + "k = " + (m / k) + rem + m % k);
        System.out.println(res + " m " + na + "m = " + (m / m) + rem + m % m);

        taskn = 18;
        int apple = 40;
        int student = 6;

        // Вычисление остатка и вывод сообщения
        int remainder = apple % student;
        int eachStudentGets = apple / student;

        // Формирование и вывод строки с использованием форматирования
        System.out.printf("Если %d яблок поделить на %d учеников, то каждый ученик получит по %d яблок(a), и %d яблок(а) останется учителю.\n",
                apple, student, eachStudentGets, remainder);

        taskn = 18;

        apple = 40;
        student = 6;
        String es = " Если ";
        String dev = " поделить на ";
        String pup = " учеников, то каждый ученик получит по ";
        String ap = " яблок(а), и ";
        String rr = " яблок(а) останется учителю.";

        String agr = "Если " + apple + " поделить на " + student + " учеников, то каждый ученик получит по "
                + apple / student + " яблок(а), и " + apple % student + " яблок(а) останется учителю.";
        System.out.println(agr);
        agr = es + apple + dev + student + pup + apple / student + ap + apple % student + rr;
        System.out.println(agr);


        apple = 100;
        student = 21;
        agr = "Если " + apple + " поделить на " + student + " учеников (а), то каждый ученик получит по "
                + apple / student + " яблок(а), и " + apple % student + " яблок(а) останется учителю.";
        System.out.println(agr);
        agr = es + apple + dev + student + pup + apple / student + ap + apple % student + rr;

        System.out.println(agr);
        k = 13;
        l = 49;
        m = 15;


        taskn = 19;
        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);
        /**Распечатать вычисления и итоговый результат:
         Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM = …*/


        // 1) Создаю пременную sumLKM и считаю ее  значение

        int sumLKM = l + k + m;


        //2) Считаю новое  значение переменной m из-за  операции ++
        m++;

        //3) Высчитываю разность (из  условия  задачи: а разность m++ и  sumLKM = …
        int subs = m - sumLKM;
        System.out.println("Разность m++  и sumLKM = " + subs);

        //4) Создаю  и инициализирую новую  переменную sumKLM -  эта переменная  не является  переменной sumLKM
        int sumKLM = sumLKM;
        //5) Уменьшаю значение sumKLM из условия  задачи на единицу путем операции --
        sumKLM--;
        //6) теперь суммирую  из условия (Сумма чисел k, l, m++ и sumKLM--)
        int s = k + l + m + sumKLM;
        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + s);


        taskn = 20;
        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);

        int a = 48;
        int b = 8;
        int c = 47;
        int d = 49;

        System.out.println(a % 2);
        System.out.println(b % 2);
        System.out.println(a % b);

        System.out.println(c % 2);
        System.out.println(d % 2);


        int x = 2;
        int y = 3;
        a = k;
        b = l;
        c = m;
        d = y - x;
        k = 13;
        l = 49;
        m = 15;
        taskn = 21;
        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);


        System.out.println("(x+3)\u00B2");  //00B2
        System.out.println("(x+3)*(x+3)");
        int result21 = ((x + 3) * (x + 3));
        System.out.println(result21);


        taskn = 22;
        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);
        System.out.println();

        // привожу каждую дробь к  отдельной переменной.

        int r = (3 + 4 * x) / 5;

        int t = ((10 * (y - 5) * (a + b + c)) / x);
        int o = 9 * ((4 / x) + ((9 + x) / y));


        System.out.println("((3+4*x)/5)-((10*(y-5)*(a+b+c))/x)+9*((4/x)+((9+x)/y))");
        int result22 = ((3 + 4 * x) / 5) - (((10 * (y - 5) * (a + b + c)) / x)) + (9 * ((4 / x) + ((9 + x) / y)));
        int result222 = ((3 + 4 * x) / 5) - (10 * (y - 5) * (a + b + c)) / x + 9 * ((4 / x) + ((9 + x) / y));
        System.out.println(result222);

        System.out.println(result22);
        System.out.println(result222);


        taskn = 23;
        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        x = 2;
        y = 3;
        a = k;
        b = l;
        c = m;
        d = y - x;
        k = 13;
        l = 49;
        m = 15;
        System.out.println(task);

        int q = (5 * x + 7 * y) / (8 * x + 10 * y); // 5*2+7*3/8*2+10*3=21/46


        int p = (3 * x - y) / (x + y);
        int w = (a + b + c / d + (a + b) / (c + d) + a * b);

        System.out.println("(((5 * x + 7 * y)/(8 * x+10 * y))/((3 * x - y)/(x + y)))/((a + b + (c/d) " +
                "+ (a + b)/(c + d) + a * b))");
        System.out.println((((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y))) / ((a + b + (c / d) + (a + b) / (c + d) + a * b)));
        System.out.println(q / p + "\n" + w);

        int result23 = ((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y) / (a + b + c / d + (a + b) / (c + d) + a * b));
        System.out.println(result23);

        int number = 20;

        String line = "____________________________________";

        System.out.println(line);
        System.out.println("|    T A S K #    |  R  E S U L T  |");
        System.out.println(line);
        System.out.println("|      " + (++number) + "         |     " + result21 + "         |");
        System.out.println(line);
        System.out.println("|      " + (++number) + "         |     " + result22 + "      |");
        System.out.println(line);
        System.out.println("|      " + (++number) + "         |     " + result23 + "        |");
        System.out.println(line);

        String ll = "|      ";
        String cl = "         |     ";
        String text = "|    T A S K #    |  R  E S U L T  |";

        System.out.println(line);
        System.out.println(text);
        System.out.println(line);
        System.out.println(ll + (++number) + cl + result21 + "         |");
        System.out.println(line);
        System.out.println(ll + (++number) + cl + result22 + "      |");
        System.out.println(line);
        System.out.println(ll + (++number) + cl + result23 + "        |");
        System.out.println(line);


        int numb = 54;
        System.out.println(++numb);// увеличилось на единицу

        int cc = 45;
        System.out.println(cc++);// записалось на 1  больше но не вывелось.
        System.out.println(cc);

        int ccc = 45;
        if (ccc > 5) {
            for (int i = 0; i < 10; i++) {
                if (ccc / 5 == 0) {
                    System.out.println(ccc);
                    ccc++;
                }
                ccc++;
                System.out.println(ccc);


            }
            ccc++;


        }
        ccc++;

        taskn = 56;


    }
}
