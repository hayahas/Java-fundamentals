package inheritance;

public interface canReview {

     default String addReview(Review review){
         return null;
     }
    default String addReviewWithName(Review review,String name){
        return null;
    }
}
