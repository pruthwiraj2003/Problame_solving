// WAP to check a number is even or odd
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = sc.nextInt();
        // if(N%2==0){
        //     System.out.println("Entered number is Even");
        // }
        // else{
        //     System.out.println("Entered NUmbered is ODD number ");
        // }
        // WAP to check given number is prime number
        int prime=0; 
        for(int i=2;i<N;i++){
            if(N%i==0){
                prime =1;
                break;
            }

            
        }
        if(prime ==1){
            System.out.println("Entered number is not a prime number ");
            
        }
        else {
            System.out.println("Entered number is  a prime number ");

        }
    }
}
