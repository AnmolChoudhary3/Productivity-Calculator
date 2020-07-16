//*************************************************************
//			VALIDATION CLASS
//*************************************************************

//PACKAGE NAME
package com.ncu.validators;

//FILES IMPORTED
import com.ncu.exception.*;
import java.util.*;
import java.io.*;

//CLASS STARTS................................................... 
public class validation
{
	Properties prop = new Properties();

	//VALIDATION FOR INTEGER
	public boolean isInt(String number )
	{
    	try
    	{
    		Integer.parseInt(number);
    	}catch(Exception e )
    	{
    	try
        {
        	FileReader ob = new FileReader("C:\\Users\\Ansh\\Desktop\\project\\config\\constants\\exceptions.properties");
			prop.load(ob);
        	throw new InvalidDatatypeException(prop.getProperty("datatype_msg"));
        }catch(Exception e2){System.out.println(e2);}
        	return false;
    	}
    
    return true;
	}

	//VALIDATION FOR YES & NO (Y/N)
	public boolean proValid(String str)
	{
		int len = str.length();
		if(len == 1)
		{
			if(str.equals("y") || str.equals("Y") || str.equals("n") || str.equals("N") )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else 
		{
			return false;
		}
	}

	//VALIDATION FOR WRONG PASSWORD
	public void wrongpass()
	{
		try
		{
		FileReader ob1 = new FileReader("C:\\Users\\Ansh\\Desktop\\project\\config\\constants\\exceptions.properties");
		
		prop.load(ob1);
		}catch(Exception e1){System.out.println(e1);}
		System.out.println("invalid password");
        try
        {
        	throw new WrongPasswordException(prop.getProperty("password_msg"));
        }catch(Exception e3){System.out.println(e3);}
		finally {System.exit(0);}
	}


	//VALIDATION FOR MAIN MENU INPUT
	public boolean switchcasevalidation(String number)
	{
		if(number.equals("0") || number.equals("1") || number.equals("2") || number.equals("3") || number.equals("4") || number.equals("5") )
		{
			return true;
		}
		else
		{
			System.out.println(" your input is out of range.\n\n enter again......");
			return false;
		}
	}
}	

//******************************************************************************************************
//		  										CLASS ENDS
//******************************************************************************************************