public class Tervitus {
    public static String tervitusTekst;

    public static void tervita() {
        System.out.println(tervitusTekst);
        }

    public static void main(String[] args) {
        tervitusTekst = "Tere, Anna!";
        tervita();
    }
}
