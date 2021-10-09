package quotes;

import java.util.ArrayList;

public class Quotes {
    private ArrayList<String> tags;
    private String author;
    private String likes;
    private String text;

    public Quotes(ArrayList<String> tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public Quotes(String quoteAuthor, String quoteText) {
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Quotes{" +
//                "tags=" + tags +
//                ", author='" + author + '\'' +
//                ", likes='" + likes + '\'' +
//                ", text='" + text + '\'' +
//                '}';
//    }
}
