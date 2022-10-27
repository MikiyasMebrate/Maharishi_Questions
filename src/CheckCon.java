public class CheckCon {

    static int checkContenatedSum(int n, int catlen){
      int org = n;
      int sum =0;
      while(n>0){
          int temp = n%10;
          n = n/10;
          int con = 0;
          for(int i =0; i < catlen; i++){
              con = con*10 + temp;
          }
          sum+=con;
      }

      if(sum==org) return 1;
      else return 0;
    }

    public static void main(String[] args) {
        System.out.println(checkContenatedSum(198,2));
        System.out.println(checkContenatedSum(198,3));
        System.out.println(checkContenatedSum(2997,3));
        System.out.println(checkContenatedSum(2997,2));
        System.out.println(checkContenatedSum(13332,4));
        System.out.println(checkContenatedSum(9,1));

    }
}
