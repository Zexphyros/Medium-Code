import javax.management.StringValueExp;

public class NumsToString{
    public static void main(String[] args) 
    {

        int num = 1234;
        int len=String.valueOf(num).length();
        int shift = (int) Math.pow(10, len-1);
        System.out.println(numToString(num, shift, len));

    }

    public static String numToString(int num, int shift,int len)
    {  
        
        if(len <= 0  ) return "";
        
        else
        {
            int digit = num / shift;

            if  (digit == 1) System.out.println("One");

            else if(digit == 2) System.out.println("Two");

            else if(digit == 3) System.out.println("Three");

            else if(digit == 4) System.out.println("Four");

            else if(digit == 5) System.out.println("Five");

            else if(digit == 6) System.out.println("Six");

            else if(digit == 7) System.out.println("Seven");

            else if(digit == 8) System.out.println("Eight");

            else if(digit == 9) System.out.println("Nine");

            else if(digit == 0) System.out.println("Zero");

            return numToString(num-((num / shift)*shift), shift/10,--len);

        }

    }
}   