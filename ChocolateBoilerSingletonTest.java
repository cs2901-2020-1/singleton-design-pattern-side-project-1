public class ChocolateBoilerSingletonTest {

    /**
     *
     * @param chocoSingle1
     * @param chocoSingle2
     */
    public static void test(ChocolateBoilerSingleton chocoSingle1, ChocolateBoilerSingleton chocoSingle2) {
        System.out.println("\nTest ChocolateBoilerSingleton");
        if(chocoSingle1 == chocoSingle2){
            System.out.println("Objetos iguales. Objeto1: " + chocoSingle1 + ", Objeto2: " + chocoSingle2);
            return;
        }
        System.out.println("Objetos diferentes. Objeto 1: " + chocoSingle1 + ", Objeto 2:" + chocoSingle2);
    }
}
