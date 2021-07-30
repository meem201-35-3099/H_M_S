
package h.m.s;
import java.util.Scanner;
/**
 *
 * @author meemk
 */
public class Main {

   
    public static void main(String[] args) {
        Doctor d = new Doctor();
        
        Scanner input = new Scanner(System.in);
        
       
        System.out.print("Select catagory between \"normal\" or \"advanced\": ");
        String catagory;
        catagory = input.nextLine();
        
        
        System.out.print("Select location between \"green\" or \"NULL\": ");
        String location;
        location = input.nextLine();
        
        
        System.out.print("Select status between \"better\" or \"NULL\": ");
        String status;
        status = input.nextLine();
        
        d.checkReport(catagory,location,status);
        
        System.out.print("Enter Performance: ");
        String dPerformance;
        dPerformance = input.nextLine();
        
        Chairman c =new Chairman();
        c.dPerformance(dPerformance);
        
    }
    
}
