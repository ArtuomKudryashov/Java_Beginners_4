package hw_7;

public class Method3 {

    public static int [][] arr4 (int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

              arr[i][j] = (int) (1+Math.random() * 10);
            }

        }
        return arr;
    }
}
