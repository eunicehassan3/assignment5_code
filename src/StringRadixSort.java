import java.util.Arrays;

public class StringRadixSort {
    public static int getMax(String[] arr){
        int max = arr[0].length();
        for(int i = 1; i < arr.length; i++){
            if(arr[i].length() > max) max = arr[i].length();
        }
        return max;
    }

    public static void countSort(String[] arr, int digit){
        int n = arr.length;
        String[] res = new String[n];
        int[] count = new int[256]; // length of values on ASCII table

        for (String s : arr) {
            int index;
            if (digit < s.length()) {
                index = (int) s.charAt(s.length() - digit - 1);
            } else {
                index = 0;
            }
            count[index]++;
        }

        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            String s = arr[i];
            int index;
            if (digit < s.length()) {
                index = (int) s.charAt(s.length() - digit - 1);
            } else {
                index = 0;
            }
            res[count[index] - 1] = arr[i];
            count[index]--;
        }

        System.arraycopy(res, 0, arr, 0, n);
    }

    public static String[] radixSort(String[] arr) {
        int max = getMax(arr);
        for (int digit = 0; digit < max; digit++) {
            countSort(arr, digit);
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] arr = {"gojo", "google", "jogo", "bill", "pup", "cipher", "watchmen", "knight", "it", "stand", "sandman", "hydra", "surtr"};
        System.out.println(Arrays.toString(radixSort(arr)));
    }
}
