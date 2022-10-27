public class EncodeNum {

    static int[] encodeNumber (int n) {
        int org = n;
        int count = 0;
        if (n <= 0) return null;
        else {
            int i = 2;
            while (i < n) {
                if (n % i == 0) {
                    count++;
                    n /= i;
                    continue;
                }
                i++;
            }
        }
        int[] a = new int[count];
        int j = 2,in=0;
        while (j < n) {
            if (n % j == 0) {
                a[in] = j;
                n /= j;
                continue;
            }
            j++;
        }

        return a;
    }


    public static void main(){
        System.out.println(encodeNumber(1200));
    }
}
