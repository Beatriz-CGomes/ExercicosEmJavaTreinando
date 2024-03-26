package professorNelioAlvesJava.exercicios12Arquivos.FileWriterAndBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {


        //não estamos lendo um arquivo estamos inserindo/escrevendo informações no arquivo


        //um vetor de linhas já com as informações que vamos inserir
        String[] lines = new String[]{"Good Morning", "Good Afternoon", "Good Night"};

        //O caminho onde a informação será inserida
        String path = "C:\\temp\\out.txt";


        //O true no parametro quer dizer que não queremos recriar o arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            //gravando no arquivo as informações do vetor
            //usando o for para escrever linha por linha no arquivo
            for (String line : lines) {
                bw.write(line);

                //isso é uma quebra de linha
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
