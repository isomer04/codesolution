public class Kata
{
    public static bool BetterThanAverage(int[] ClassPoints, int YourPoints)
    {
        int sum = 0;
        foreach (int score in ClassPoints)
        {
            sum += score;
        }
        
        double totalAvg = (double)(sum + YourPoints) / (ClassPoints.Length + 1);
        
        return YourPoints > totalAvg;
    }
}
