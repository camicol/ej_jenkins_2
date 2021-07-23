import java.Util.Scanner;
public class LowerToUpper
{
  public static void main(String[] input)
    {
        String strUpper, strLower;
        Scanner scan = new Scanner(System.in);
    
        strUpper = scan.nextLine();
        
        strLower = strUpper.toUpperCase();
        System.out.print("Equivalent Word/Name in Uppercase : " +strLower);
    }
}
