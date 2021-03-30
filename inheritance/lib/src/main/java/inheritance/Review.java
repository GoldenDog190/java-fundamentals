package inheritance;

public class Review {
    int rate;
    String text;

    public Review(String text){
        this.text =text;
        validateRate(rate);
        this.rate = rate;
    }
    public int getRate(){
        return rate;
    }

    public int updateRate(int rate) {
        validateRate(rate);
        this.rate = rate;
    }

    public String validateRate(int number) {
        if(number < 0 || number > 5) return "Rating is between 0 and 5";
    }

    public boolean rating() {
        return rate != -1;
    }
}