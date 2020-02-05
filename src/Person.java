public class Person
{
    /**
     * All classes who inheritance from Person can use these fields, and therefor the first letter of each word capitalized for easiest to spot them
     */
    protected String Name;
    protected String Cpr;

    /**
     * Default constructor
     */
    public Person()
    {

    }

    /**
     * Overloaded constructor with
     * @param Name
     * @param Cpr
     */
    public Person(String Name, String Cpr)
    {
        this.Name = Name;
        this.Cpr = Cpr;
    }

    /**
     * Getter for Name
     * @return Name
     */
    public String getName()
    {
        return Name;
    }

    /**
     * Getter for Cpr
     * @return Cpr
     */
    public String getCpr()
    {
        return Cpr;
    }

    /**
     * Uses toString() to print values from the listOfPerson in the Main class so we can read it
     * @return getName(), and getCpr()
     */
    @Override
    public String toString()
    {
        return getName() + "\t\t" + getCpr() + "\n";
    }
}
