package inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ShopClassTest {

    @Test void toStringMethodInShopClass(){
        App sut = new App();
        Shop s = new Shop("ZARA", "Zara Brand","000.00$");
        String result=s.toString();

        Assertions.assertEquals("Welcome To ZARA shop", result);

    }

    @Test void addShopReview(){
        App sut =new App();
        ArrayList<Review> shopReview= new ArrayList<>();
        Shop s = new Shop("ZARA", "Zara Brand","000.00$");
        Review r = new Review("haya", "nice",4);

        String result=s.addReview(r);
        Assertions.assertEquals( "Author : " +   "haya"  + ", " +
                "Review : " + "nice" + ", " +
                "Rate : " + "4" + ". ", result);

     }
}
