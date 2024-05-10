public class Countries         // Add your class name here!
{
    // Copy your class from lesson 6.1 below.

    private String Countries;
    private String language;
    private String Capitals;

    public Countries(String Countries,String language,String Capitals)
    {
        this.Countries=Countries;
        this.language=language;
        this.Capitals=Capitals;

    }

    public void print()
    {
        System.out.println(Countries);
        System.out.println(language);
        System.out.println(Capitals);
    }

    public static void main(String[] args)
    {
        // Create an array of 3 objects of your class.
        Countries[] country  = new Countries[3];

        // Initialize array elements 0-2 to new objects of your class.

        country[0]=new Countries("Czech Republic","Czech","Prag");
        country[1]=new Countries("Italy","Italian","Rome");
        country[2]=new Countries("Spain","Spanish","Madrid");

        // Write a for loop that traverses the array and calls

        for(int i=0;i<3;i++)
        {
            country[i].print();
        }
        // the print method of each object in the array using the array index i.
    }
}