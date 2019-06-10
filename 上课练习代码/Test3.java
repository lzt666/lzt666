
import java.util.Scanner;

public class Test3
{
    public static void main(String[] args)throws  NumberFormatException
    {
     try {
         String str =new String();
     }catch ( NumberFormatException str){
         str.printStackTrace();
     }

        Scanner scanner= new Scanner(System.in);
        String a = scanner.next();
        char x[] = a.toCharArray();
        StringBuffer str = new StringBuffer();
        int c[] = new int[x.length / 2];
        char m[] = new char[x.length / 2];
        int index = 0;
        int ind = 0;
        for (int i = 0; i < x.length; i++)
        {
            if (i % 2 != 0)
            {
                c[index] = Integer.parseInt(String.valueOf(x[i]));
                index++;
            } else
                {
                m[ind] = x[i];
                ind++;
            }
        }

        for (int j = 0; j < c.length; j++)
        {
            for (int k = 0; k < c[j]; k++)
            {
                str.append(m[j]);
            }
        }
        System.out.println(str.toString());


    }

}



