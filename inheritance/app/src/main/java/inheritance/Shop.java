package inheritance;

import java.util.ArrayList;

public class Shop implements canReview {

    private String name;
    private String description;
    private String numOfDollar;
    ArrayList<Review> shopReviews;

    Review r;
    public Shop(String name, String description,String numOfDollar){
        this.name=name;
        this.description=description;
        this.numOfDollar=numOfDollar;
        this.shopReviews= new ArrayList<>();

    }
    public void setReviews(ArrayList<Review> reviews) {
        shopReviews = reviews;
    }

    public ArrayList<Review> getReviews() {
        return shopReviews;
    }
    @Override
    public String addReview(Review review){
      shopReviews.add(review);
        return ("Author : " +   review.getAuthor()  + ", " +
                "Review : " + review.getBody() + ", " +
                "Rate : " + review.getNumOfStarts() + ". ");
    }



    @Override
    public String toString() {
        return ("Welcome To " + name + " shop");
    }
}
