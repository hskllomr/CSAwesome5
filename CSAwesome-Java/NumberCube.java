import java.util.Arrays;

public class NumberCube
{

    public int toss()
    {
        return (int) ((Math.random() * 6) + 1);
    }

    public static int[] getCubeTosses(NumberCube cube, int numTosses)
    {
        // Complete this method
        int[] cubetosses = new int[numTosses];
        for(int i=0;i<numTosses;i++)
        {
            cubetosses[i]=cube.toss();
        }
        return cubetosses;
    }

    public static void main(String[] args)
    {
        NumberCube cube = new NumberCube();
        int numTosses = 9;
        int[] tosses = getCubeTosses(cube, numTosses);

        if (tosses.length < numTosses)
        {
            System.out.println(
                    "It looks like you are not returning an array of the correct"
                            + " size:");
            System.out.println(Arrays.toString(tosses));
        }
        else
        {
            System.out.println("You returned an array of the correct size:");
            System.out.println(Arrays.toString(tosses));
        }
    }
}