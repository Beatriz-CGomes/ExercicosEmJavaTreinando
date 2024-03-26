package professorNelioAlvesJava.exercicios12Arquivos.blocoTryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Program {
    public static void main(String[] args) {

        //criando o caminho do arquivo
        String path = "C:\\temp\\teste.txt";
        FileReader fr = null;
        BufferedReader br = null;


        try {

            //poderia escrever toda essa linha abaixo assim
            //br = new BufferedReader(new FileReader(path));

            //instanciando o arquivo
            fr = new FileReader(path);

            //O Buffered trabalha com o filereader
            br = new BufferedReader(fr);

            //ler uma linha do arquivo
            String line = br.readLine();

            //aqui estamos fazendo o fflxo de repetição enquanto a linha do arquivo for diferente de nulo
            //ele vai ler a linda do arquivo e mostrar ela e ler o conteúdo da proxima linha até ser nulo
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }

                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
