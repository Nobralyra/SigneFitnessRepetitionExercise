public class Member extends Person
{
    /**
     * isBasic is a private field and therefor the first letter of the first word in the identifier is lower case,
     * while the first letter of every subsequent word is uppercase for easiest to spot it
     */
    private boolean isBasic;

    /**
     * Default constructor
     */
    public Member()
    {

    }

    /**
     * Overloaded constructor with
     * @param Name
     * @param Cpr
     * @param isBasic
     */
    public Member(String Name, String Cpr, boolean isBasic)
    {
        super(Name, Cpr);
        this.isBasic = isBasic;
    }

    /**
     * Method with af if else statement that have isBasic as condition that finds out the member type a member have
     * @return Basic
     * else
     * @return Full
     */
    public String getMemberType()
    {
        if (isBasic) // Meaning true
        {
            return "Basic";
        }
        else
        {
            return "Full";
        }
    }

    /**
     * Method with af if else statement that have the method getMembertype() == "Basic" as condition that finds out the price of the member type
     * It calls on getMembertype and get back if it is Basic or Full, and only if it is Basic it is equal to the condition and it returns
     * @return 199
     * else it returns
     * @return 299
     */
    public int getMonthlyFee()
    {
        if (getMemberType() == "Basic")
        {
            return 199;
        }
        else
        {
            return 299;
        }
    }

    /**
     * Uses toString() to print values from the listOfFitnessMember in the Main class so we can read it
     * @return getName(), getCpr(), getMemberType(), and getMonthlyFee()
     */
    @Override
    public String toString()
    {
        return getName() + "\t\t"+ getCpr() + "\t\t" + getMemberType() + "\t\t" + getMonthlyFee() + "\n";
    }

}
