import java.util.*;

public class SpeedTyping {

    public static void main(String [] args)
    {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= T; i++)
        {
            StringBuilder I = new StringBuilder(sc.nextLine());
            StringBuilder P = new StringBuilder(sc.nextLine());
            int iLength = I.length();
            int pLength = P.length();
            // System.out.println("Debug: Length of I = " + I.length());
            // System.out.println("Debug: Length of P = " + P.length());
            // System.out.println("Is I == P? " + P.toString().equals(I.toString()));

            if(P.length() < I.length())
            {
                System.out.println("Case #" + i + ": IMPOSSIBLE");
                continue;
            }

            else if(P.length() == I.length() && P.toString().equals(I.toString()))
            {
                System.out.println("Case #" + i + ": 0");
            }

            else if(P.length() == I.length() && !(P.toString().equals(I.toString())))
            {
                System.out.println("Case #" + i + ": IMPOSSIBLE");
            }

            else
            {
                boolean allContained = true;
                for(int j = 0; j < I.length(); j++)
                {
                    if(P.toString().contains(I.charAt(j)+""))
                    {
                        int indexToBeRemoved = P.indexOf(I.charAt(j)+"");
                        P.deleteCharAt(indexToBeRemoved);
                        continue;
                    }
                    else
                    {
                        // System.out.println("Debug: Char " + I.charAt(j) + " missing.");
                        allContained = false;
                        break;
                    }
                }
                if(allContained == true)
                {
                    System.out.println("Case #" + i + ": " + (pLength - iLength));
                }
                else
                {
                    System.out.println("Case #" + i + ": IMPOSSIBLE");
                }
            }
        }
    }
}
