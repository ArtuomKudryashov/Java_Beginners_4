package hw_7;

public class Method21 {
    public static double getMinMaxAver (double[] arr){
        if(arr.length==0){
            return 10000;
        }
        double max = arr[0];
        double min = arr[0];
        double sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (max< arr[i]){
                max=arr[i];
            }
            if (min > arr[i]){
                min =arr[i];
            }
            sum = sum +arr[i];

        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("Avverage= " + sum/ arr.length);
        return 0;
    }

}
