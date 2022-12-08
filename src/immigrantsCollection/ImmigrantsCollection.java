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

    private List<Immigrant> immigrants = new ArrayList<>();
}
