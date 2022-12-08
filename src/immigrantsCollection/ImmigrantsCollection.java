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

    public void loadImmigrant(String line)
    {
        String[] variables = line.split(" ");

        ImmigrantType type = ImmigrantFactory.getImmigrantType(variables[3]);
        Immigrant immigrant = new Immigrant(variables[0], Double.parseDouble(variables[1]),  Double.parseDouble(variables[2]), type);
        immigrants.add(immigrant);
    }

    public Immigrant getImmigrant(int index)
    {
        return immigrants.get(index);
    }

    public int getSize()
    {
        return immigrants.size();
    }

    public void clear()
    {
        immigrants.clear();
    }

    private List<Immigrant> immigrants = new ArrayList<>();
}
