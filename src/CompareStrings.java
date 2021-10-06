import java.util.Locale;
import java.util.Scanner;

public class CompareStrings {
    public static void main (String[] args){
        Scanner keybd = new Scanner(System.in);
        String answer;

        System.out.println("How is the weather?");
        answer = keybd.nextLine();

        if (answer.equalsIgnoreCase("rain")){
            System.out.println("Take your umbrella!");
        } else if (answer.equalsIgnoreCase("windy")) {
            System.out.println("Wear your jacket!");
        } else if (answer.equalsIgnoreCase("snow")) {
            System.out.println("Wear your jacket!");
        } else if (answer.equalsIgnoreCase("stormy")) {
            System.out.println("You should stay inside");
        } else
            System.out.println("Enjoy your day!");
    }
}
