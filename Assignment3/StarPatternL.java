/*
 Program :-  Write a java program to Draw pattern.
 			*
 			*
 			*
 			* 
 			* * * * * *
 @author :- Rakhee Gaikwad
 @Date :- 27 Oct 2022
 */
package basic;

import java.util.Scanner;

//declaring a class StarPatternL 
public class StarPatternL
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);	//taking Scanner input
		System.out.println("Enter the number of rows:"); //printing number of rows
		int rows=obj.nextInt();
		
		for(int i=0;i<rows;i++)//using for loop
		{
			System.out.print("		* "); //printing *
			for(int j=0;j<=rows;j++)
			{
				if(i==rows-1)
				System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		//end of for loop
	}
	//end of main method
}
//end of class  StarPatternL 
	