import java.util.Arrays;

public class DoubleHashing {
    public static int hash1(int key){
        int x = (key + 13) * (key + 7);
        x = x / 18;
        x = x + key;
        x = x % 11;
        return x;
    }

    public static int hash2(int key){
        int res = 0;
        while(key != 0) {
            int digit = key % 10;
            res = res * 10 + digit;
            key /= 10;
        }
        return res;
    }



    public static int getHashingValue(int key) {
        int hash = (hash1(key) + 0*hash2(key)) % 11;
        return hash;
    }

    public static void main(String[] args) {
        System.out.println(getHashingValue(36));
    }
}
