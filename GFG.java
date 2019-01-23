import java.util.Scanner;
class GFG 
{ 
public static boolean isPowerOfTwo(int n) 
{ 
return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == (int)(Math.floor(((Math.log(n) / Math.log(2))))); 
} 
   
public static void main(String[] args) 
{ 
    System.out.println("Enter the number");
    Scanner scan=new Scanner(System.in);
    int n= scan.nextInt();
    if(isPowerOfTwo(n)) 
    System.out.println("Yes"); 
    else
    System.out.println("No"); 
       
} 
} 