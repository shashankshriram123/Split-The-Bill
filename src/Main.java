import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        SetParameters table = new SetParameters();
        GetInformation info = new GetInformation();
        Calculations calculate = new Calculations();


        table.setNumberOfPeople(info.numberOfPeople(userInput,0));
        info.collectNames(table.getNumberOfPeople(), userInput, table.getNameCollection());
        info.transferData(table.getNameCollection(), table.getUserData(), userInput);
        double averageValue = calculate.findAverage(table.getUserData(), table.getNumberOfPeople(), 0);
        System.out.println("AVERAGE : " + averageValue);
        calculate.findDifference(table.getUserData(),averageValue);
        calculate.roundNumbers(table.getUserData());
        calculate.organizeData(table.getUserData(),table.getUnderPaid(), table.getOverPaid());
        calculate.findPayments(table.getUserData(), table.getUnderPaid(), table.getOverPaid(),0);
        info.clearData(table.getUnderPaid(),table.getOverPaid());
    }




    public static void printFooter(){
        System.out.println("=================");
    }
}