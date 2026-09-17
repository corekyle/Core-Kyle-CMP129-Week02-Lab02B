public class Person 
{   // START OF Person class
    
    // Declare fields
    private String name;
    private int age;
    private String email;

    // Defaults contructor
    public Person()
    {
        name = "John Doe";
        age = 0;
        email = null;
    }

    // Contructor with arguments passed
    public Person(String n, int a, String e)
    {
        name = n;
        age = a;
        email = e;
    }


    // Person setter methods
    public void setName(String name)
    {   // START OF setName method
        this.name = name;
    }   // END OF setName method

    public void setAge(int age)
    {   // START of setAge method
        this.age = age;
    }   // END OF setAge method

    public void setEmail(String email)
    {   // START OF setEmail method
        this.email = email;
    }   // END OF setEmail method
    

    // Person getter methods
    public String getName()
    {   // START OF getName method
        return name;
    }   // END OF getname method

    public int getAge()
    {   // START OF getAge method
        return age;
    }   // END OF getAge method

    public String getEmail()
    {   // START OF getEmail method
        return email;
    }   // END OF getEmail method


    // Method to display the details of a person
    public void displayInfo()
    {   // START OF displayInfo method
        System.out.printf("Name: %s\n" +
                          "Age: %d\n" +
                          "Email: %s", name, age, email);
    }   // END OF displayInfo method
}   // END OF Person class