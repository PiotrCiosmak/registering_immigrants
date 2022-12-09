package immigrants;

public class ImmigrantClass implements ImmigrantImpl
{
    @Override
    public String startWithCapitalLetter(String word)
    {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
}
