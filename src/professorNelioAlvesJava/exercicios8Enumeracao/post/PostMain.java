package professorNelioAlvesJava.exercicios8Enumeracao.post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PostMain {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("DD/mm/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow thats awesome!");

        Post p1 = new Post(sdf.parse("07/03/2024 19:33:44"), "Traveling to New Zeland ",
                "I'm going to visit this woderful country", 12);

        p1.addComment(c1);
        p1.addComment(c2);
        System.out.println();
        System.out.println(p1);
        System.out.println((c1));
        System.out.println((c2));


        System.out.println("************************************");
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");

        Post p2 = new Post(sdf.parse("08/03/2024 20:39: 52"), "Good night guys", "See you tomorrow", 5);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println();
        System.out.println(p2);
        System.out.println(c3);
        System.out.println(c4);

        sc.close();
    }
}
