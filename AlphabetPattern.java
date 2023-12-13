public class MyClass{
   static void pyramid()
   {
       char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M'};
       int n=5;
       for(int i=0;i<5;i++)
       {
           int t=i;
           for(int j=0;j<=i;j++)
           {
               System.out.print(arr[t++]);
           }System.out.println();
       }
   }
    public static void main(String args[])
    {
       MyClass.pyramid();
    }
}
