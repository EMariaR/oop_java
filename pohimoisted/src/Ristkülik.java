public class Ristkülik extends Kujund {
// objekti omadused - klassi muutujad
    private Double pikkus;
    private Double laius;
    private Integer nurk;

//  Lisan siia konkreetse objekti parameetrid, mida on vaja ristküliku jaoks
    public Ristkülik(String nimi, Double p, Double l) {
        super(nimi);
        this.pikkus = p;
        this.laius = l;
        this.setNurkadeOlemasolu(true);
        this.setNurkadeArv(4);
        this.nurk = 90;
        System.out.println("Ristküliku klassi konstruktor");
    }

    @Override
    public void väljastaKirjeldus() {
//   super.väljastaKirjeldus();
        System.out.println("Ristküliku klassi väljastaKirjeldus()");
        System.out.println(this.getNimetus());
        System.out.println("Pikkus = " + this.pikkus);
        System.out.println("Laius = " + this.laius);
        if (this.getNurkadeOlemasolu()) {
            System.out.println("Kokku on " + this.getNurkadeArv() + " nurka.");
        }
        System.out.println("Nurgad on = " + this.nurk + " kraadi.");
    }
}
