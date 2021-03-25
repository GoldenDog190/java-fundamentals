package basiclibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.apache.commons.math3.exception.util.ArgUtils.flatten;


public class Maps {
    public static String weatherData (int[][]temperatureArr) throws Exception {
        int[] temperature = flatten(temperatureArr);
        if(temperature.length == 0) throw new Exception("Array can't be empty");
        int min = temperature[0];
        int max = temperature[0];
        Maps<Integer, Integer> tally = new HashMap();
        for(int temp : temperature) {
            if(min>temp) min = temp;
            if(max<temp) max = temp;
            if(!tally.key(temp)) tally.put(temp, tally.get(temp) + 1);
            else tally.put(temp, 1);

        }
        String result = String.format("High: %d\n Low: %d\n", min, max);
        for(int i = min; i <= max; i++) {
            if(!tally.key(i)) result += String.format("Can't see temperature: %d\n", 1);
        }
        System.out.println(result);
        return result;

    }

    public static Set<String> getVote(ArrayList<String> votes){
        Set<String> votedNames = new HashSet<>();
        votedNames.addAll(votes);
        return votedNames;
    }

    public static void countTally(String[] votes){
        Set<String> votedNames = getVote();
        HashMap<String, Integer> voteTally = new HashMap<>();
        for(String voteTally: votedNames) {
            System.out.println(voteTally);

            voteTally.add("Bush",0);
            voteTally.add("Bush",0);
            voteTally.add("Bush",0);
            voteTally.add("Shrub",0);
            voteTally.add("Hedge",0);
            voteTally.add("Shrub",0);
            voteTally.add("Bush",0);
            voteTally.add("Hedge",0);
            voteTally.add("Bush",0);
        }

        for(String voteTally: votes){
            int currentVotes = voteTally.get(voteTally);
            currentVotes++;
            voteTally.put(voteTally, currentVotes);
        }

        return voteTally;
      }



    }

}
