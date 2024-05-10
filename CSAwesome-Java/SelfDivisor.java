public class SelfDivisor
{

    /**
     * @param number the number to be tested Precondition: number > 0
     * @return true if every decimal digit of number is a divisor of number; false
     *     otherwise
     */
    public static boolean isSelfDivisor(int number)
    {
        int currNumber = number;
        int digit = 0;
        while (currNumber > 0)
        {
            digit = currNumber % 10;
            if (digit == 0)
            {
                return false;
            }
            if (number % digit != 0)
            {
                return false;
            }
            currNumber = currNumber / 10;
        }
        return true;
    }

    /**
     * @param start starting point for values to be checked Precondition: start > 0
     * @param num the size of the array to be returned Precondition: num > 0
     * @return an array containing the first num integers >= start that are
     *     self-divisors
     */
    public static int[] firstNumSelfDivisors(int start, int num)
    {
        /* to be implemented in part (b) */
        int[] array=new int[num];
        int count=0;
        int start2=start;
        while(count<num)
        {
            if(isSelfDivisor(start2))
            {
                array[count]=start2;
                count=count+1;
            }
            start2=start2+1;
        }
        return array;
    }

    public static void main(String[] args)
    {
        System.out.println("Self divisors for firstNumSelfDivisors(10, 3):");
        for (int n : firstNumSelfDivisors(10, 3))
        {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Self divisors for firstNumSelfDivisors(22, 5):");
        for (int n : firstNumSelfDivisors(22, 5))
        {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

