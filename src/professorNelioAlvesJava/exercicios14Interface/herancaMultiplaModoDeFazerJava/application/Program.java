package professorNelioAlvesJava.exercicios14Interface.herancaMultiplaModoDeFazerJava.application;

import professorNelioAlvesJava.exercicios14Interface.herancaMultiplaModoDeFazerJava.devices.ComboDevice;
import professorNelioAlvesJava.exercicios14Interface.herancaMultiplaModoDeFazerJava.devices.ConcretePrinter;
import professorNelioAlvesJava.exercicios14Interface.herancaMultiplaModoDeFazerJava.devices.ConcreteScanner;

public class Program {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
