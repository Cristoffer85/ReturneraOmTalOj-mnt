//Skapa en metod som returnerar om ett tal är jämnt eller inte.
import java.util.Scanner;
public class ReturnIfValueEqualOrNot
{
    public boolean CompareNum()
    {
        boolean Equal = true;
        boolean NotEqual = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange tal1 här: ");
        int TalJamnt = scanner.nextInt();
        System.out.print("Ange tal2 här: ");
        int TalJamnt1 = scanner.nextInt();
        if(TalJamnt == TalJamnt1)
            return Equal;
        else
            return NotEqual;
    }

    public static void main(String ar[])
    {
        ReturnIfValueEqualOrNot obj = new ReturnIfValueEqualOrNot();
        boolean result = obj.CompareNum();
        System.out.println("Talet är jämnt: " + result);
    }
}
