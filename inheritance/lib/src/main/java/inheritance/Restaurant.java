package inheritance;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.Collection;
import java.util.List;

public class Restaurant {
    List<Review> reviews;
    int priceRate;
    String name;


    public Restaurant(String name, int priceRate, List<Review> reviews) {

        this.name = name;
        this.priceRate = priceRate();
        this.reviews = reviews;

    }

    public double getStarRate(){
        if(reviews.isEmpty()) return 0;
        else return (double) this.stream()
                .filter(Review::getRate)
                .mapToInt(Review::getRate)
                .sum()/reviews.stream.filter(Review::getRate).count();
    }



    @Override
    public String toString(){
        return String.format("Name:%s, Price:%s, Rating%s ",
                getName(), getPriceRate(), starRates());


    }

    public String validatePrice(int priceRating){
        if(priceRating < 0 || priceRating >4)
            return "Price rating between 1 and 5";

        return null;
    }



    private int starRates() {
        if(starRates() == -1)return Integer.parseInt("no reviews avaliable");
        char starFull = '\u2605';
        char starHalf = '\u28BA';
        char starZero = '\u2606';
        getPriceRate();

        int rate = (int) Math.round(getStarRate() * 2);
        for(int i = 0; i < 5; i++){
            if(2*i <= rate) rate[i] = starZero;
            if(2*i + 1 == rate) rate[i] = starHalf;
            if(2*i + 1 == rate) rate[i] = starFull;
        }
        return rate;
    }


    private String  getPriceRate() {
        return "$".repeat(getPriceRate());
    }

    private String getName() {
        return name;
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
