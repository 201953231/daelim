import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){
        Scanner scv = new Scanner(System.in);
        int n = scv.nextInt();

        // int count = 0;
        boolean isPrime = true;

        for(int k=2; k<n; k++){
            if(n%k == 0){
                //count ++; // count = count + 1;
                isPrime = false;
                break;
            }
            System.out.println(k);
        }

        // if(count == 0)
        if(isPrime){
            System.out.println(n + " is Prime Number!");
        }else{
            System.out.println(n + " is Not Prime Number");
        }
    }
}
