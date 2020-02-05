/**
@author             : Signe Nørløv Eskildsen
// Created          : 06-09-2019
// Last Modified By : Signe Nørløv Eskildsen
// Last Modified On : 04/02/2020
 */
public class Main
{
    public static void main(String[] args)
    {
        /**
         * Instance of the classes
         */
        FileHandlingPersons fileHandlingPersons = new FileHandlingPersons();
        FileHandlingMembers fileHandlingMembers = new FileHandlingMembers();
        FileHandlingEmployees fileHandlingEmployees = new FileHandlingEmployees();

        ListOfPerson listOfPerson = new ListOfPerson();
        ListOfFitnessAdministration listOfFitnessAdministration = new ListOfFitnessAdministration();
        ListOfFitnessInstructor listOfFitnessInstructor = new ListOfFitnessInstructor();
        ListOfFitnessMember listOfFitnessMember = new ListOfFitnessMember();

        /**
         * Prints the information from the ArrayLists
         */
        System.out.println("FITNESS EMPLOYEES");
        System.out.println("Name" + "\t\t" + "Cpr" + "\t\t\t\t" +  "Hours" + "\t" + "Salary" + "\t\t" + "Vacation");
        System.out.println("***********************************************************************");
        System.out.println(listOfFitnessAdministration.GetListOfFitnessAdministration());
        System.out.println(listOfFitnessInstructor.GetListOfFitnessInstructor());
        System.out.println("Oversigt hentet fra employees.txt");
        System.out.println(fileHandlingEmployees.GetArrayListOfEmployeesFromFile());
        System.out.println("======================================================================="+ "\n");

        System.out.println("FITNESS MEMBERS");
        System.out.println("Name" + "\t\t" + "Cpr" + "\t\t\t\t" +  "Member type" + "\t" + "Fee");
        System.out.println("***********************************************************************");
        System.out.println(listOfFitnessMember.GetListOfFitnessMember());
        System.out.println("Oversigt hentet fra members.txt");
        System.out.println(fileHandlingMembers.GetArrayListOfMembersFromFile());
        System.out.println("=======================================================================" + "\n");

        System.out.println("EMPLOYEES & MEMBERS Name and Cpr");
        System.out.println("Name" + "\t\t" + "Cpr");
        System.out.println("***********************************************************************");
        System.out.println(listOfPerson.GetListOfPerson());
        System.out.println("Oversigt hentet fra persons.txt");
        System.out.println(fileHandlingPersons.GetArrayListOfPersonsFromFile());
    }
}
