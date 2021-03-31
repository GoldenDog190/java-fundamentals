package inheritance;


import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class MovieTest {
    @Test
    public void moviesTest(){
        Movies movie = new Movies("My Neighbor Totoro", 1);
        System.out.println(movie.toString());
        String name = "My Neighbor Totoro" ;
        assertEquals("get theater name", name, movie.toString());
    }

    @Test
    public void getAverageRate(){
        Movies rate = new Movies("My Neighbor Totoro", 1);
        rate.addReview(new Review("review", 5));
        rate.addReview(new Review("review", 3));
        rate.addReview(new Review("review", 0));
        assertEquals("average star review rating", 5, rate.reviews.toString());
    }

    @Test
    public void toStringMovie(){
        Shop rate = new Movies("My Neighbor Totoro", 1);
        rate.addReview(new Review("", 5));
        assertEquals("Name: My Neighbor Totoro, Rating no reviews", 5, rate.toString());
    }

}
