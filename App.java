import Locations.*;
import Tourists.*;


public class App {
    public static void main(String[] args) throws Exception {

        Locations tagaytay = new tagaytay();
        Locations Boracay = new Boracay();
        Locations LaUnion = new LaUnion();
        Locations Palawan = new Palawan();
        Locations Banaue = new Banaue();
        Locations Vigan = new Vigan();

        Tourist Me = new Me();

        Boracay.accept(Me);
        tagaytay.accept(Me);
        LaUnion.accept(Me);
        Palawan.accept(Me);
        Banaue.accept(Me);
        Vigan.accept(Me);



    }
}