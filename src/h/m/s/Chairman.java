
package h.m.s;
/**
 *
 * @author meemk
 */
public class Chairman extends Doctor{
    private String dPerformance;
    
    public void dPerformance(String dPerformance){
       this.dPerformance = dPerformance;
       
        if("good".equals(dPerformance)){
            System.out.println("Your Performance is Good");
            super.salary= 20000;
        } 
        
    }
}
