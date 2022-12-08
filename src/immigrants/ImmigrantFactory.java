package immigrants;

import java.util.HashMap;
import java.util.Map;

public class ImmigrantFactory
{
    public static ImmigrantType getImmigrantType(String firstName, String lastName)
    {
        ImmigrantType result = immigrantTypes.get(firstName + lastName);
        if (result == null)
        {
            result = new ImmigrantType(firstName, lastName);
            immigrantTypes.put(firstName + lastName, result);
        }
        return result;
    }

    static Map<String, ImmigrantType> immigrantTypes = new HashMap<>();
}
