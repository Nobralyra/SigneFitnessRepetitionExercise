import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandlingPersons
{
    /**
     * Private method that is called by GetArrayListOfPersonsFromFile() that reads the members.txt file and adds it to the ArrayList
     * @return listOfPersonsTxt
     */
    private ArrayList<String> addPersonsFileToArrayList()
    {
        /**
         * Local variable and initialized
         */
        ArrayList<String> listOfPersonsTxt = new ArrayList<>();

        /**
         * There are used a try statement where the code is trying to read from a file and place it in a ArrayList with a while loop,
         * because reading from a file can throw an exception, and a catch statement to catch the exception
         */
        try
        {
            Scanner scannerPersons = new Scanner(new File("D:\\IntelliJWorkspace\\SigneFitnessRepetitionExercise\\src\\persons.txt"));

            while (scannerPersons.hasNextLine())
            {
                listOfPersonsTxt.add(scannerPersons.nextLine());
            }
            scannerPersons.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return listOfPersonsTxt;
    }

    /**
     * Public method that is called by main() and calls on the private method addPersonsFileToArrayList() in the for-each loop
     * @return test.replaceAll(",", "\n").replaceAll(" ", "\t\t")
     */
    public String GetArrayListOfPersonsFromFile()
    {
        /**
         * Local variable and initialized
         */
        String test = "";
        /**
         *  For-Each loop        https://www.w3schools.com/java/java_arrays.asp
         *  https://stackoverflow.com/questions/599161/best-way-to-convert-an-arraylist-to-a-string
         */
        for(String s: addPersonsFileToArrayList())
        {
            test += s;
        }
        return test.replaceAll(",", "\n").replaceAll(" ", "\t\t");
    }

}
