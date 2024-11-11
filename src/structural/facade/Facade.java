package structural.facade;

import structural.facade.complex.UtilA;
import structural.facade.complex.UtilB;
import structural.facade.complex.UtilC;

public class Facade {
    public void execute(String data) {
        System.out.println("Facade: "+data);
        UtilA utilA = new UtilA();
        utilA.print();
        UtilB utilB = new UtilB();
        utilB.print();
        UtilC utilC = new UtilC();
        utilC.print();
    }
}
