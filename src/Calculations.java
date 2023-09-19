import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Calculations {



    //find average amount of money each person paid
    //the average amount is the amount that every individual should have paid
    public double findAverage(HashMap<String, Double> userData, int numOfPeople, double average){
        for(String names: userData.keySet()){
            average += userData.get(names);
        }
        average /= numOfPeople;
        return Math.round(average);
    }


    /*
        find the difference between amount paid and the average amount
        John spent $45 | Average = $25
        John overpaid by (45 - 25) $20;
        the rest of the individuals need to pay John back a total of $20
    */

    public void findDifference(HashMap<String, Double> userData, double average){
        double temp = 0;
        for(String names : userData.keySet()){
            temp = userData.get(names)-average;
            userData.put(names, temp);
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

    public void roundNumbers(HashMap<String, Double> userData){
        for(String names : userData.keySet()){
            userData.replace(names, userData.get(names), (double)Math.round(userData.get(names)));
        }
    }

    public void findPayments(HashMap<String, Double> userData, ArrayList<String> underPaid, ArrayList<String> overPaid, double tempAmount) {
        int counter = 0;
        double payAmt = 0;
        double value;
        String key = null;
            for (String names : userData.keySet()) {

                System.out.println(userData);
                System.out.println(names + " OWES " + Math.abs(userData.get(names)));


                //System.out.println(userData.get(overPaid.get(counter)) + " OVERPAID"); // tempAmount
                //System.out.println(userData.get(underPaid.get(counter)) + " UNDERPAID");

                String tempstring = overPaid.get(counter);
                tempAmount = userData.get(tempstring);

                if (-1 * (userData.get(names)) < userData.get(overPaid.get(counter))){payAmt = userData.get(names);}
                else{ payAmt = userData.get(overPaid.get(counter));}


                System.out.println(names + " PAY " + tempstring + " $" + -1 * payAmt);
                userData.replace(names, userData.get(names) + -1 * payAmt);
                value = userData.get(overPaid.get(counter));

                for (Map.Entry<String, Double> entry : userData.entrySet())
                    {if (value == (entry.getValue())) {key = entry.getKey();}}
                userData.replace(key, userData.get(overPaid.get(counter)) - (-1 * payAmt));




            }
            System.out.println(userData);

        }

    public void findLastPayment(HashMap<String, Double> userData, ArrayList<String> underPaid, ArrayList<String> overPaid){
        System.out.println(underPaid);
        System.out.println(overPaid);
       // System.out.println(underPayUser + " UNDERPAY");
        //System.out.println(overPayUser + " OVRPAY");

/*
        System.out.println(underPayUser + " PAY " + overPayUser + " $" + userData.get(overPayUser));
        userData.replace(underPayUser, userData.get(underPayUser) + userData.get(overPayUser));
        //System.out.println(userData.get(overPayUser) + "  + " + userData.get(underPayUser));
        userData.replace(overPayUser, userData.get(overPayUser),  userData.get(overPayUser) + userData.get(underPayUser));
        System.out.println(userData);*/
    }

}




