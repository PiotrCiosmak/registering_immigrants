package immigrants;

public class ImmigrantProxy implements ImmigrantImpl
{
    public ImmigrantProxy()
    {
        this.immigrantService = new ImmigrantClass();
    }

    @Override
    public String startWithCapitalLetter(String word)
    {
        if (name == null)
        {
            name = immigrantService.startWithCapitalLetter(word);
        }
        return name;
    }

    private ImmigrantImpl immigrantService;
    private String name;
}
