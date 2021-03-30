package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RestaurantTest {
    @Test
    public void throwBadRating(){
        assertThrows("when there is a bad rating",
                invalidException.class,
                () = > new Restaurant("Amelia's Restaurant", 0)
    }

    @Test
    public void goodRate()throws invalidException{
        new Restaurant("Amelia's Restaurant", 1);
    }

    @Test
    public void getName()throws invalidException{
        String name = "Amelia's Restaurant";
        Restaurant rate = new Restaurant("name:", 1);
        assertEquals("get retsurant name", name, rate.getName());

    }

    @Test
    public void getAverageRate()throws invalidException{
        Restaurant rate = new Restaurant("Amelia's Restaurant", 1);
        rate.addReview(new Review("review", 5));
        rate.addReview(new Review("review", 3));
        rate.addReview(new Review("review", 0));
        assertEquals("average star review rating", 5, rate.reviews.toString());
    }

    @Test
    public void toStringRestaurant()throws invalidException{
        Restaurant rate = new Restaurant("Amelia's Restaurant", 1);
        rate.addReview(new Review("", 5));
        assertEquals("Name: Amelia's Restuarant, Price:$$, Rating no reviews", 5, rate.toString());
    }
}
