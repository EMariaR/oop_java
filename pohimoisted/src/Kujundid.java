public class Kujundid {
    public static void main(String[] args) {
        Kujund ring = new Kujund("Ring");
//       Kujund ruut =new Kujund("Ruut");
//       Kujund kolmnurk =new Kujund("Kolmnurk");

        ring.väljastaKirjeldus();

/* Need read tööle ei lähe, kuna nimetus on privaatne omadus
        ring.nimetus = "Ruut";
        ring.väljastaKirjeldus();*/
        
        ring.setNimetus();
        ring.väljastaKirjeldus();

//        ruut.väljastaKirjeldus();
//        kolmnurk.väljastaKirjeldus();
    }
}
