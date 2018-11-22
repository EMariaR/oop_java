public class Kujund {
//  tüüpi nimetused - klassi muutujad
    public String nimetus;
    public Double pindala;
    public Boolean nurkadeOlemasolu;
    public Integer nurkadeArv;

//  klassi konstruktor
    public Kujund(String nimi) {
        this.nimetus = nimi;
    }

//  Tüübi tegevused - klassi meetodid
    public void arvutaPindala(){
        System.out.println("Kujund klassi arvutaPindala() meetod");
    }

    public void väljastaKirjeldus() {
        System.out.println(this.nimetus);
        this.arvutaPindala();
        System.out.println();
    }
}
