public class TestMain
{
    /*****************************************************
    * This is the main you can use to test MatrixMultiplier
    * It takes a single command line argument specifying 
    * the number of matricies to be multiplied.
    *****************************************************/
    public static void main(String args[])
    {
        try
        {
            System.out.println("Multiplying Matricies!");

            MatrixMultiplier.multiplySeries(Integer.parseInt(args[0]));
        }
        catch (InvalidMatrixMultiplication e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception  e)
        {
            System.out.println("Something unexpected has happened!");
        }

    }
}
