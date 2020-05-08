public class ChocolateBoilerSingletonMultiThreadTest extends Thread {
    public void run() {

    }

    public static void main(String args[]) {
        ChocolateBoilerSingletonMultiThreadTest obj = new ChocolateBoilerSingletonMultiThreadTest();
        obj.start();
    }
}