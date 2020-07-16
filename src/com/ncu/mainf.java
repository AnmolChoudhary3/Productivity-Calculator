//*************************************************************
//			MAIN CLASS
//*************************************************************

//PACKAGE NAME
package com.ncu;

//FILES IMPORTED
import com.ncu.exception.*;
import com.ncu.processors.*;
import com.ncu.validators.*;
import java.util.*;



//MAIN CLASS STARTS............................................................................................
public class mainf
{
	
	//MAIN FUNCTION
	public static void main(String[] args) 
	{
		
		//WELCOME STSTEMENTS
		System.out.println("\n\n			Welcome to\n             THE PRODUCTIVITY CALCULATOR APP\n\n       		             - Manage time like a Pro!");
		System.out.println("\n\n\n------------- SIGNIN/SIGNUP -------------");

		String ch;
		login log = new login();            // LOGIN OBJECT

		Scanner inn = new Scanner(System.in);
		System.out.print("\n\n   USERNAME: ");
		String username = inn.next();
		System.out.print("\n   PASSWORD: ");
		String password = inn.next();
		System.out.println("\n\n-----------------------------------------\n");
		log.loginf(username, password);      // Login Function Call
		validation valid_ob = new validation(); // VALIDATION OBJECT

	do
	{
		System.out.println("\n\n\n 		...|| MAIN MENU  ||...\n\n");
		System.out.println("   0. => About APP");
		System.out.println("   1. => Add New task");
		System.out.println("   2. => Remove a task");
		System.out.println("   3. => Update a task");
		System.out.println("   4. => Display calculated result");
		System.out.println("   5. => Percentile\n\n");

		String input;
		
		int flag;
		do
		{
			int flag2=0;
			System.out.print(" Enter your choice: ");
			input = inn.next();
			if(valid_ob.isInt(input))
			{
				
				if(valid_ob.switchcasevalidation(input))
				{
					flag=0;
				}
				else
				{
					flag=1;
					System.out.println("\n Invalid Choice \n enter again....\n");
				}
			}
			else
			{
				flag=1;			
				System.out.println("\nenter again....\n");
			}
		}while(flag!=0);



		display obdis = new display();

		int i=Integer.parseInt(input);		//For parsing (String to int)
		System.out.println("\n\n");
		

//    SWITCH CASE FOR MENU DRIVEN PROGRAM
		switch(i)
		{
			case 0: about obabout = new about();	//ABOUT APP
					obabout.aboutf(); 
					break;

			case 1: add obadd = new add();			//ADD TASK
					obadd.addf(username); 
					break;

			case 2: obdis.displayf(username);		
					remove obremove = new remove();	//REMOVE TASK	
					obremove.removef(username);
					break;

			case 3: obdis.displayf(username);
					update obupdate = new update();	//UPDDATE TASK
					obupdate.updatef(username);
					break;

			case 4: obdis.displayf(username);
					procalc obcalc = new procalc();	//DASPLAY FINAL REUSLT
					obcalc. procalcf(username);
					break;

			case 5: percentile obj = new percentile();// PRESCENTILE SCORE (ADDITIONAL FEATURE)
					obj.percentilef(username);
					break;

			default: System.out.println("wrong input");

		}
		System.out.println("------------------------------------------------------------------");
		System.out.print("Do you want to return back to main menu [y / n]: ");
		ch = inn.next();
	}while(ch.equals("y"));  // loop for menu
		

			
	}
}

//******************************************************************************************************
//		  										CLASS ENDS
//******************************************************************************************************