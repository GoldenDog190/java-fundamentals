import java.util.*;
import java.time.LocalDateTime;
// import java.util.time.*;

public class Main {
  public static void main(String[] args) {
    System.out.println(pluralize(2, "cat"));
    // flipNHeads(1);
    clock();
  }
    public static String pluralize (int catCount, String word){
     
     if (catCount == 2){
      String pluralWord = "I own" + " " + catCount + " " + word + "s" + ".";
      return pluralWord;
     } else if (catCount == 1){
      return word;
     }
     return "";
    }
   
    public static void flipNHeads (int n) {
    // set a float between 0 and 1 
    // greater or lesser than .5
    // Used this as an example code: https://www.roseindia.net/tutorial/java/core/coinFlip.html#:~:text=Java%20Coin%20Flip%20Coin%20Flipping%20is%20basically%20a,we%20are%20going%20to%20toss%20a%20coin%20programmatically & https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        Random rand = new Random();
         int flip = 0;
         int tails = 0;

      while (n > tails){
        //if statement 
      if (n > 0.5) {
        flip = "heads";
        // head++; 
      } else if (n < 0.4) {
        flip = "tails";
        // return flip;
        // tails++; 
      }
        String message = "It took"+ n + "flips to flip N heads in a row" ;
        System.out.println(message);

       break;
      }

      
    }


     public static void clock(){
        int oldSecond = 9999;
        while(true){
        LocalDateTime dateTime = LocalDateTime.now();
     int hour = now.getHour();
     int minute = now.getMinute();
     int second = now.getSecond();

        if(second !== oldSecond){
         Sysytem.out.printf(hour + ":" + minute + ":" + second);
         oldSecond = second;
        }
      }
        
     }


    }
