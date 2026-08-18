package EX2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private ArrayList<Comments> comments = new ArrayList<>();

    public Post (){

    }

    public Post(Date moment, String content, String title, Integer likes) {
        this.moment = moment;
        this.content = content;
        this.title = title;
        this.likes = likes;
    }

    public void addComment(Comments comment){
        comments.add(comment);
    }

    public void romeveComment(Comments comment){
        comments.remove(comment);
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public ArrayList<Comments> getComments() {
        return comments;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments" + "\n");
        for (Comments c : comments){
            sb.append(c.getText() + "\n");

        }

        return sb.toString();
    }
}
