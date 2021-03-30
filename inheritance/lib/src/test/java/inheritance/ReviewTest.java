package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ReviewTest {
    
 @Test
    public void badInput (){
     assertThrows("Review constructor throws for no stars",
             invalidException.class, () => new Review("name", 10));
 }
    @Test
    public void getRate() throws invalidException {
     assertEquals("get rating", 5, new Review("name", 5));
    }

    @Test
    public void updateRate()throws invalidException{
     Review rate = new Review ("Not very good", 6);
     assertThrows("Review has a bad number of stars", invalidException.class, rate.updateRate(3));
    }

    @Test
    public void validateRate()throws invalidException{
     Review rate = new Review("Very poor", 1);
     rate.updateRate(2);
     assertEquals("updated rating", 6, new Review("name", 2));
    }

}
