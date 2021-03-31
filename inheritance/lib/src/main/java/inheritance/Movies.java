package inheritance;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Movies implements ReviewAble{
    int stars;
    String name;
    String movies;
    List<Review> reviews = new ArrayList<>();

    public Movies(String name, String movies, List<Review>reviews) {
        this.name = name;
        this.movies = movies;
        this.reviews = reviews;
        this.stars =stars;
    }

    public double getStarRate(){
        if(reviews.isEmpty()) return 0;
        else return (double) this.stream()
                .filter(Review::getRate)
                .mapToInt(Review::getRate)
                .sum()/reviews.stream.filter(Review::getRate).count();
    }

    private int starRates() {
        if(starRates() == -1)return Integer.parseInt("no reviews avaliable");
        char starFull = '\u2605';
        char starHalf = '\u28BA';
        char starZero = '\u2606';


        int rate = (int) Math.round(getStarRate() * 2);
        for(int i = 0; i < 5; i++){
            if(2*i <= rate) stars[i] = starZero;
            if(2*i + 1 == rate) stars[i] = starHalf;
            if(2*i + 1 == rate) stars[i] = starFull;
        }
        int stars = this.stars;
        return stars;
    }

    @Override
    public Object reviewMovie() {
        return null;
    }

    @Override
    public void put(ReviewAble movies) {
        Theater.movies.add(this.stars);
    }

    @Override
    public boolean add(ReviewAble movies) {
        return false;
    }

    @Override
    public boolean delete(ReviewAble movies) {
        return false;
    }
    @Override
    public String toString(){
        return String.format("This theater's Name: Name%, Movies%s, Price:%s, Rating%s",
                getName(),  reviewMovie(), starRates());
    }

    private String getName() {
        this.name =name;
    }

    public Review addReview(Review reviews){
        if(this.reviews.containsAll((Collection<Review>) reviews));
        return reviews;
    }

    Review getReview(BIConversion.User user){
        final Review review = reviews.get(reviews);
        return review;
    }
}
