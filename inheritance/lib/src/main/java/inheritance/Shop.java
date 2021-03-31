package inheritance;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Shop {
    ArrayList<Review> reviews = new ArrayList<>();
    int priceRate;
    String name;
    String description;

    public Shop(String name, String description, int priceRate) {
        this.description = description;
        this.name = name;
        this.priceRate = priceRate();

    }


    public double getPriceRate(){
        if(reviews.isEmpty()) return 0;
        else return (double) this.stream()
                .filter(Review::getRate)
                .mapToInt(Review::getRate)
                .sum()/reviews.stream.filter(Review::getRate).count();
    }
    @Override
    public String toString(){
        return String.format("This shop's: Name:%s, Description%s Price%s", getName(), getDescription(), priceRate());
    }

    private String getName() {
        return this.name;
    }

    private String getDescription() {
        return this.description;
    }

    private int priceRate() {
        return "$".repeat(getPriceRate());
    }

    public Review addReview(Review reviews){
        if(this.reviews.containsAll((Collection<Review>) reviews));
        return reviews;
    }

    Review getReview(BIConversion.User user){
        final Review review = reviews.get(user);
        return review;
    }

}
