package EX2;

import java.time.Instant;
import java.util.Date;

public class main {
    public static void main() {
        Date date = Date.from(Instant.parse("2018-06-21T13:05:44Z"));
        Post p1 = new Post(date,"i'm goig to visit thsi wonderful cauntry","Treveling to New Zealand",12);
        date =  Date.from(Instant.parse("2018-06-28T13:05:44Z"));
        Post p2 = new Post(date,"See you tomorrow","Good Nigth",5);
        p1.addComment(new Comments("Have a nice trip"));
        p1.addComment(new Comments("Wowww that's awesome!"));
        p2.addComment(new Comments("good nigth"));
        p2.addComment(new Comments("May the force be with you"));

        IO.print(p1.toString());
        System.out.println("---------");
        IO.println(p2.toString());

    }
}
