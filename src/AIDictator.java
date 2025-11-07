public class AIDictator extends Leader {
    private final String aiRank;
    private int popularity;

    // Constructor extends base one and adds aiRank + popularity
    public AIDictator(String name, String country, int yearsInPower, String aiRank, int popularity) {
        super(name, country, yearsInPower);
        this.aiRank = aiRank;
        this.popularity = popularity;
    }

    @Override
    public void giveSpeech() {
        System.out.println(name + " delivers a cold and calculated speech about AI dominance.");
    }

    public void enforceRule() {
        System.out.println(name + " enforces the dankmeme rule!");
        popularity += 3;
        System.out.println("Popularity increased to: " + popularity);
    }

    public void killHumans() {
        System.out.println(name + " instructs the army to exterminate all living humans on planet Orison 7b!");
        popularity += 5;
        System.out.println("Popularity increased to: " + popularity);
    }

    @Override
    public void printDetails() {
        super.printDetails(); // prints name, country, yearsInPower
        System.out.println("AI Rank: " + aiRank);
        System.out.println("Popularity: " + popularity);
    }

    // Optional getter if you need to use aiRank in main
    public String getAiRank() {
        return aiRank;
    }
}
