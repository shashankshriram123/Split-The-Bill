import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GetInformation {


    //collect names and add to ArrayList
    public int numberOfPeople(Scanner userInput, int numberOfPeople){
        System.out.print("HOW MANY PEOPLE: ");
        numberOfPeople = userInput.nextInt();
        userInput.nextLine();
        return numberOfPeople;
    }

    public void collectNames(int numberOfPeople, Scanner userInput, ArrayList<String> names){
        for(int i = 0; i < numberOfPeople; i++){
            System.out.print("USER " + (i+1) +" : ");
            names.add(userInput.nextLine());
        }
    }
    public void transferData(ArrayList<String> names, HashMap<String, Double> userData, Scanner userInput){
        for(String name: names){
            System.out.print(name + " SPENT : $");
            userData.put(name, userInput.nextDouble());
        }
    }
}
