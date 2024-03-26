package professorNelioAlvesJava.exercicios12Arquivos.teorico;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Program {
    public static void main(String[] args) {

        File file = new File("C:\\temp\\teste.txt");
        Scanner sc = null;

        try {
            //aqui estamos instanciando o arquivo
            sc = new Scanner(file);
            //aqui estamos verificando se ainda existe outra linha no arquivo
            while (sc.hasNextLine()) ;
            //aqui estamos mostrando o conteúdo que há na outra linha
            System.out.println(sc.nextLine());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

    }
}
