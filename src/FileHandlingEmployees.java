import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandlingEmployees
{
    /**
     * Private method that is called by GetArrayListOfEmployeesFromFile() that reads the employees.txt file and adds it to the ArrayList
     * @return listOfEmployeesTxt
     */
    private ArrayList<String> addEmployeesFileToArrayList()
    {
        /**
         * Local variable and initialized
         */
        ArrayList<String> listOfEmployeesTxt = new ArrayList<>();

        /**
         * There are used a try statement where the code is trying to read from a file and place it in a ArrayList with a while loop,
         * because reading from a file can throw an exception, and a catch statement to catch the exception
         */
        try
        {
            Scanner scannerEmployees = new Scanner(new File("D:\\IntelliJWorkspace\\SigneFitnessRepetitionExercise\\src\\employees.txt"));

            while (scannerEmployees.hasNextLine())
            {
                listOfEmployeesTxt.add(scannerEmployees.nextLine());
            }
            scannerEmployees.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return listOfEmployeesTxt;
    }

    /**
     * Public method that is called by main() and calls on the private method addEmployeesFileToArrayList() in the for-each loop
     * @return test.replaceAll(",", "\n").replaceAll(" ", "\t\t")
     */
    public String GetArrayListOfEmployeesFromFile()
    {
        /**
         * Local variable and initialized
         */
        String test = "";
        /**
        For-Each loop        https://www.w3schools.com/java/java_arrays.asp
         https://stackoverflow.com/questions/599161/best-way-to-convert-an-arraylist-to-a-string
         */
        for(String s: addEmployeesFileToArrayList())
        {
            test += s;
        }
        return test.replaceAll(",", "\n").replaceAll(" ", "\t\t");
    }
}
