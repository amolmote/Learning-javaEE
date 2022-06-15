class kite
{
	public static void main(String args[])
{
	for(int i=1;i<=5;i++)
	{
	 for(int j=0;j<=9;j++)
	  {
	    if(j>=5-i && j<=4+i)
	     System.out.print("*");
	   else
	    System.out.print(" ");
	   }
          System.out.println("\n");
	}
	for(int i=5;i>=1;i--)
	{
	 for(int j=9;j>=1;j--)
	  {
	    if(j>=6-i && j<=4+i)
	     System.out.print("*");
	   else
	    System.out.print(" ");
	   }
          System.out.println("\n");
	}
            for(int i=1;i<=3;i++)
 	  {
	   for(int j=1;j<=9;j++)
	  {
	   if(j>=6-i && j<=4+i)
	   System.out.print("*");
	   else
	    System.out.print(" ");
	   }
          System.out.println("\n");
}
}
}	