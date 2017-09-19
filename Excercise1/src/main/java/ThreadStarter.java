


import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


// @author Lasse
 
public class ThreadStarter {
    
    private static volatile boolean runT3 = true; 
    
    public static void main(String[] args) throws InterruptedException
    {
    
      
        
        Thread t1 = new Thread(() -> {
            long sum = 0;
	           for (int i = 0; i < 1e8; i++)
            {
                sum = sum + i;               
            }
                   System.out.println("T1: Total sum is: "+sum);
});
        
        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 6; i++)
            {
                System.out.println("T2: "+i);
                try
                {
                    sleep(2000);
                } catch (InterruptedException ex)
                {
                    Logger.getLogger(ThreadStarter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
});
        
        
        Thread t3 = new Thread(() -> {
            
            for (int i = 10; runT3; i++)
            {
                System.out.println("T3: "+i);
                try
                {
                    sleep(3000);
                } catch (InterruptedException ex)
                {
                    Logger.getLogger(ThreadStarter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
});
        
        
        
        t1.start();
        t2.start();
        t3.start();
        sleep(10000);
        runT3 = false;
    }
}
