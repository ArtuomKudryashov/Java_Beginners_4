package hw_4;

public class sixt2 {
    public static void main(String[] args) {
        appl1(55,5);
    }
    static void appl1(int i, int j) {
        String es = " Если ";
        String dev = " поделить на ";
        String pup = ", то каждый ученик получит по ";
        String ap = " яблок(а), и ";
        String rr = "  останется учителю.";
        String yabloko = " Яблоко ";
        String yablokа = " Яблока ";
        String yablok = " Яблок ";
        String yabloku = " Яблоку ";
        String student = " Ученик ";
        String studenta = " Ученика ";
        String studentov = " Учеников ";
        String and = " и ";


        String a = "Яблоко";
        if (i == 1 && (j == 2||j==42||j==5)) {
            System.out.println((i) + " Яблоко");
            System.out.println("Забыли про учеников, надо это яблоко или яблоки отдать учителю!");


        }

        if ((i % 10 == 2 || i % 10 == 3 || i%10 ==4) && (j == 42 || j == 2)) {
            System.out.println((i) + " Яблока");
//            System.out.println(es + i + yablokа + dev + j + studenta + pup + i / j + yabloku + and + i % j +yablok + rr);
        }
        if ((i % 10 == 2 || i % 10 == 3 || i % 10 ==4)&& (j == 5)) {
            System.out.println((i) + " Яблока");
//            System.out.println(es + i + yablokа + dev + j + studentov + pup + i / j + yablok + and + i % j + yablokа + rr);


        }
        if (i == 55 && (j == 42)) {

            System.out.println(i + " Яблок");
            System.out.println(es + i + yablok + dev +  j +studenta + pup + i / j + yabloku + and + i % j + yablok+ rr);
        }
        if (i == 55 && (j == 2)) {

            System.out.println(i + " Яблок");
            System.out.println(es + i + yablok + dev + j + studenta + pup + i / j + yablok + and + i % j +yablok + rr);
        }
        if (i == 55 && (j == 5)) {

            System.out.println(i + " Яблок");
            System.out.println(es + i + yablok + dev + j +studentov + pup + i / j + yablok + and + i % j + yablok + rr);

        } else {
//            System.out.println(i + " Яблок");
//            System.out.println(es + i + yablok + dev + student + pup + i / j + ap + i % j+yablok+ rr);
        }
    }


}

