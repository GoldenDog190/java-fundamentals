package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapsTest {
    @Test
    public void findTemp(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String expected  = "High: 72\n" + "Low: 51\n" +
                "Never seen temp: 63\n" +
                "Never seen temp: 67\n" +
                "Never seen temp: 68\n" +
                "Never seen temp: 69";
        String result = MapsTest.weatherData(weeklyMonthTemperatures);
        assertEquals("return string that comes up the right numbers", expected, result);
    }

    public void tallyTest(){

    }

}
