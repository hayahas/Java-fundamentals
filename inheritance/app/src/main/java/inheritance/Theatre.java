package inheritance;

import java.util.ArrayList;

public class Theatre implements canReview {

    private String name;
    private ArrayList<String> movieList;
    private ArrayList<Review>theatreReviews;
    public Theatre(String name){
        this.name=name;
        movieList=new ArrayList<>();
        theatreReviews=new ArrayList<>();
    }

    public String addMovie(String movieName){
        if(!movieList.contains(movieName)){
            movieList.add(movieName);
            return (movieName + " movie added to our list.");
        }
        return (movieName + " movie already in our list.");

    }

    public String removeMovie(String movieName){
        if(movieList.contains(movieName)){
            movieList.remove(movieName);
            return (movieName + " movie removed from our list.");
        }
        return (movieName + " movie isn't in our list.");

    }

    @Override
    public String addReview(Review review) {
        theatreReviews.add(review);
        return ("Author : " +   review.getAuthor()  + ", " +
                "Review : " + review.getBody() + ", " +
                "Rate : " + review.getNumOfStarts() + ". ");
    }

    @Override
    public String addReviewWithName(Review review,String name) {
        theatreReviews.add(review);
        return ("MovieName : " +   review.getmovieName()  + ", " +
                "Author : " +   review.getAuthor()  + ", " +
                "Review : " + review.getBody() + ", " +
                "Rate : " + review.getNumOfStarts() + ". ");
    }
//    public void updateStars() {
//        int totalStars = 0;
//        for (Review review : theatreReviews) {
//            totalStars += review.getNumOfStarts();
//        }
//        if (!theatreReviews.isEmpty()) {
//            review.getNumOfStarts()  = totalStars / theatreReviews.size();
//        } else {
//            review.getNumOfStarts()  = 0;
//        }
//    }
    @Override
    public String toString() {
        return ("Welcome to " + name + " Theatre");
    }
}
