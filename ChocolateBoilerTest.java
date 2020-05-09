public class ChocolateBoilerTest {

    /**
     *
     * @param choco1
     * @param choco2
     */
    public static void test(ChocolateBoiler choco1, ChocolateBoiler choco2) {
        System.out.println("\nTest: ChocolateBoiler");
        if(choco1 == choco2){
            System.out.println("Objetos iguales");
            return;
        }
        System.out.println("Objetos diferentes. Objeto 1: " + choco1 + ", Objeto 2:" + choco2);
    }

}
