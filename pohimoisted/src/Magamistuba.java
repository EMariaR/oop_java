public class Magamistuba {
    public static void main(String[] args) {
        Sein sein1 = new Sein( "põhi");
        Sein sein1 = new Sein(suund:"lõuna");
        Sein sein1 = new Sein(suund:"ida");
        Sein sein1 = new Sein(suund:"lääs");

        Lagi lagi = new Lagi(korgus:3.5, varv:"soe valge");

        Voodi voodi = new Voodi(nimetus:"Anna", korgus:60, lina:2, padi:4, tekk:1);

        voodi.voodiLoomine();

        Lamp lamp =new Lamp(nimetus:"Kati", patarei:true);
        lamp.lulita();
        
    }
}
