
package h.m.s;
/**
 *
 * @author meemk
 */
public class Doctor extends Report{
    public int salary = 0;
   
    protected void checkReport(String catagory,String location,String status){
        super.catagory = catagory;
        super.location = location;
        super.status = status;
        
        if(("normal".equals(catagory))&& ("green".equals(location))){
            System.out.println("Forwarded to hospital");
        }
        if(("advanced".equals(catagory))&& ("better".equals(status))){
            System.out.println("Stay here");
        }
    }
    
    
    
}
