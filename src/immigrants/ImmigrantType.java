package immigrants;

public class ImmigrantType
{
    public ImmigrantType(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void show(Double x, Double y)
    {
        System.out.println("---IMIGRANT---");
        System.out.println("Imie: " + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Współrzędne: [" + x + ", " + y + "]\n");
    }

    private String firstName;
    private String lastName;
}
