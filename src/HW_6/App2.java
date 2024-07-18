package HW_6;

public class App2 {
    public static void main(String[] args) {
        Methods.task(11);
        Methods_2.seq(5, 0);

        Methods.task(12);

        Methods_2.seq2(5);


        Methods.task(12);
        Methods_2.st(5);

        Methods.task(13);
        Methods_2.task13();
        System.out.println(Methods_2.task13());

        Methods.task(14);
        Methods_2.task14();
        System.out.println();

        Methods.task(15);
        Methods_2.task15();
        System.out.println();

        Methods.task(16);
        Methods_2.task16(3,2,15);

        Methods.task(17);
        Methods_2.task17(1);


        Methods.task(18);

        Methods_2.task18( 1,10);

        Methods.task(19);
        Methods_2.task19();

        Methods.task(20);
        for (int x = -5; x < 5; x += 1) {
            if (x > 1.5) {
                System.out.printf("%s%d%s%.1f%n", "For x = ", x, " y = ", 2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30);
            } else if (0 <= x && x <= 1.5) {
                System.out.printf("%s%d%s%d%n", "For x = ", x, " y = ", x + 1);
            } else {
                System.out.printf("%s%d%s%d%n", "For x = ", x, " y = ", x);
            }
        }













    }

}
