public class MilitaryDictator extends Leader implements Interface {

    // Constructor name must match the class name exactly
    public MilitaryDictator(String name, String country, int yearsInPower) {
        super(name, country, yearsInPower);
    }

    @Override
    public void giveSpeech() {
        System.out.println(name + " is talking to his nation with a strong tone and confidence in his voice!");
    }

    @Override
    public void implementPolicy() {
        System.out.println(name + " Has decided to implement a new Policy within his Platoon of men and women!");
    }

    @Override
    public void repressOpposition() {
        System.out.println(name + " Is using force to repress the Opposition!");
    }

    @Override
    public void holdParade() {
        System.out.println(name + " Has decided to hold a Military parade to celebrate!");
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Rank: Generel");
    }
}
