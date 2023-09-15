import java.util.ArrayList;
import java.util.HashMap;

public class SetParameters {
    private int numberOfPeople;
    private HashMap<String, Double> userData = new HashMap<>();
    private ArrayList<String> nameCollection = new ArrayList<>();
    private ArrayList<String> underPaid = new ArrayList<>();


    public void setNumberOfPeople(int numberOfPeople){
        this.numberOfPeople = numberOfPeople;
    }
    public int getNumberOfPeople(){
        return this.numberOfPeople;
    }

    public void setUserData(String names, double total){
        userData.put(names, total);
    }
    public HashMap<String, Double> getUserData(){
        return userData;
    }

    public void setNameCollection(String names){
        nameCollection.add(names);
    }
    public ArrayList<String> getNameCollection(){
        return nameCollection;
    }
    public ArrayList<String> getUnderPaid(){
        return underPaid;
    }
    public void setUnderPaid(String name){
        underPaid.add(name);
    }

}
