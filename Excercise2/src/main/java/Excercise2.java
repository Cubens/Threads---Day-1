


// @author Lasse
 
public class Excercise2 {
    public static void main(String[] args)
    {
        Even e = new Even();
        
        Thread t1 = new Thread(() -> {
            while(e.next() % 2 == 0){
                System.out.println("T1: We are EQUAL: " +e.next());
            }
            System.out.println("T1: Woops race condition occured");
        });
        
        Thread t2 = new Thread(() -> {
            while(e.next() % 2 == 0){
                System.out.println("T2: We are EQUAL: " +e.next());
            }
            System.out.println("T2: Woops race condition occured");
        });
        
       t1.start();
       t2.start();
        
    }
}
