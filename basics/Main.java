import java.util.*;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    System.out.println(pluralize(2, "cat"));
    System.out.println(flipNHeads(1));
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

      // while (true){
      // int heads = 0.5;
      // int tails = 0.4;
      // int n = 1;
      // // String message = "It took"+ n + "flips to flip N heads in a row";
     

      // break;
      // }
      //if statement
      if (Math.random() < 0.5) {
        System.out.println("heads");
      } else {
        System.out.println("It took"+ n + "flips to flip N heads in a row");
      }
      return;

     public static int clock(){
    //  LocalDateTime now = LocalDateTime.now();
    //  int hour = now.getHour();
    //  int minute = now.getMinute();
    //  int second = now.getSecond();
    // String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"))

     }


    }
   

}