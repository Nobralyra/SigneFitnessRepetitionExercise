import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandlingMembers
{
    /**
     * Private method that is called by GetArrayListOfMembersFromFile() that reads the members.txt file and adds it to the ArrayList
     * @return listOfMembersTxt
     */
    private ArrayList<String> addMembersFileToArrayList()
    {
        /**
         * Local variable and initialized
         */
        ArrayList<String> listOfMembersTxt = new ArrayList<>();

        /**
         * There are used a try statement where the code is trying to read from a file and place it in a ArrayList with a while loop,
         * because reading from a file can throw an exception, and a catch statement to catch the exception
         */
        try
        {
            Scanner scannerMembers = new Scanner(new File("D:\\IntelliJWorkspace\\SigneFitnessRepetitionExercise\\src\\members.txt"));

            while (scannerMembers.hasNextLine())
            {
                listOfMembersTxt.add(scannerMembers.nextLine());
            }
            scannerMembers.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return listOfMembersTxt;
    }

    /**
     * Public method that is called by main() and calls on the private method addMembersFileToArrayList() in the for-each loop
     * @return test.replaceAll(",", "\n").replaceAll(" ", "\t\t")
     */
    public String GetArrayListOfMembersFromFile()
    {
        /**
         * Local variable and initialized
         */
        String test = "";
        /**
         * For-Each loop        https://www.w3schools.com/java/java_arrays.asp
         * https://stackoverflow.com/questions/599161/best-way-to-convert-an-arraylist-to-a-string
         */
        for(String s: addMembersFileToArrayList())
        {
            test += s;
        }
        return test.replaceAll(",", "\n").replaceAll(" ", "\t\t");
    }
}
