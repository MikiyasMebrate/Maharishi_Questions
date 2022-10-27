import java.util.Arrays;

public class EncodeNum {
    static int[] encodeNumber (int n) {
        int org = n;
        int count = 0;
        if (n <= 1) return null;
        else {
            int i = 2;
            while (i <= n) {
                while(n % i == 0) {
                    count++;
                    n = n/i;
                }
                i++;
            }

            int[] a = new int[count];
            int j = 2,in=0;
            while (j <= org) {
                while (org % j == 0) {
                    a[in] = j;
                    org = org/j;
                    in++;
                }
                j++;
            }
            return a;
        }
    }


    public static void main(String argus[]){
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
        System.out.println(Arrays.toString(encodeNumber(1)));
        System.out.println(Arrays.toString(encodeNumber(-18)));
    }
}
