abstract class Leader {
    protected String name;
    protected String country;
    protected int yearsInPower;
    protected int popularity;


    // Updated constructor – includes popularity and aiRank
    public Leader(String name, String country, int yearsInPower) {
        this.name = name;
        this.country = country;
        this.yearsInPower = yearsInPower;
    }

    // Abstract method – must be implemented in subclasses
    public abstract void giveSpeech();

    // Method that prints leader details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Years in Power: " + yearsInPower);
        System.out.println("Popularity: " + popularity);
    }
}
