package Met;

public class Method_J {
    public static int[] unikal(int[] a) {
        int[] unikal = {};
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]&&a[j]!=0) {
                    a[j] = 0;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        unikal = new int[(a.length - count)];
        count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                unikal[count] = a[i];
                count++;
            }
        }
        return unikal;
    }

}
