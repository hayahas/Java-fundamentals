package inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TheatreClassTest {
    @Test
    void toStringMethodInTheatreClass(){
        App sut = new App();
        Theatre t = new Theatre("roman");
        String result=t.toString();

        Assertions.assertEquals("Welcome to roman Theatre", result);

    }

    @Test
    void addMovietoMovieList(){
        App sut =new App();
        Theatre t = new Theatre("roman");
        String result= t.addMovie("titanic");

        Assertions.assertEquals( "titanic movie added to our list.", result);
       // Assertions.assertEquals( "titanic movie already in our list.", result);

    }
    @Test
    void removeMovietoMovieList(){
        App sut =new App();
        Theatre t = new Theatre("roman");
        String result= t.removeMovie("titanic");

        Assertions.assertEquals( "titanic movie isn't in our list.", result);
        //Assertions.assertEquals( "titanic movie removed from our list.", result);

    }

    @Test void addTheatreReview(){
        App sut =new App();
        ArrayList<Review> shopReview= new ArrayList<>();
        Theatre t = new Theatre("roman");
        Review r = new Review("haya", "graet show",3);

        String result=t.addReview(r);
        Assertions.assertEquals( "Author : " +   "haya"  + ", " +
                "Review : " + "graet show" + ", " +
                "Rate : " + "3" + ". ", result);

    }
    @Test void addTheatreReviewOfMovieName(){
        App sut =new App();
        ArrayList<Review> shopReview= new ArrayList<>();
        Theatre t = new Theatre("roman");
        Review r = new Review("graet show","haya", 3,"titanic");

        String result=t.addReviewWithName(r,"titanic");
        Assertions.assertEquals( "MovieName : " +   "titanic"  + ", " +
                "Author : " +   "haya"  + ", " +
                "Review : " + "graet show" + ", " +
                "Rate : " + "3" + ". ", result);

    }
}
