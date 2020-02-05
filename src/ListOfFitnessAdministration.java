import java.util.ArrayList;

public class ListOfFitnessAdministration
{
    /**
     * Declares an ArrayList variable and call the ArrayList constructor to instantiate an ArrayList object and assign it to the variable
     * It can stores instances of only Administration
     * https://www.dummies.com/programming/java/use-array-lists-in-java/
     */
    private ArrayList<Administration> listOfFitnessAdministration = new ArrayList<>();

    /**
     * Private method that are called by GetListOfFitnessAdministration() and returns the ArrayList with added members to getListOfFitnessAdministration
     * @return listOfFitnessAdministration
     */
    private ArrayList<Administration> addAdministration()
    {
        listOfFitnessAdministration.add(new Administration("Claus","221175-1011",37,23000, 0));
        listOfFitnessAdministration.add(new Administration("Anna","011080-1012",37,23000,0));

        return listOfFitnessAdministration;
    }

    /**
     * Public method that is called by main() and calls on the private method addAdministration() in the for-each loop and have the instance of Administration as type
     * The for-each loop loops through the ArrayList and returns the lines
     * @return test
     */
    public String GetListOfFitnessAdministration()
    {
        String test = "";
        for(Administration a : addAdministration())
        {
            test += a;
        }
        return test;
    }
}
