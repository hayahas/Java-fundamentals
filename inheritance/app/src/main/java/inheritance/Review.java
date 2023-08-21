package inheritance;

public class Review{

   private String body;
    private String author;
    private int numOfStarts;
    Resturant res;

    public Review(String body,String author,int numOfStarts,Resturant res){
        this.body=body;
        this.author=author;
        this.numOfStarts=numOfStarts;
        res.addReview(this);
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumOfStarts(int numOfStarts) {
        this.numOfStarts = numOfStarts;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumOfStarts() {
        return numOfStarts;
    }

    @Override
    public String toString() {
        super.toString();
        return ("Author : " +   author  + ", " +
                "Review : " + body + ", " +
                "Rate : " + numOfStarts + ". "
    );
    }
}
