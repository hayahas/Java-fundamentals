package inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResturantReviewTest {

    @Test void toStringMethodInResturantClass(){
        App sut = new App();
        Resturant r = new Resturant("mac", 3,10.00);
        String result=r.toString();

        Assertions.assertEquals("Welcome to mac resturant", result);

    }

    @Test void addResturantReview(){
        App sut =new App();
        ArrayList<Review> shopReview= new ArrayList<>();
        Resturant res = new Resturant("mac", 3,10.00);
        Review r = new Review("haya", "yummy",3);

        String result=res.addReview(r);
        Assertions.assertEquals( "Author : haya, " +
                "Review : " + "yummy" + ", " +
                "Rate : " + "3" + ". ", result);

    }

    @Test
    public void testUpdateStarsWithReviews() {
        Resturant res = new Resturant("Test Restaurant", 0, 10.0);


        Review r = new Review("Great place!", "Alice", 4);


        res.addReview(r);
        res.updateStars();
        assertEquals(4, res.getStarsOutOf5());
    }




}
