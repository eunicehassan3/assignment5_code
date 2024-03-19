import java.util.Arrays;

public class ExtraCredit {
    public static int[] sumTarget(int arr[], int k) {
        int[] res = new int[2];
        int i;
        int j;
        for (i = 0; i < arr.length; i++) {
            int curr = arr[i];
            if (curr == k) {
                res[0] = i;
                res[1] = i;
                return res;
            }
            else{
                for(j = i+ 1; j < arr.length; j++){
                    curr += arr[j];
                    if(curr == k){
                        res[0] = i;
                        res[1] = j;
                        return res;
                    }
                }
            }
        }
        res[0] = -1;
        res[1] = -1;
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        System.out.println(Arrays.toString(sumTarget(arr,12)));
        System.out.println(Arrays.toString(sumTarget(arr,5)));
        System.out.println(Arrays.toString(sumTarget(arr,7)));
        System.out.println(Arrays.toString(sumTarget(arr,11)));
    }

}
