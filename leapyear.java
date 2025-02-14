//Write a program to check if a given year is a leap year.
import java. util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int y = sc.nextInt();
        if((y%4==0 && y%100!=0) || (y%400==0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leapyear");
        }
        
    }
    
}
