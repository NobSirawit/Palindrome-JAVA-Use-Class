public class Palindrome  {
    private int num ;
    public Palindrome(int num){
        this.num = num ;
    }
    public int getNum(){
        return num ;
    }
    public int Check(){
        int n, sum , count, d ;
        n = num ;
        sum = 0 ;
        while(n>0){
          d = n%10 ;
          sum = (sum*10)+d ;
          n /= 10 ;
        }
        if(sum  == num ){
            return 1 ;
        }
        else {
            return 2 ;
        }
    }

}
