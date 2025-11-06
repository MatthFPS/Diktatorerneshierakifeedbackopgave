import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Leader> leaders = new ArrayList<>();

        // Create leader objects
        Leader leader1 = new MilitaryDictator("General Bob", "England", 12);
        Leader leader2 = new PoliticalDictator("Senator Palpatine", "Nabu", 5);

        // Add them to the list
        leaders.add(leader1);
        leaders.add(leader2);

        // Looper igennem hver leader og kalder metoderne
        for (Leader leader : leaders) {
            System.out.println("==========================");
            leader.printDetails();
            leader.giveSpeech();

        // Interface(Poweractions) delene af koden
            if (leader instanceof Interface) {
                Interface actions = (Interface) leader;
                actions.holdParade();
                actions.repressOpposition();
                actions.implementPolicy();
                System.out.println("==========================");
                System.out.println();
            }
        }
    }
}
