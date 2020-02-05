public class Instructor extends Employee
{
    /**
     * Default constructor
     */
    public Instructor()
    {

    }

    /**
     * Overloaded constructor with
     * @param Name
     * @param Cpr
     * @param hours
     * @param salary
     */
    public Instructor(String Name, String Cpr, int hours, int salary)
    {
        super(Name, Cpr, hours, salary);
    }

    /**
     * Getter that calculate the salary for the Instructor
     * @return
     */
    @Override
    public int getSalary()
    {
       return super.getSalary() + getHours() * 456;
    }


    /**
     * Uses toString() to print values from the listOfFitnessInstructor in the Main class so we can read it
     * @return getName(), getCpr(), getHours(), getHours(), and getSalary() (and getSalary gets the right amount of money)
     */
    @Override
    public String toString()
    {
        return getName() + "\t\t" + getCpr() + "\t\t" + getHours() + "\t\t" + getSalary() + "\n";
    }
}
