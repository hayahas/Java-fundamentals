package inheritance;

import java.util.ArrayList;

public class Resturant implements canReview {

    private String resturantName;
    private int starsOutOf5;
    private double priceCategory;

    private ArrayList<Review> resturantReviews;

    public Resturant(String resturantName, int starsOutOf5, double priceCategory) {
        this.resturantName = resturantName;
        this.starsOutOf5 = (int) Math.floor(Math.random() * (5 - 0 + 1) + 0);
        this.priceCategory = priceCategory;
        this.resturantReviews = new ArrayList<>();
    }

    public void setResturantName(String resturantName) {
        this.resturantName = resturantName;
    }

    public void setStarsOutOf5(int starsOutOf5) {
        this.starsOutOf5 = starsOutOf5;
    }

    public void setPriceCategory(double priceCategory) {
        this.priceCategory = priceCategory;
    }

    public String getResturantName() {
        return resturantName;
    }

    public double getPriceCategory() {
        return priceCategory;
    }

    public int getStarsOutOf5() {
        return starsOutOf5;
    }

    public void setReviews(ArrayList<Review> reviews) {
        resturantReviews = reviews;
    }

    public ArrayList<Review> getReviews() {
        return resturantReviews;
    }

    @Override
    public String addReview(Review review) {
        resturantReviews.add(review);
        updateStars();
        return ("Author : " + review.getAuthor() + ", " +
                "Review : " + review.getBody() + ", " +
                "Rate : " + review.getNumOfStarts() + ". ");

    }


    public void updateStars() {
        int totalStars = 0;
        for (Review review : resturantReviews) {
            totalStars += review.getNumOfStarts();
        }
        if (!resturantReviews.isEmpty()) {
            starsOutOf5 = totalStars / resturantReviews.size();
        } else {
            starsOutOf5 = 0;
        }
    }

    @Override
    public String toString() {
        return ("Welcome to " + resturantName + " resturant");
    }
}
