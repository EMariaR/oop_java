public class Tervitus {
    public String tervitusTekst;

    public Tervitus(String tervitusTekst) {
        this.tervitusTekst = tervitusTekst;
    }

    public Tervitus() {
        this.tervitusTekst = "...";
    }

    public void tervita() {
        System.out.println(tervitusTekst);
        }

    public void main(String[] args) {
        tervitusTekst = "Tere, Anna!";
        }


}
