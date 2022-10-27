/*
Program :-  Write a java program that find prime number betwen 100 to 200 range.
@author :- Rakhee Gaikwad
@Date :- 27 Oct 2022
*/
package basic;

//declaring a class PrimeNumbers 
public class PrimeNumbers 
{
	//calling  main method
		public static void main(String[] args) 
		{
			for(int i=100;i<=200;i++) 	//using for loop
			{
				boolean flag=true;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						flag=false;
						System.out.println(" composite number "+i);	// composite number
						break;
					}
					
				}	//enf dor loop
				if(flag==true)
				{
					System.out.println(" prime number "+i); 	// printing Prime Number
				}
			}
			//end of main method
			
		}  
		//end of class PrimeNumber
			

		
		//end of main method
	}
	//end of a class PrimeNumber

			

