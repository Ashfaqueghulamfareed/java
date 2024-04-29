
package pkgnew;
import java.util.Scanner;

public class New {
    int calc(int x,int y,int option)
            {
                switch(option)
                        {
                          case 1: System.out.println("the addition of two num" + (x+y));
                            break;
                          case 2:System.out.println("Subtraction of two numbers"+(x-y));
                          break;
                          case 3: System.out.println("multiplication of two numbers"+(x*y));
                          break;
                          case 4: System.out.println("division of two number"+(x/y));
                          break;
                          case 5: System.out.println("division of two number"+(x/y));
                          break;  
                          
                            
                        }
                return x;
                        
            }

    public static void main(String[] args) {
 New obj=new New();
 Scanner r=new Scanner(System.in);
 System.out.println("1.Addition");
 System.out.println("2.Subtraction");
 System.out.println("3.Multiplication");
 System.out.println("4.Division");
 System.out.println("Enter the number x ");
 int x=r.nextInt();
 System.out.println("Enter the num y");
 int y=r.nextInt();
 
 
 System.out.println("task to perform");
 int option= r.nextInt();
 obj.calc(x, y, option);  
    }
    
}
