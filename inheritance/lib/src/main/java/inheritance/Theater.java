package inheritance;

import com.sun.deploy.net.MessageHeader;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Theater implements ReviewAble{


    public static Movies movies;
    String name;
    String movies;
    List<Review> reviews = new ArrayList<>();
    int priceRate;

    public Theater(String name, String movies, int priceRate){
        this.name = name;
        this.movies = movies;
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
        return String.format("This theater's Name: Name%, Movies%s, Price:%s, Rating%s",
                getName(),  reviewMovie(), getPriceRate(), starRates());
    }

    private String getName() {
        return this.name;
    }


    public String validatePrice(int priceRating){
        if(priceRating < 0 || priceRating >4)
            return "Price rating between 1 and 5";

        return null;
    }

    private String  getPriceRate() {
        return "$".repeat(getPriceRate());
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


    public Review addReview(Review reviews){
        if(this.reviews.containsAll((Collection<Review>) reviews));
        return reviews;
    }

    Review getReview(BIConversion.User user){
        final Review review = reviews.get(user);
        return review;
    }

    public void addMovie(Theater movie){
        if(this.movies.add(movies));
        this.movies.put(movies);

    }
    public void removeMovie(Theater movies){
     if(this.movies.delete(movies));
     this.movies.delete(movies);
    }

    @Override
    public Object reviewMovie(ReviewAble movies) {
        this.movies = movies;
        Theater.movies.add(this.movies);
        System.out.println("movie reviews");
        return String.format("Movie name:%s, Review%s");
    }


}
