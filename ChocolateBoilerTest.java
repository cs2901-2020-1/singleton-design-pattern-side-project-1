public class ChocolateBoilerTest {

    /**
     *
     * @param choco1
     * @param choco2
     * @return true if both objects are equals (both in the same memory address) otherwise false
     */
    public static boolean test(ChocolateBoiler choco1, ChocolateBoiler choco2) {
        System.out.println("\nTest: ChocolateBoiler");
        if(choco1 == choco2){
            return true;
        }
        return false;
    }

}
