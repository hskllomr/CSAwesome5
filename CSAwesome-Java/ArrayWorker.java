public class ArrayWorker
{
    private int[] values;

    public ArrayWorker(int[] theValues)
    {
        values = theValues;
    }

    /** Doubles the first 5 elements of the array */
    public void doubleFirstFive()
    {
        // Notice: && i < 5
        for (int i = 0; i < values.length && i < 5; i++)
        {
            values[i] = values[i] * 2;
        }
    }

    /**
     * Write a method called tripleFirstFour() that triples the first 4 elements of
     * the array *
     */

    public void tripleFirstFour()
    {
        for(int j=0;j<4;j++)
        {
            values[j] = values[j] * 3;
        }
    }

    public void printArray()
    {
        for (int i = 0; i < values.length; i++)
        {
            System.out.println(values[i]);
        }
    }

    public static void main(String[] args)
    {
        int[] numArray = {3, 8, -3, 2, 20, 5, 33, 1};
        int[] numArray2 = {0, 1, 2, 3, 4, 5};
        ArrayWorker worker = new ArrayWorker(numArray);
        ArrayWorker worker2 = new ArrayWorker(numArray2);
        worker.doubleFirstFive();
        worker2.tripleFirstFour();
        worker.printArray();
    }
}