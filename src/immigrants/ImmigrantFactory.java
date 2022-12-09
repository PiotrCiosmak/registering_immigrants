package immigrants;

import java.util.HashMap;
import java.util.Map;

public class ImmigrantFactory
{
    public static ImmigrantType getImmigrantType(String firstName)
    {
        ImmigrantType result = immigrantTypes.get(firstName);
        if (result == null)
        {
            result = new ImmigrantType(new ImmigrantProxy(), firstName);
            immigrantTypes.put(firstName, result);
        }
        return result;
    }

    static Map<String, ImmigrantType> immigrantTypes = new HashMap<>();
}
