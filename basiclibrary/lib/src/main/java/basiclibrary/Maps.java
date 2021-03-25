package basiclibrary;

import java.util.HashMap;

import static java.util.stream.Nodes.flatten;

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
            if(!tally.containsKey(temp)) tally.put(temp, tally.get(temp) + 1);
            else tally.put(temp, 1);

        }
        String result = String.format("High: %d\n Low: %d\n", min, max);
        for(int i = min; i <= max; i++) {
            if(!tally.containsKey(i)) result += String.format("Can't see temperature: %d\n", 1);
        }
        System.out.println(result);
        return result;

    }

    public static String tally(String[] votes){
      HashMap<String> vote = new HashMap<>();

        votes.add("Bush",0);
        votes.add("Bush", 0);
        votes.add("Bush", 0);
        votes.add("Shrub", 0);
        votes.add("Hedge", 0);
        votes.add("Shrub", 0);
        votes.add("Bush", 0);
        votes.add("Hedge", 0);
        votes.add("Bush", 0);

        while(){
            String winner = tally(vote);
            System.out.println(winner + " received the most votes!");
        }

    }

}
