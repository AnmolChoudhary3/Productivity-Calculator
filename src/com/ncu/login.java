//*************************************************************
//      LOGIN CLASS
//*************************************************************

//PACKAGE NAME
package com.ncu;

//FILES IMPORTED
import com.ncu.exception.*;
import com.ncu.validators.*;
import java.util.*;
import java.io.*;

//CLASS STARTS................................................... 
public class login
{
  //ONLY FUNC OF CLASS
	public void loginf(String username, String password) {
			
		int i=0;
   
		try
		{
			
      File ob = new File("C:\\Users\\Ansh\\Desktop\\project\\text_files\\login_file.txt");
    	FileReader fin = new FileReader(ob);
	    BufferedReader bin= new BufferedReader(fin);

	      String str;
	      int flag=0;
	      String[] arrstr = null;

	     	while((str=bin.readLine())!=null)
		 	  {
            	arrstr=str.split(",", 0);
          		if(arrstr[0].equals(username))
          		{System.out.println("........................");
          			if(arrstr[1].equals(password))
          			{
          				System.out.println("Succesful Login\n........................");
          				flag=1;
          				break;
          				
          			}
          			else
          			{
          				validation obv = new validation();
                  obv.wrongpass();
          			}
      			}
      	} bin.close();

		 	  if(flag==0)
				{		 	  	
		 	 		System.out.println("\n\n Welcome " + username + "!\n\nyou have successfully SignUp \nNow you are registered member of our app\n");
     			File ob1 = new File("C:\\Users\\Ansh\\Desktop\\project\\text_files\\login_file.txt");
          FileWriter fout = new FileWriter(ob1,true);
          BufferedWriter bout= new BufferedWriter(fout);
          bout.write(username + "," + password + ",");
          bout.newLine();
          System.out.println("Hope you will have a wonderful experience using our App :)\n........................");
          bout.close();
        }
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

//******************************************************************************************************
//                          CLASS ENDS
//******************************************************************************************************