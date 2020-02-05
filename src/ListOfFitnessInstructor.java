import java.util.ArrayList;

public class ListOfFitnessInstructor
{
    /**
     * Declares an ArrayList variable and call the ArrayList constructor to instantiate an ArrayList object and assign it to the variable
     * It can stores instances of only Instructor
     * https://www.dummies.com/programming/java/use-array-lists-in-java/
     */
    private ArrayList<Instructor> listOfFitnessInstructor  = new ArrayList<>();

    /**
     * Private method that are called by GetListOfFitnessInstructor() and returns the ArrayList with added members to getListOfFitnessInstructor
     * @return listOfFitnessInstructor
     */
    private ArrayList<Instructor> addInstructor()
    {
        listOfFitnessInstructor.add(new Instructor("Tove","011080-1014",20,0));
        listOfFitnessInstructor.add(new Instructor("Henning","011080-1014",15,0));

        return listOfFitnessInstructor;
    }

    /**
     * Public method that is called by main() and calls on the private method addInstructor() in the for-each loop and have the instance of Instructor as type
     * The for-each loop loops through the ArrayList and returns the lines
     * @return test
     */
    public String GetListOfFitnessInstructor()
    {
        String test = "";
        for(Instructor i : addInstructor())
        {
            test += i;
        }
        return test;
    }
}
