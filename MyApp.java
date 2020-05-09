public class MyApp {
    public static void main(String[] args) {

        // Create Objects ChocolateBoiler
        ChocolateBoiler choco1 = new ChocolateBoiler();
        ChocolateBoiler choco2 = new ChocolateBoiler();

        // Create Objects ChocolateBoilerSingleton
        ChocolateBoilerSingleton chocoSingleton1 = ChocolateBoilerSingleton.getInstance();
        ChocolateBoilerSingleton chocoSingleton2 = ChocolateBoilerSingleton.getInstance();

        // Create ChocolateBoilerTest
        boolean resultAreEquals = ChocolateBoilerTest.test(choco1, choco2);
        if(resultAreEquals){
            System.out.println("Objetos iguales");
        }
        else{
            System.out.println("Objetos diferentes. Objeto 1: " + choco1 + ", Objeto 2:" + choco2);
        }

        // Create ChocolateBoilerSingletonTest
        boolean result2AreEquals = ChocolateBoilerSingletonTest.test(chocoSingleton1, chocoSingleton2);
        if(result2AreEquals){
            System.out.println("Objetos iguales. Objeto1: " + chocoSingleton1 + ", Objeto2: " + chocoSingleton2);
        }
        else{
            System.out.println("Objetos diferentes. Objeto 1: " + choco1 + ", Objeto 2:" + choco2);
        }

        // Create ChocolateBoilerSingletonMultiThreadTest
        ChocolateBoilerSingletonMultiThreadTest.test();
    }
}
