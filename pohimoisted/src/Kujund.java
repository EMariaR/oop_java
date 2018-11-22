public class Kujund {
//  tüüpi nimetused - klassi muutujad
    private String nimetus;
    private Double pindala;
    private Boolean nurkadeOlemasolu;
    private Integer nurkadeArv;

//  klassi konstruktor
    public Kujund(String nimi) {
        System.out.println(this.nimetus);
        this.nimetus = nimi;
    }

    //setterid
    public void

    public void setNurkadeOlemasolu(Boolean nurkadeOlemasolu) {
        this.nurkadeOlemasolu = nurkadeOlemasolu;
    }

    public void setNurkadeArv(Integer nurkadeArv) {
        this.nurkadeArv = nurkadeArv;
    }

    public void setNimetus(String nimi) {
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
