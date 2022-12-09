package immigrants;

public class Immigrant
{
    public Immigrant(ImmigrantImpl immigrant, String lastName, Double x, Double y, ImmigrantType type)
    {
        this.immigrant=immigrant;
        this.lastName = this.immigrant.startWithCapitalLetter(lastName);
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void show()
    {
        type.show(lastName, x, y);
    }

    @Override
    public String toString()
    {
        return lastName + " " + x + " " + y + " " + type.toString();
    }

    private String lastName;
    private Double x;
    private Double y;
    private ImmigrantType type;
    private ImmigrantImpl immigrant;
}