package quotes;


public class APIQuotes {
    private String quoteText;
    private String quoteAuthor;
    private String quoteLink;

    public APIQuotes() {
    }

    public String getQuoteText() {
        return quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public String getQuoteLink() {
        return quoteLink;
    }

    @Override
    public String toString() {
        return "API_Quotes{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                ", quoteLink='" + quoteLink + '\'' +
                '}';
    }
}
