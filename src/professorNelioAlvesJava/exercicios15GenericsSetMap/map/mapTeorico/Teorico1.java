package professorNelioAlvesJava.exercicios15GenericsSetMap.map.mapTeorico;

import java.util.Map;
import java.util.TreeMap;

public class Teorico1 {
    public static void main(String[] args) {

        //String de chave - String de valor
        //TreeMap - ordens
        //O String é por ordem alfabetica
        Map<String, String> cookies = new TreeMap<>();

        //put é para adicionar - mesma função do ADD
        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "9997778822");

        //removendo o email - maria@gmail.com
        //estou passando a chave e ele deleta o valor.
        cookies.remove("email");

        //map não aceita repetições e ele vai sobreescrevendo valor com o atual
        cookies.put("phone", "99667711");

        System.out.println("Se no map contem a chave fone " + cookies.containsKey("phone"));

        //pegar o valor de uma chave
        System.out.println("Pegando telefone: " + cookies.get("phone"));

        //pegando um valor que nao existe
        System.out.println("Pegando o email: " + cookies.get("email"));

        //tamanho
        System.out.println("Tamanho " + cookies.size());

        System.out.println("Todos os cookies: ");
        ///assim que percorre um map pelo foreach
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
