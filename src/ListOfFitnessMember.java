import java.util.ArrayList;

public class ListOfFitnessMember
{
    /**
     * Declares an ArrayList variable and call the ArrayList constructor to instantiate an ArrayList object and assign it to the variable
     * https://www.dummies.com/programming/java/use-array-lists-in-java/
     */
    private ArrayList<Member> listOfFitnessMember  = new ArrayList<>();

    /**
     * Private method that are called by GetListOfFitnessMember() and returns the ArrayList with added members to getListOfFitnessMember
     * It can stores instances of only Member
     * @return listOfFitnessMember
     */
    private ArrayList<Member> addMember()
    {
        listOfFitnessMember.add(new Member("Morten","130195-1303", false));
        listOfFitnessMember.add(new Member("Martin","221175-1011", true));
        listOfFitnessMember.add(new Member("Martina","050970-1409", false));
        listOfFitnessMember.add(new Member("Marcel","221175-1011", true));

        return listOfFitnessMember;
    }

    /**
     * Public method that is called by main() and calls on the private method addMember() in the for-each loop and have the instance of Member as type
     * The for-each loop loops through the ArrayList and returns the lines
     * @return test
     */
    public String GetListOfFitnessMember()
    {
        String test = "";
        for(Member m : addMember())
        {
           test += m;
        }
        return test;
    }
}
