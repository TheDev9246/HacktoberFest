
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stallion
 */
public class Task3 {
public void saveEven(int number){
    LinkedList<Integer>list=new LinkedList();
    Iterator<Integer>iter=list.iterator();
    
    Scanner s=new Scanner(System.in);
     System.out.println("Enter the number");
   int integer=s.nextInt();
    if(integer%2==0){
        System.out.println("The number is Even");
    }
    else{
        System.out.println("The number is not Even");
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Task3 t3=new Task3();
          Scanner s=new Scanner(System.in);
         System.out.println("Enter the number: ");
       
    int integer=s.nextInt();
       t3. saveEven(integer);
        
    }
    
}
