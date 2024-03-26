package professorNelioAlvesJava.exercicios12Arquivos.exercicioModulo.application;

import professorNelioAlvesJava.exercicios12Arquivos.exercicioModulo.entities.Produto;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        //criando uma lista para armazenar os produtos
        List<Produto> list = new ArrayList<>();

        //pedindo para o usuario entrar com o caminho da pasta
        System.out.print("Entre com o caminho: ");
        String caminho = sc.nextLine();

        //criando o objeto do caminho com o arquivo
        File file = new File(caminho);
        //getParent pega o caminho do arquivo e desconsidera o nome do arquivo
        String caminhoOrigem = file.getParent();
        // System.out.println(caminhoOrigem);

        //criando uma subpasta chamada out
        boolean sucesso = new File(caminhoOrigem + "\\out").mkdir();
        //System.out.println("Subpasta criada com sucesso " + sucesso);


        //criando o arquivo dentro da pasta
        String summarytxt = caminhoOrigem + "\\out\\summary.csv";

        //lendo de forma mais rapida a pasta com o caminho
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String itens = br.readLine();


            //lendo e mostrando na tela linha por linha que tem dentro do arquivo
            while (itens != null) {

                //split é para separar o conteudo do arquivo por virgula/espaço
                String[] pastas = itens.split(",");

                //estamos intanciando um objeto do tipo produto
                String nome = pastas[0];
                double preco = Double.parseDouble(pastas[1]);
                int quantidade = Integer.parseInt(pastas[2]);

                //adicioando e criando o nosso produto na lista
                list.add(new Produto(nome, preco, quantidade));

                //lendo todas as linhas do arquivo até que seja nulo
                itens = br.readLine();
            }

            //queremos pegar os dados do arquivo passado pelo usuario e criar um outro arquivo dentro da nossa subpasta
            //aqui estamos escrevendo dentro do arquivo que queremos criar dentro da nossa subpasta
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {

                for (Produto produto : list) {
                    bw.write(produto.getNome() + ", " + String.format("%.2f", produto.total()));
                    //para quebra de linha
                    bw.newLine();
                }

                System.out.println(caminho + " Criado com sucesso");

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Erro ao escrever a mensagem: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }
}
