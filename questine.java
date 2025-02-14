//Given that bthe length and breadthnof a rectangle write a program to find whether the  the area of the rectangle is grater than its perimeter

import java.util.Scanner;

public class questine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle ");
        int Length=sc.nextInt();
        System.out.println("Enter breadth of the rectangle");
        int breadth = sc.nextInt();
        double  area = Length*breadth ;
        
        double perimeter =  2*(Length+breadth);
    
        if(area>perimeter){
            System.out.println("Area is grater thye perimeter");
            
        } 



    }





}