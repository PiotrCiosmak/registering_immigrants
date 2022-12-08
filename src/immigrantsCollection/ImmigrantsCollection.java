package immigrantsCollection;

import immigrants.Immigrant;
import immigrants.ImmigrantFactory;
import immigrants.ImmigrantType;

import java.util.ArrayList;
import java.util.List;

public class ImmigrantsCollection
{
    public void registerImmigrant(String lastName, Double x, Double y, String firstName)
    {
        ImmigrantType type = ImmigrantFactory.getImmigrantType(firstName);
        Immigrant immigrant = new Immigrant(lastName, x, y, type);
        immigrants.add(immigrant);
    }

    public Immigrant getImmigrant(int index)
    {
        return immigrants.get(index);
    }

    private List<Immigrant> immigrants = new ArrayList<>();
}
