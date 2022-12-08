package immigrants;

public class Immigrant
{
    public Immigrant(Double x, Double y, ImmigrantType type)
    {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void show()
    {
        type.show(x, y);
    }

    private Double x;
    private Double y;
    private ImmigrantType type;
}