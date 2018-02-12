/**
 * Created by sasid on 1/18/2016.
 */
import org.apache.poi.*;
public class utility_class {

    public void test_sleep(int timeinsecs)
    {
        System.out.println( timeinsecs);

        try{
        Thread.sleep(timeinsecs);
        }
        catch (Exception e){
            System.out.println(e);
       }

    }




}
