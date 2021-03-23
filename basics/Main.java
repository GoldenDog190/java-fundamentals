import java.util.*;
// import java.util.time.LocalDateTime;
// import java.time.*;

public class Main {
  public static void main(String[] args) {
    System.out.println(pluralize(2, "cat"));
    // System.out.println(flipNHeads(1));
    // System.out.println(clock());
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
   
    public static void flipNHeads (int n, String flip) {
    // set a float between 0 and 1 
    // greater or lesser than .5
    // Used this as an example code: https://www.roseindia.net/tutorial/java/core/coinFlip.html#:~:text=Java%20Coin%20Flip%20Coin%20Flipping%20is%20basically%20a,we%20are%20going%20to%20toss%20a%20coin%20programmatically 
     
         int heads = 0;
         int tails = 0;
        //  int n = Math.random() * 2;

      while (true){
        String message = "It took"+ n + "flips to flip N heads in a row" ;
        System.out.println(message);

       break;
      }

      //if statement 
      if (n > 0.5) {
        flip = "heads";
        // head++; 
      } else if (n < 0.4) {
        flip = "tails";
        // return flip;
        // tails++; 
      }
    }


    //  public static int clock(){
    //     Time time = new Time();
    //     LocalDateTime dateTime = LocalDateTime.now();
    // int clockTime = dateTime.getTimeValue();
    // String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    

        // if(time == 12){
        //  return true;
        // }
        //  return false;
        
     //}


    }
