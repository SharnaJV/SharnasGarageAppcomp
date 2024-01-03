import java.util.ArrayList;
import java.util.Random;


public class Order
{
//This method generates a non recurring random number the which is assigned to the customer
    static int randNumGen(boolean hasGenuineParts)
    {
        int returnValue = -1;
        if (hasGenuineParts)
        {
            Random myRandNumGen = new Random();
            int myCount = 0;
            int minNum = 10000;
            int maxNum = 100000;
            int myRand = myRandNumGen.nextInt((maxNum - minNum) + 1) + minNum;
            int result = 0;

            ArrayList<Integer> randArray = new ArrayList<Integer>();

            if (!randArray.contains(myRand)) {
                myCount++;
                randArray.add(myRand);
                result = (randArray.get(myCount - 1));
                returnValue = result;
                System.out.println("Order Number: 1" + result);
            }
        }
        else
        {
            Random myRandNumGen = new Random();
            int myCount = 0;
            int minNum = 10000;
            int maxNum = 100000;
            int myRand = myRandNumGen.nextInt((maxNum - minNum) + 1) + minNum;
            int result = 0;

            ArrayList<Integer> randArray = new ArrayList<Integer>();

            if (!randArray.contains(myRand)) {
                myCount++;
                randArray.add(myRand);
                result = (randArray.get(myCount - 1));
                returnValue = result;
                System.out.println("Order Number: 2" + result);
            }
        }
        return  returnValue;
    }
}
