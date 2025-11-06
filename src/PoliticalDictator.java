public class PoliticalDictator extends Leader implements Interface {

    // Constructor name must match the class name exactly
    public PoliticalDictator(String name, String country, int yearsInPower) {
        super(name, country, yearsInPower);
    }

    @Override
    public void giveSpeech() {
        System.out.println(name + " Is talking to the people with confidence and is giving his trust in the military!");
    }
    @Override
    public void implementPolicy() {
        System.out.println(name + " Has decided to implement a new Policy in the country!");
    }

    @Override
    public void repressOpposition() {
        System.out.println(name + " Is using multiple sources and dirty play to help win over the people of the senate!");
    }

    @Override
    public void holdParade() {
        System.out.println(name + " Has decided to support the Military Parade!");
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Rank: Senator");
    }
}
