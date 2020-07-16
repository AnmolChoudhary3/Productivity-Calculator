//*************************************************************
//          DISPLAY CLASS
//*************************************************************

//PACKAGE NAME
package com.ncu.processors;

//FILES IMPORTED
import java.util.*;
import java.io.*;

//CLASS STARTS................................................... 
public class display
{
    //ONLY FUNC OF CLASS
	public void displayf(String username)
	{
		try
		{

			File ob = new File("C:\\Users\\Ansh\\Desktop\\project\\text_files\\Productivity_Calculator.txt");
        	 FileReader fin = new FileReader(ob);
	     	 BufferedReader bin= new BufferedReader(fin);
			
            String str;
            String [] arrstr;
            int i=1;
            System.out.println("Sno.     Task        Hours   Productive or Not  Essential or Not");
            while((str=bin.readLine())!=null)
            {
            	
            	arrstr=str.split(",", 0);
          		if(arrstr[0].equals(username))
            	{
            		System.out.println(" " + i + ".       " + arrstr[1] + "          " + arrstr[2] + "           " + arrstr[3] + "                " + arrstr[4]);
            		i++;
            	}
            }


		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

//******************************************************************************************************
//                                              CLASS ENDS
//******************************************************************************************************