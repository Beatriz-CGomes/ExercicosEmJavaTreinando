package professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.curingasDelimitados.application;

import professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.curingasDelimitados.entities.CirculoCuringD;
import professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.curingasDelimitados.entities.FormaCuringaDelimitado;
import professorNelioAlvesJava.exercicios15GenericsSetMap.genericsPacote.curingasDelimitados.entities.RetanguloCuringD;

import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        List<FormaCuringaDelimitado> minhaFormula = new ArrayList<>();
        minhaFormula.add(new RetanguloCuringD(3.0, 4.0));
        minhaFormula.add(new CirculoCuringD(3.0));

        System.out.println(minhaFormula);
        System.out.println("Total Area " + totalArea(minhaFormula));
    }


    public static double totalArea(List<FormaCuringaDelimitado> list) {
        double soma = 0.0;
        for (FormaCuringaDelimitado forma : list) {
            soma += forma.area();
        }

        return soma;
    }
}
