package HW_6;

public class Methods {
    public static void task(int aa) {
        String lb = "<<<<<<<<<<<<<<<<<<<<<<<<<<<< ";
        String task = " Задача № ";
        String rb = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.println(lb + task + aa + rb);



    }
    public static void sc (){
        System.out.println(";");
    }

     //Tasks 1,
    public static int sqpositive ( int a, int b ){
        for (int i = a;  i < b; i++){
            System.out.print( i + " ");

        }
        return 0;
    }
    //Tasks 2
    public static int sqnegative ( int a, int b ){
        for (int i = a;  i > b; i--){
            System.out.print( i + " ");
        }
        return 0;
    }       //Tasks 3
    public static int sqpositive ( int a, int b, int c  ) {
        for (int i = a; i < b; i += c) {
            System.out.print(i + " ");
        }
        return 0 ;
    }     //Tasks 4
    public static void sqnegative (int a, int b, int c ) {
        for (int i = a; i > b; i--) {
            if (i % c == 0) {
                System.out.println(i+ ";");
            } else {

            }


        }//"%.2f", salary

    } //Tasks 5
    public static int sqpositive ( double a, double b, double c  ) {
        for (double i = a; i < b; i += c) {
            String sq = String.format("%.1f",i);
            System.out.println(sq);

        }
        return 0;
    }// Task 6 7 8
    public static void sqpositive2 (int a, int b, int c ) {
        for (int i = a; i < b; i++) {
            if (i % c == 0 ) {
                System.out.println(i + ";");
            } else {

            }


        }
    }
    public static void sqPos9(int a, int b, int c, int d){
        for (int i = a; i<=b; i++){
            if( i==0){
                System.out.println("Zero");
            }else if(i % c == 0){
                System.out.println( "\u001B[34m"+i+"\u001B[0m");
            }else if ( i % d == 0){
                System.out.println( "\u001B[31m"+i+"\u001B[0m");

            } else {

            }


        }

    }
    public static  void  sq10 (int start, int end, int step) {
        if (step > 0){
            if (start < end){
                for (int i = 0; i < end ; i+=step) {
                    System.out.println(i);
                }


            }else {
                System.out.println("Десятичных  чисел, соответсвующих ");
            }
        }
        if (start < end){
            for (int i = start; i<=end; i+= step ) {
            System.out.println(i);
        }}
    }
    public static void  seq10 (double start, double end, double step){
        //increasing start <end, step >0;
        if( start < end && step > 0 ){
            for(start = start; start < end; start += step){
                System.out.println(start);
            }
            //decreasing start > end, step <0
        }else if (start > end && step < 0){
            for(start = start; start > end; start += step) {
                System.out.println(start);
            }
        } else {
            System.out.println("Error");
        }

    }

}
