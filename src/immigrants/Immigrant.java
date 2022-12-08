package immigrants;

public class Immigrant
{
    public Immigrant(String lastName, Double x, Double y, ImmigrantType type)
    {
        this.lastName = lastName;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void show()
    {
        type.show(lastName, x, y);
    }

    private String lastName;
    private Double x;
    private Double y;
    private ImmigrantType type;
}