import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){
        Scanner scv = new Scanner(System.in);
        int n = scv.nextInt();

        int count  = 0;

        for(int k=1; k<=n; k++){
            if(n%k == 0){
                count ++;
            }
        }

        if(count == 2){
            System.out.println(n + "은 소수!");
        }else{
            System.out.println(n + "은 소수가 아닙니다.");
        }
    }
}
