public class RecursionBasic 
{
    public static long f1(int i)
    {
        if(i>1)
        {
            return i*f1(i-1);
        }
        return 1;
    }

    public static void f2(int i)
    {
        if(i<=10)
        {
            System.out.print(" "+i+" ");
            f2(i=i+1);
        }
    }

    public static void f3(int i)
    {
        if(i<10)
        {
            f3(i=i+1);
            System.out.print(" "+i+" ");
        }
    }

    public static void f4(int i)
    {
        if(i>1)
        {
             f4(i=i-1);
            if(i%2 == 0)
            {
                System.out.print("\nEven Number : "+i);
            }
            else
            {
                System.out.print("\nOdd Number : "+i);
            }
        }
    }

    public static void main(String[] args) 
    {
         long res1 = f1(10);
        System.out.print("\n\n "+res1+"\n\n");

        f2(1);

        System.out.print("\n\n");

        f3(0);  

        System.out.print("\n\n\n");

        f4(10);
    }
}
