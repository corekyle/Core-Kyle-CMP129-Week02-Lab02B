import java.util.Scanner;

public class PersonTest 
{   // START OF PersonTest class
    
    public static void main(String[] args)
    {   // START OF main method

        // Create Scanner object
        Scanner keyboard = new Scanner(System.in);


        // Create Person objects
        Person person1 = new Person();
        Person person2 = new Person();


        // Declare variables
        String name;
        int age;
        String email;

        // Display the info about the Person objects
        System.out.println("\n" +
                           "Person 1\n" +
                           "--------------------");
        person1.displayInfo();

        System.out.print("\n");

        System.out.println("\n" +
                           "Person 2\n" +
                           "--------------------");
        person2.displayInfo();

    }   // START OF main method

}   // END OF Person Test class