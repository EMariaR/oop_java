public class Tervitustest {
    public static void main(String[] args) {
       Tervitus eloTervitus = new Tervitus() ;
       Tervitus vaikneTervitus = new Tervitus();
       eloTervitus.tervitusTekst = new Tervitus ("Tere õpilased!");
       eloTervitus.tervita();
       vaikneTervitus.tervita();
    }
}
