package immigrants;

public class ImmigrantType
{
    public ImmigrantType(ImmigrantImpl immigrant, String firstName)
    {
        this.immigrant = immigrant;
        this.firstName = this.immigrant.startWithCapitalLetter(firstName);
    }

    public void show(String lastName, Double x, Double y)
    {
        System.out.println("---IMIGRANT---");
        System.out.println("Imie: " + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Współrzędne: [" + x + ", " + y + "]\n");
    }

    @Override
    public String toString()
    {
        return firstName;
    }

    private String firstName;
    private ImmigrantImpl immigrant;
}