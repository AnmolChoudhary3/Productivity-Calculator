//*************************************************************
//			ADD CLASS
//*************************************************************

//PACKAGE NAME
package com.ncu.processors;

//FILES IMPORTED
import com.ncu.validators.*;
import com.ncu.exception.*;
import java.util.*;
import java.io.*;

//CLASS STARTS................................................... 
public class add
{
	//ONLY FUNC OF CLASS
	public void addf(String username)
	{
		int flag;
		validation valid_ob = new validation();
		Scanner inn = new Scanner(System.in);

		//input of task
		System.out.print(" Enter your tasks: ");
		String task = inn.nextLine();

		//input of hours
		String hrs;
		do
		{
			System.out.print(" Enter number of hrs: ");
			hrs = inn.next();
			if(valid_ob.isInt(hrs))
			{
				flag=0;
			}
			else
			{
				flag=1;
				System.out.println("\nenter again....");
			}
		}while(flag!=0);

		
		//input of productive or not
		String pro; 
		do
		{
			System.out.print(" Is this task productive or not (write y or n): ");

			pro = inn.next();
			if(valid_ob.proValid(pro))
			{
				flag=0;
			}
			else
			{
				flag=1;
				System.out.println("wrong input \nenter again....");
			}
		}while(flag!=0);

		//input of essential or not
		String ess; 
		do
		{
			System.out.print(" IS this essential or not  (write y or n): ");

			ess = inn.next();
			if(valid_ob.proValid(ess))
			{
				flag=0;
			}
			else
			{
				flag=1;
				System.out.println("wrong input \nenter again....");
			}
		}while(flag!=0);




		try
		{

			File ob = new File("C:\\Users\\Ansh\\Desktop\\project\\text_files\\Productivity_Calculator.txt");
			FileWriter fout = new FileWriter(ob,true);
            BufferedWriter bout= new BufferedWriter(fout);
			
			bout.write( username + "," + task + "," +  hrs + "," + pro + "," + ess + ",");
            bout.newLine();
            
            bout.close();

            System.out.println("\n\n New task ADDED.........\n");
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}
}

//******************************************************************************************************
//		  										CLASS ENDS
//******************************************************************************************************