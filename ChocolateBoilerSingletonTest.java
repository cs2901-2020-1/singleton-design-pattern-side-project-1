public class ChocolateBoilerSingletonTest {

    /**
     *
     * @param chocoSingle1
     * @param chocoSingle2
     * @return true if both objects are equals (both in the same memory address) otherwise false
     */
    public static boolean test(ChocolateBoilerSingleton chocoSingle1, ChocolateBoilerSingleton chocoSingle2) {
        System.out.println("\nTest ChocolateBoilerSingleton");
        if(chocoSingle1 == chocoSingle2){
            return true;
        }
        return false;
    }
}
