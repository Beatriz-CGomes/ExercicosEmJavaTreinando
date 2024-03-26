package professorNelioAlvesJava.exercicios12Arquivos.manipulandoPastasComFile;

import java.util.Scanner;
import java.io.File;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder a path: ");
        String strPath = sc.nextLine();

        //file pode ser tanto o caminho de um arquivo como o de uma pasta
        File path = new File(strPath);

        //pegar todas as pastas que estão no caminho
        //um vetor de files
        //podemos colocar na função com argumento de outra função
        File[] folders = path.listFiles(File::isDirectory);

        //aqui estamos mostrando na tela todas as pastas que estão que tem no caminho digitado pelo usuario
        //para cada arquivo da pasta folder de folders mostrar as pastas que estão no arquivo
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }


        //agora queremos apenas os arquivos e não as pastas - fazendo um vetor de arquivos
        System.out.println();
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);
        }


        //agora estamos criando uma subpasta na pasta do arquivo digitado pelo usuario
        System.out.println();
        //essa linha cria uma subpasta - colocando o caminho + o nome da subpasta
        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Diretorio criado com  sucesso " + sucess);

    }
}
