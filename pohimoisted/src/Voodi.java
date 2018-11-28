public class Voodi {
    private String nimetus;
    private Integer korgus;
    private Integer lina;
    private Integer padi;
    private Integer tekk;

    public Voodi(String nimetus, Integer korgus, Integer lina, Integer padi, Integer tekk) {
        this.nimetus = nimetus;
        this.korgus = korgus;
        this.lina = lina;
        this.padi = padi;
        this.tekk = tekk;
    }

    public String getNimetus() {
        return nimetus;
    }

    public Integer getKorgus() {
        return korgus;
    }

    public Integer getLina() {
        return lina;
    }

    public Integer getPadi() {
        return padi;
    }

    public Integer getTekk() {
        return tekk;
    }

    //voodi loomine

    public void voodiLoomine() {
        System.out.println("Voodi on valmis");
    }
}
