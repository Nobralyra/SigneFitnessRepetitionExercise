public class Administration extends Employee
{
    /**
     * vacation is a private field and therefor the first letter of the first word in the identifier is lower case,
     * while the first letter of every subsequent word is uppercase for easiest to spot it
     */
    private int vacation;

    /**
     * Default constructor
     */
    public Administration()
    {

    }

    /**
     * Overloaded constructor with
     * @param Name
     * @param Cpr
     * @param hours
     * @param salary
     * @param vacation
     */
    public Administration(String Name, String Cpr, int hours, int salary, int vacation)
    {
        super(Name, Cpr, hours, salary);
        this.vacation = vacation;
    }

    /**
     * Getter for vacation that is 0 in the list
     * @return vacation + 5
     */
    public int getVacation()
    {
        return vacation + 5;
    }

    /**
     * Uses toString() to print values from the listOfFitnessAdministration in the Main class so we can read it
     * @return getName(), getCpr(), getHours(), getHours(), and getVacation()
     */
    @Override
    public String toString()
    {
        return getName() + "\t\t" + getCpr() + "\t\t" + getHours() + "\t\t" + getSalary() + "\t\t" + getVacation()+ "\n";
    }
}
