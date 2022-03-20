import java.util.Scanner;

public class ChallengeNine {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int j = 1; j <= T; j++)
        {
            String number = sc.nextLine();
            int sum = 0;
            for(int i = 0; i < number.length(); i++)
            {
                sum += Integer.valueOf(number.charAt(i)+"");
            }
            // System.out.println("Debug: sum = " + sum);
            if(sum % 9 == 0)
            {
                StringBuilder sb = new StringBuilder(number);
                sb.insert(1, '0');
                System.out.println("Case #" + j + ": " + sb.toString());
                continue;
            }
            int digitToBeInserted = 9 - (sum % 9);
            // System.out.println("Debug: Digit to be inserted: " + digitToBeInserted);
            StringBuffer sb = new StringBuffer(number);
            boolean inserted = false;
            for(int i = 0; i < number.length(); i++)
            {
               if(digitToBeInserted < Integer.valueOf(number.charAt(i)+""))
               {
                   sb.insert(i, digitToBeInserted);
                   inserted = true;
                   break;
               }
            }
            if(!inserted)
            {
                sb.insert(sb.length(), digitToBeInserted);
            }
            System.out.println("Case #" + j + ": " + sb.toString());
        }
    }
}
