package professorNelioAlvesExercicios.teoria1boxingAndUnboxing;

public class BoxingAndUnboxing {
    public static void main(String[] args) {

        //BOXING
        //tipo primitivo int
        int x = 20;

        //Um objeto recebendo um tipo primitivo
        Object obj = x;
        System.out.println(obj);


        //UNBOXING
        //tipo primitivo recebendo um objeto para poder dar certo é necessário usar o casting
        int y = (int) obj;
        System.out.println(y);

        //WRAPPER CLASSES
        // para poder rodar com wrapper classes
        Integer obj2 = x;
        int y2 = obj2 * 2;
        System.out.println(y2);

        System.out.println();


    }
}
