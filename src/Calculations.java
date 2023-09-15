import java.util.ArrayList;
import java.util.HashMap;

public class Calculations {



    //find average amount of money each person paid
    //the average amount is the amount that every individual should have paid
    public double findAverage(HashMap<String, Double> userData, int numOfPeople, double average){
        for(String names: userData.keySet()){
            average += userData.get(names);
        }
        average /= numOfPeople;
        return Math.round(average*100.0) / 100.0;
    }


    /*
        find the difference between amount paid and the average amount
        John spent $45 | Average = $25
        John overpaid by (45 - 25) $20;
        the rest of the individuals need to pay John back a total of $20
    */

    public void findDifference(HashMap<String, Double> userData, double average){
        for(String names : userData.keySet()){
            userData.put(names, userData.get(names)-average);
        }
    }

    //Move users that underpaid to an arraylist
    //Removes any user that has paid the correct amount
    public void organizeData(HashMap<String, Double> userData, ArrayList<String> underPaid){
        for(String name : userData.keySet()){
            //check if anyone underpaid | if so add their name to an arrayList
            if(userData.get(name) < 0){
                underPaid.add(name);
            }
            //check if anyone paid correct amount
            else if(userData.get(name) == 0){
                System.out.print(name.toUpperCase() + " HAS PAID THE CORRECT AMOUNT\n");
                userData.remove(name);
            }
        }
    }



}
