import java.util.*;
public class swastik 
{

	public static void main(String[] args) 
	{	int i,j;
	Scanner ob= new Scanner(System.in);
	System.out.println("enter number");
	int num=ob.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=num;j++)
			{
				if((j==1 && i<=num/2) || (j==num/2) || (i==num/2) || (i==1 && j>=num) || (i==num/2 || j==num) && i>num/2 || (i==num && j<=num/2))
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
				}
			System.out.println();
			}		
		}
	}


