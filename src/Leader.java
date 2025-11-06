abstract class Leader {
    protected String name;
    protected String country;
    protected int yearsInPower;

    // Konstruktør
    public Leader(String name, String country, int yearsInPower) {
        this.name = name;
        this.country = country;
        this.yearsInPower = yearsInPower;
    }

    // Abstrakt metode - skal implementeres i underklasser
    public abstract void giveSpeech();



    // Metode der udskriver lederens detaljer
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Years in Power: " + yearsInPower);
    }



}
