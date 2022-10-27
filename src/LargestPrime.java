public class LargestPrime {
    static int largestPrimeFactor(int n){
        int temp =0;
        if(n <= 1) return 0;
        else{
            if(n%2 == 0) n= n/2;
            for(int i= 3; i <= n; i+=2) {
                   if(n%i == 0){
                       n = n/i;
                       temp = i;
                   }
                }
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }
}
