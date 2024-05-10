public class Exam        // Add your class name here!
{
    // 1. copy in your instance variables for class from the last lesson
    private String name;
    private String email;
    private String phoneNumber;

    // 2. Add a constructor with 3 parameters to set all of the instance variables to the given parameters.
    public Exam(String name2,String email2,String phoneNumber2)
    {
        name=name2;
        email=email2;
        phoneNumber=phoneNumber2;

    }
    // 3. Write a print() method that uses System.out.println to print out all the instance variables.
    public void printto()
    {
        System.out.println(name);
        System.out.println(email);
        System.out.println(phoneNumber);
    }

    public void setmodel(String Setname)
    {
        name=Setname;
    }

    public void setemail(String Setemail)
    {
        email=Setemail;
    }

    public void setphoneNumber(String SetphoneNumber)
    {
        phoneNumber=SetphoneNumber;
    }

    public String getname()
    {
        return name;
    }

    public String getemail()
    {
        return email;
    }

    public String getnumber()
    {
        return phoneNumber;
    }

    // 2. Create accessor (get) and mutator (set) methods for each of the instance variables.

    // 3. Create a toString() method that returns all the information in the instance variables.


    public String toString()
    {
        return name+":"+email+":"+":"+phoneNumber;
    }

    public void print(String format)
    {
        if(format.equals("plain"));
        {
            printto();
        }

    }

    public static void main(String[] args)
    {
        // 2. Create an array of 3 objects of your class.
        Exam[] exam = new Exam[3];

        // 3. Initialize array elements 0-2 to new objects of your class.

        exam[0]=new Exam("omer","@sdasdas","+5654646");
        exam[1]=new Exam("faruk","@dfsfsd","+3224343");
        exam[2]=new Exam("haskul","@ssxacx","+88989");

        // 4. Call the print method of each object in the array using the array index.

        for(int i=0;i<2;i++)
        {
            exam[i].printto();
        }
    }
}