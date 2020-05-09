public class ChocolateBoilerSingletonMultiThreadTest {
    public static void main(String args[]) {
        MultiThread multiThread;
        for (int i = 0; i < 4; i++) {
            multiThread = new MultiThread();
            if (multiThread.isAlive()) {
                System.out.println("Thread " + i + " launched");
            }
        }
    }
}

class MultiThread extends Thread {
    
    MultiThread() {
        start();
    }
  
    public void run() {
        /* Coloca aqui el test
        ChocolateBoilerSingletonTest test = new ChocolateBoilerSingletonTest();
        test.execute();
        */
    }
}