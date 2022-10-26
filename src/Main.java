public class Main {

    static int largestAdjacentSum(int[] a){
        int largest = a[0] + a[1];

        for(int i = 1; i < a.length-1; i++){
            if(a[i] + a[i+1] > largest)
                largest = a[i] + a[i+1];
            else
                continue;
        }

        return largest;
    }
    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[] {1,2,3,4}));
        System.out.println(largestAdjacentSum(new int[] {18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[] {1,1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[] {1,1,1,1,1,2,1,1,1}));
    }
}