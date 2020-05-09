public class ChocolateBoilerSingletonMultiThreadTest extends Thread{
    public static void test(){
        Multithread t1 = new Multithread( "Thread-1");
        t1.start();

        Multithread t2 = new Multithread( "Thread-2");
        t2.start();
    }
}

class Multithread extends Thread{
    private Thread t;
    private String threadName;

    Multithread( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try{
            Thread.sleep((long)(Math.random()* 1000));
            ChocolateBoilerSingleton chocoSingleton = ChocolateBoilerSingleton.getInstance();
            if(chocoSingleton.isEmpty()){
                System.out.println("Fill by: " +  threadName );
                chocoSingleton.fill();
            }
            else{
                System.out.println("It's already filled");
            }
        }
        catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}