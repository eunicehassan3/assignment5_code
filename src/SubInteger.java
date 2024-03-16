import java.util.HashSet;
import java.util.Set;
public class SubInteger {
    public static String isSubInteger(int[] s, int[] t){
        Set<Integer> setT = new HashSet<>();
        for (int n : t) {
            setT.add(n);
        }

        for (int num : s) {
            if (!setT.contains(num)) {
                return "No";
            }
        }

        return "Yes";
    }
    public static void main(String[] args) {
        int[] s_arr = {32, 3};
        int[] t_arr =  {1, 2, 3, 52, 32, 54};
        int[] s_arr1 = {89, 32, 54, 32, 3};
        int[] t_arr1 = {54, 32, 99};
        System.out.println(isSubInteger(s_arr, t_arr));
        System.out.println(isSubInteger(s_arr1, t_arr1));
    }
}


