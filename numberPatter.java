public class MyClass{
    public static void pyramid()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void reversePyramid()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void tringle()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
           for(int j=n-i;j>0;j--)
           {
               System.out.print(" ");
           }
           for(int k=0;k<(i*2)-1;k++)
           {
               System.out.print("*");
           }System.out.println();
        }
    }
    public static void rightPyramid()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void ReverseTringle()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=(n*2)-i;k++)
            {
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void main(String args[])
    {
       MyClass.pyramid();
       System.out.println();
       MyClass.reversePyramid();
       MyClass.tringle();
       MyClass.rightPyramid();
       MyClass.ReverseTringle();
    }
}
