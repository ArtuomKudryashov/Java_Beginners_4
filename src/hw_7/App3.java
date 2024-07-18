package hw_7;

import java.util.Arrays;

public class App3 {
    public static void main(String[] args) {
        Method.task(23);
        String sc = ";";
        String[][] homePets = {{" Мурзик ", " 2 ", String.valueOf(Colors.GREY)}, {" Черныш ", " 3 ", String.valueOf(Colors.BLACK)},
                {" Мурка ", " 4 ", String.valueOf(Colors.GREY)}, {" Васька ", " 1 ", String.valueOf(Colors.BROWN)}, {" Рыжик ", " 5 ", String.valueOf(Colors.RED)},
                {" Дымка ", " 6", String.valueOf(Colors.GREY)}, {" Патрик ", " 9 ", String.valueOf(Colors.RED)}, {" Зорро ", " 10 ", String.valueOf(Colors.GREY)}};


        for (int i = 0; i < homePets.length; i++) {
            for (int j = 0; j < homePets[i].length; j++) {
                System.out.print(homePets[i][j]);

            }
            System.out.println(sc);

        }
        Method.task(24);


        int[][] arr = new int[4][8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print((arr[i][j] = (int) (1+Math.random() * 10)) + " ");
            }
            System.out.println();

        }
        System.out.println(Arrays.deepToString(arr));


        Method.task(24);
        Method.cas(1);
        int[][] arr5 = new int[4][8];
        Method3.arr4(arr5);
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.print(arr5[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println(Method3.arr4(arr5).length);


        System.out.println(Arrays.deepToString(arr5));
        Method.cl();
        Method.cas(2);


        for (int i = 0; i < Method3.arr4(arr5).length; i++) {
            for (int j = 0; j < Method3.arr4(arr5)[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        Method.task(25);
        Method3.arr4(arr5);
        int count = 0;
        for (int i = 0; i < arr5.length ; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
               if (arr5[i][j] %  2==0){
                   count = count + arr5[i][j];

               }
            }
        }
        System.out.println(Arrays.deepToString(arr5));
        System.out.println("Сумма четных чисел= "+count);
        
        
        Method.task(23);
        String[][] cats = new String[][]{
                {"Мурзик", "Черныш", "Мурка", "Васька", "Рыжик", "Дымка", "Патрик", "Зорро"},
                {"1", "3", "4", "1", "5", "6", "9", "10"},
                {"Grey", "Black", "Grey", "Brown", "Red", "Grey", "Red", "Grey"}};

        for (int i = 0; i < cats[0].length; i++) {
            if(i % 2 ==0)
            System.out.println("Имя кота в коробке " +(i+1) + " " + cats [0][i]+ "; Возраст кота в коробке " +(i+1) + "; "+ cats[1][i]
                    + ", цвет  кота в коробке " +(i+1) + " "+ cats[2][i]);
            
        }








    }

}





