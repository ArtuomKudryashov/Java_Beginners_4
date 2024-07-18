package hw_4;

public class New {
    public static void main(String[] args) {

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
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;


        System.out.println(line);
        System.out.println(title);
        System.out.println(line);
        System.out.println(ll + inte + min + cl + (mini + 1) + rl);
        System.out.println(line);
        System.out.println(ll + inte + max + cl + sp + mini + rl);
        System.out.println(line);
//        System.out.println(ll + "\t" + ii + sp + "\t\t\t\t" + sp + sp + ll + "\t\t\t\t" + mul22(a); +rl);
        System.out.println(line);
        System.out.println();

    }

    public static void mul(int a) {
        a = a * a;
        System.out.println(a);
    }
    public static void mul2(int a) {

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
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;


        System.out.println(line);
        System.out.println(title);
        System.out.println(line);
        System.out.println(ll + inte + min + cl + (mini + 1) + rl);
        System.out.println(line);
        System.out.println(ll + inte + max + cl + sp + mini + rl);
        System.out.println(line);
        System.out.println(ll + "\t" + ii + sp + "\t\t\t\t" + sp + sp + ll + "\t\t\t\t"  + rl);
        System.out.println(line);
        System.out.println();
    }
    public static void mul22(int a) {
        a = a * a;
        System.out.println(a);
    }

}
