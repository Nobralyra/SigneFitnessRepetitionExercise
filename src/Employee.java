public class Employee extends Person
{
    /**
     * hours and salary is private fields and therefor the first letter of the first word in the identifier is lower case,
     * while the first letter of every subsequent word is uppercase for easiest to spot it
     */
    private int hours;
    private int salary;

    /**
     * Default constructor
     */
    public Employee()
    {

    }

    /**
     * Overloaded constructor with
     * @param Name
     * @param Cpr
     * @param hours
     * @param salary
     */
    public Employee(String Name, String Cpr, int hours, int salary)
    {
        super(Name, Cpr);
        this.hours = hours;
        this.salary = salary;
    }

    /**
     * Getter that is used in ListOfFitnessAdministration and ListOfFitnessInstructor as in how many hours have they worked
     * @return hours
     */
    public int getHours()
    {
        return hours;
    }

    /**
     * Getter that is used in ListOfFitnessAdministration where the salary is fixed and in ListOfFitnessInstructor it is 0 as default
     * @return salary
     */
    public int getSalary()
    {
        return salary;
    }

 }
