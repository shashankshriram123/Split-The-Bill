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
    public void organizeData(HashMap<String, Double> userData, ArrayList<String> underPaid, ArrayList<String> overPaid){
        for(String name : userData.keySet()){
            //check if anyone underpaid | if so add their name to an arrayList
            if(userData.get(name) < 0){
                underPaid.add(name);
            }
            else if( userData.get(name) > 0){
                overPaid.add(name);
            }
            //check if anyone paid correct amount
            else if(userData.get(name) == 0){
                System.out.print(name.toUpperCase() + " HAS PAID THE CORRECT AMOUNT\n");
                userData.remove(name);
            }

        }
    }

    public void findPayments(HashMap<String, Double> userData, ArrayList<String> underPaid, ArrayList<String> overPaid, double tempAmount){
        int counter = 0;
        //
        //while(userData.values() != 0.0)
        for(String names : underPaid){
            System.out.println(userData);
            System.out.println(names + " OWES " + Math.abs(userData.get(names)));
            String tempstring = overPaid.get(counter);
            //System.out.println(userData.get(overPaid.get(counter)));
            tempAmount =  userData.get(tempstring);
            System.out.println(tempAmount);
            //System.out.println(tempAmount);
            System.out.println("EQUATION  : " + Math.round((userData.get(names)+userData.get(tempstring))*100)/100);
            System.out.println(names + " PAYS " + overPaid.get(counter) + " $"+  (userData.get(names)+userData.get(tempstring)));
            userData.replace(overPaid.get(counter),userData.get(names)+userData.get(tempstring));
            userData.replace(names, userData.get(names) + Math.abs(userData.get(names)));
            //organizeData(userData, underPaid,overPaid);
        }
        System.out.println(userData);
    }
}




