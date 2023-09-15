import java.util.HashMap;

public class Calculations {




    public double findAverage(HashMap<String, Double> userData, int numOfPeople, double average){
        for(String names: userData.keySet()){
            average += userData.get(names);
        }
        average /= numOfPeople;
        return Math.round(average*100.0) / 100.0;
    }


    public void findDifference(HashMap<String, Double> userData, double average){
        for(String names : userData.keySet()){
            userData.put(names, userData.get(names)-average);
        }
    }



}
