package inheritance;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TheaterTest {
    @Test
    public void theaterTest(){
        Theater theater = new Theater("Popcorn Cinema","My Neighbor Totoro", 5);
        System.out.println(theater.toString());
        String name = "Popcorn Cinema" ;
        assertEquals("get theater name", name, theater.toString());
    }

    @Test
    public void getAverageRate(){
        Shop rate = new Shop("Popcorn Cinema", 1);
        rate.addReview(new Review("review", 5));
        rate.addReview(new Review("review", 3));
        rate.addReview(new Review("review", 0));
        assertEquals("average star review rating", 5, rate.reviews.toString());
    }

    @Test
    public void toStringShop(){
        Shop rate = new Shop("Popcorn Cinema", 1);
        rate.addReview(new Review("", 5));
        assertEquals("Name: Popcorn Cinema, Price:$$, Rating no reviews", 5, rate.toString());
    }


}
