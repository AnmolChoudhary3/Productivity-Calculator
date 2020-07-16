//*************************************************************
//          UPDATE CLASS
//*************************************************************

//PACKAGE NAME
package com.ncu.processors;

//FILES IMPORTED
import java.util.*;
import java.io.*;

//CLASS STARTS................................................... 
public class update
{
    //ONLY FUNC OF CLASS
	public void updatef(String username)
	{

		Scanner inn = new Scanner(System.in);
		System.out.print("\nEnter the serial no. of task to be updated: ");
		int no = inn.nextInt();
		System.out.println("\n\nEnter which attribute is to be updated ");
		System.out.println("1 -> Task");
		System.out.println("2 -> No. of hours");
		System.out.println("3 -> Productive or not");
        System.out.println("4 -> Essential or not \n");
        System.out.print("Enter your choice: ");
		int no2 = inn.nextInt();
        System.out.println("\n\n");

			
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


	    if(no2==1)
	    {	
	     		System.out.print("Enter new task name: ");
	     		inn.nextLine();
	     		String newtask = inn.nextLine();

	     	while((str=bin.readLine())!=null)
            {
            	arrstr=str.split(",", 0);
          		if(arrstr[0].equals(username))
            	{
            		i++;
            		if(i==no)
            		{
            			
            			bout1.write(username + "," + newtask + "," + arrstr[2] + "," + arrstr[3] + "," + arrstr[4] + ",");
            			bout1.newLine();
            			bout1.flush();
            			continue;
            		}
                	
            	}

            	bout1.write(str);
            	bout1.newLine();
            	bout1.flush();
            }
        }    
            
        if(no2==2)
	    {	
	     		System.out.print("Enter new no. of hrs: ");
	     		inn.nextLine();
	     		int newhr = inn.nextInt();

	     	while((str=bin.readLine())!=null)
            {
            	arrstr=str.split(",", 0);
          		if(arrstr[0].equals(username))
            	{
            		i++;
            		if(i==no)
            		{
            			
            			bout1.write(username + "," + arrstr[1] + "," + newhr + "," + arrstr[3] + ","  + arrstr[4] + ",");
            			bout1.newLine();
            			bout1.flush();		
            			continue;
            		}
                	
            	}

            	bout1.write(str);
            	bout1.newLine();
            	bout1.flush();
            }
        }


        if(no2==3)
	    {	
	     		System.out.print("Enter the new status of productivity: ");
	     		inn.nextLine();
	     		String newpro = inn.next();

	     	while((str=bin.readLine())!=null)
            {
            	arrstr=str.split(",", 0);
          		if(arrstr[0].equals(username))
            	{
            		i++;
            		if(i==no)
            		{
            			
            			bout1.write(username + "," + arrstr[1] + "," + arrstr[2] + "," + newpro + "," + arrstr[4] + ",");
            			bout1.newLine();
            			bout1.flush();		
            			continue;
            		}
                	
            	}

            	bout1.write(str);
            	bout1.newLine();
            	bout1.flush();
            }
        }



        if(no2==4)
        {   
                System.out.print("Enter the new status of essential or not: ");
                inn.nextLine();
                String newess = inn.next();

            while((str=bin.readLine())!=null)
            {
                arrstr=str.split(",", 0);
                if(arrstr[0].equals(username))
                {
                    i++;
                    if(i==no)
                    {
                        
                        bout1.write(username + "," + arrstr[1] + "," + arrstr[2] + ","+ arrstr[3] + "," + newess + "," );
                        bout1.newLine();
                        bout1.flush();      
                        continue;
                    }
                    
                }

                bout1.write(str);
                bout1.newLine();
                bout1.flush();
            }
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
       
            System.out.println("\n\nThe task is UPDATED...........\n");
        }catch(Exception e)
		{
			System.out.println(e);
		}

	}


}

//******************************************************************************************************
//                                              CLASS ENDS
//******************************************************************************************************