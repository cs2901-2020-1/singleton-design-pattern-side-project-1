public class MyApp {
    public static void main(String[] args) {

        // Create Objects ChocolateBoiler
        ChocolateBoiler choco1 = new ChocolateBoiler();
        ChocolateBoiler choco2 = new ChocolateBoiler();

        // Create Objects ChocolateBoilerSingleton
        ChocolateBoilerSingleton chocoSingleton1 = ChocolateBoilerSingleton.getInstance();
        ChocolateBoilerSingleton chocoSingleton2 = ChocolateBoilerSingleton.getInstance();

        // Create ChocolateBoilerTest
        ChocolateBoilerTest.test(choco1, choco2);

        // Create ChocolateBoilerSingletonTest
        ChocolateBoilerSingletonTest.test(chocoSingleton1, chocoSingleton2);

        // Create ChocolateBoilerSingletonMultiThreadTest
        ChocolateBoilerSingletonMultiThreadTest.test();
    }
}
