import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Leader> leaders = new ArrayList<>();

        // Leader Objekter
        Leader leader1 = new MilitaryDictator("General Bob", "England", 12);
        Leader leader2 = new PoliticalDictator("Senator Palpatine", "Nabu", 5);

        // Tilføjer MilitaryDictator og PoliticalDictator
        leaders.add(leader1);
        leaders.add(leader2);

        // Looper igennem hver leader og kalder metoderne
        for (Leader leader : leaders) {
            System.out.println("==========================");
            leader.printDetails();
            leader.giveSpeech();

        // Poweractions delene af koden
            if (leader instanceof Poweractions) {
                Poweractions actions = (Poweractions) leader;
                actions.holdParade();
                actions.repressOpposition();
                actions.implementPolicy();
                System.out.println("==========================");
                System.out.println();
            }
        }
    }
}
