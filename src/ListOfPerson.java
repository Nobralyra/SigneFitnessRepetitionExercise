import java.util.ArrayList;

public class ListOfPerson
{
    /**
     * Declares an ArrayList variable and call the ArrayList constructor to instantiate an ArrayList object and assign it to the variable
     * https://www.dummies.com/programming/java/use-array-lists-in-java/
     */
    private ArrayList<Person> listOfPerson = new ArrayList<>();

    /**
     * Method that returns the ArrayList with added members to getListOfPerson
     * @return listOfPerson
     */
    private ArrayList<Person> addPerson()
    {
        listOfPerson.add(new Person("Claus","221175-1011"));
        listOfPerson.add(new Person("Anna","011080-1012"));
        listOfPerson.add(new Person("Tove","011080-1014"));
        listOfPerson.add(new Person("Henning","011080-1014"));
        listOfPerson.add(new Person("Morten","130195-1303"));
        listOfPerson.add(new Person("Martin","221175-1011"));
        listOfPerson.add(new Person("Martina","050970-1409"));
        listOfPerson.add(new Person("Marcel","221175-1011"));

        return listOfPerson;
    }


    public String GetListOfPerson()
    {
        String test = "";
        for(Person p : addPerson())
        {
            test += p;
        }
        return test;
    }
}


