package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    @Test
    public void shopTest(){
        Shop shop = new Shop("Cat Paws Shop", "cat shop", 10;
        System.out.println(shop.toString());
        String name = "Cat Paws Shop";
        assertEquals("get shop name", name, shop.toString());
    }

    @Test
    public void getAverageRate(){
        Shop rate = new Shop("Cat Paws Shop", 1);
        rate.addReview(new Review("review", 5));
        rate.addReview(new Review("review", 3));
        rate.addReview(new Review("review", 0));
        assertEquals("average star review rating", 5, rate.reviews.toString());
    }

    @Test
    public void toStringShop(){
        Shop rate = new Shop("Cat Paws Shop", 1);
        rate.addReview(new Review("", 5));
        assertEquals("Name: Cat Paws Shop, Price:$$, Rating no reviews", 5, rate.toString());
    }
}
}
