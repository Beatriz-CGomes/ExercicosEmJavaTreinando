package professorNelioAlvesJava.exercicios11Excecoes.estruturaFinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //aqui estamos instanciando um arquivo file com o caminho
        File file = new File("C:\\tem\\in.txt");
        Scanner sc = null; //declando um arquivo

        //aqui é para encontrar o arquivo e percorrer o while
        try {
            //aqui usando o scanner para ler o arquivo
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            //caso o caminho do arquivo não for encontrado cai no catch mostrando a msg do erro
        } catch (FileNotFoundException e) {
            System.out.println("Erros opening file: " + e.getMessage());
        }
        // independente do arquivo ter sido encontrado ou não temos que fechar o arquivo por isso usamos o finally
        finally {
            if (sc != null) {
                sc.close();
            }

            System.out.println("Finally block executed");
        }
    }
}
