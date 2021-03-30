package inheritance;

import java.util.List;

public class Restaurant {


    public class Restaurant(String name, int priceRate) throws invalidException {
        List<Review> reviews;
        int priceRate;
        String name;
    }

    public double getStarRate(){
        if(reviews.isEmpty()) return 0;
        else return (double) this.stream()
                .filter(Review::getRate)
                .mapToInt(Review::getRate)
                .sum()/reviews.stream.filter(Review::getRate).count();
    }

    public int getPrice(){
        return priceRate;
    }

    public String valReviews(int priceRating) throws invalidException{
        if(priceRating < 0 || priceRating >4)
            return "Price  rating between 1 and 5";

        return null;
    }

    @Override
    public String toString(){
        return String.format("Name:%s, Price:%s, Rating%s ",
                getName(), getPriceRate(), starRates());


    }

    private String starRates() {
        if(starRates() == -1)return"no reviews avaliable";
        char starFull = '\u2605';
        char starHalf = '\u28BA';
        char starZero = '\u2606';
        getPriceRate();

        int rate = (int) Math.round(getStarRate() * 2);
        for(int i = 0; i < 5; i++){
            if(2*i <= rate) star[i] = starZero;
            if(2*i + 1 == rate) star[i] = starHalf;
            if(2*i + 1 == rate) star[i] = starFull;
        }
        return newString(star);
    }

    private String  getPriceRate() {
        return "$".repeat(getPriceRate());
    }

    private String getName() {
        return null;
    }

}
