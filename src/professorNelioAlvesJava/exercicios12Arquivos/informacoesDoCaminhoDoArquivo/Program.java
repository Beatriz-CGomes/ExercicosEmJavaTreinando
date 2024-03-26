package professorNelioAlvesJava.exercicios12Arquivos.informacoesDoCaminhoDoArquivo;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedindo para o usuario entrar com o caminho do arquivo
        System.out.print("Enter a file path: ");
        String strPath = sc.nextLine();

        //instanciando e passando o caminho do arquivo
        File path = new File(strPath);

        //pegando o nome do arquivo
        System.out.println("getName = " + path.getName());

        //pegando o caminho do arquivo
        System.out.println("getParent = " + path.getParent());

        //pegando todo o caminho
        System.out.println("getPath = " + path.getPath());

        sc.close();
    }
}
