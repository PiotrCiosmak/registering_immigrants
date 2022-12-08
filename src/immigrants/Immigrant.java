package immigrants;

public class Immigrant
{
    public Immigrant(Double x, Double y, String lastName, ImmigrantType type)
    {
        this.x = x;
        this.y = y;
        this.lastName = lastName;
        this.type = type;
    }

    public void show()
    {
        type.show(x, y, lastName);
    }

    private Double x;
    private Double y;
    private String lastName;
    private ImmigrantType type;
}