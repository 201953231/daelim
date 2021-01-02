import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){
        Scanner scv = new Scanner(System.in);
        int n = scv.nextInt();

        int count  = 0;

        for(int k=2; k<n; k++){
            if(n%k == 0){
                count ++;
                break;
            }
            System.out.println(k);
        }

        if(count == 0){
            System.out.println(n + "is Prime Number!");
        }else{
            System.out.println(n + "is Not Prime Number");
        }
    }
}
