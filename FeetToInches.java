 import java.util.Scanner;
public class program3
{
 
  public static void main(String[] args){
  Scanner obj = new Scanner(System.in);
 System.out.print("Enter a number in feet: ");
 int feet = obj.nextInt();
 int inch = feet * 12;
 System.out.println("Converted Value in inches is: "+ inch);
  }
}
    