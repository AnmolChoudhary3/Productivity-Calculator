//*************************************************************
//          REMOVE CLASS
//*************************************************************

//PACKAGE NAME
package com.ncu.processors;

//FILES IMPORTED
import java.util.*;
import java.io.*;

//CLASS STARTS................................................... 
public class remove
{
    //ONLY FUNC OF CLASS
	public void removef(String username)
	{
			Scanner inn = new Scanner(System.in);
			System.out.print("Enter the serial no. of task: ");
			int no = inn.nextInt();

			

			try
			{
			File ob = new File("C:\\Users\\Ansh\\Desktop\\project\\text_files\\Productivity_Calculator.txt");
                        
        	FileReader fin = new FileReader(ob);
	     	BufferedReader bin= new BufferedReader(fin);

            //for temp file
            File ob1 = new File("C:\\Users\\Ansh\\Desktop\\project\\text_files\\temp.txt");
            FileWriter fout1 = new FileWriter(ob1);
            BufferedWriter bout1= new BufferedWriter(fout1);

            
	     	int i=0;
	     	String str;
	     	String[] arrstr = null; 
	     	while((str=bin.readLine())!=null)
            {
            	arrstr=str.split(",", 0);
          		if(arrstr[0].equals(username))
            	{
            		i++;
            		if(i==no)
            		{
            			continue;
            		}
                	
            	}

            	bout1.write(str);
            	bout1.newLine();
            	bout1.flush();
            }
            FileReader fin1 = new FileReader(ob1);
            BufferedReader bin1= new BufferedReader(fin1);

            FileWriter fout = new FileWriter(ob);
            BufferedWriter bout= new BufferedWriter(fout);
            
            String str2;
            while((str2=bin1.readLine())!=null)
            {
            	bout.write(str2);
            	bout.newLine();
            	bout.flush();
            }
            
            bin.close();
            bout.close();
            bin1.close();
            bout1.close();
       
            System.out.println("\n\nThe task is REMOVED.......\n");


        }catch(Exception e)
		{
			System.out.println(e);
		}

	}


}

//******************************************************************************************************
//                                              CLASS ENDS
//******************************************************************************************************