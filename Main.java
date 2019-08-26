import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        Palindrome p = new Palindrome(n);
        p.Check() ;
        if(p.Check() == 1){
            System.out.println(n+" is a palindrome number.");
        }
        else{
            System.out.println(n+" is not a palindrome number.");
        }
    }

}
