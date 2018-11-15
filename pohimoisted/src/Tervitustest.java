public class Tervitustest {
    public static void main(String[] args) {
       Tervitus eloTervitus = new Tervitus("Tere õpilased!") ;
       Tervitus vaikeTervitus = new Tervitus();
       eloTervitus.tervita();
       vaikeTervitus.tervita();
    }
}
