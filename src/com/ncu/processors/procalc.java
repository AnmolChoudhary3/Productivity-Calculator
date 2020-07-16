//*************************************************************
//      PRODUCTIVITY CALCULATOR CLASS (PROCLAC)
//*************************************************************

//PACKAGE NAME
package com.ncu.processors;

//FILES IMPORTED
import java.io.*;

//CLASS STARTS................................................... 
public class procalc
{
  //ONLY FUNC OF CLASS
	public void procalcf(String username)
	{

		try
		{
      int totalp=0;

			File ob = new File("C:\\Users\\Ansh\\Desktop\\project\\text_files\\Productivity_Calculator.txt");
      FileReader fin = new FileReader(ob);
	    BufferedReader bin= new BufferedReader(fin);

	    String str;
	    int i=0;
	    String[] arrstr = null;

	    while((str=bin.readLine())!=null)
		 	 {
          arrstr=str.split(",", 0);
          if(arrstr[0].equals(username))
          {
          	if(arrstr[3].equals("y") || arrstr[3].equals("Y" ))
          	{
          		int hr = Integer.parseInt(arrstr[2]);
          		i = i + hr; 
      			}
      		} 
		 	  } bin.close();

		 	totalp=i;

		 	System.out.println("\nNo. of Productive hrs: " + i);

		 		i=0;
        int totaln=0;
        FileReader fin2 = new FileReader(ob);
	     	BufferedReader bin2= new BufferedReader(fin2);
	     	  
	     	while((str=bin2.readLine())!=null)
		 	{

            	arrstr=str.split(",", 0);
          		if(arrstr[0].equals(username))
          		{
          			if(arrstr[3].equals("n") || arrstr[3].equals("N"))
          			{
          				int hr = Integer.parseInt(arrstr[2]);
          				i = i + hr; 
      				  }
      			  }
		 	} bin2.close();


      totaln=i;
		 	System.out.println("No. of Non Productive hrs: " + i);
		 	System.out.println();

      int total = totalp + totaln;
      if(total>24)
      {
        System.out.println("\nLooks like you have added task for more than a day...  Pls REMOVE! few tasks\n");
      }



//3. prdouctive and essential
		 		i=0;
		 	
        FileReader fin3 = new FileReader(ob);
	     	BufferedReader bin3= new BufferedReader(fin3);
	     	  
	     	while((str=bin3.readLine())!=null)
		 	{

            	arrstr=str.split(",", 0);
          		if(arrstr[0].equals(username))
          		{
          			if(arrstr[3].equals("y") || arrstr[3].equals("Y"))
          			{
          				if(arrstr[4].equals("y") || arrstr[4].equals("Y"))
          				{
          					int hr = Integer.parseInt(arrstr[2]);
          					i = i + hr;
          				} 
      				}
      			} 
		 	} bin3.close();

		 	System.out.println("No. of Productive and Essential hrs: " + i);




//4. prdouctive and non essential
		 		i=0;

		 	
        	FileReader fin4 = new FileReader(ob);
	     	BufferedReader bin4= new BufferedReader(fin4);
	     	  
	     	while((str=bin4.readLine())!=null)
		 	{

            	arrstr=str.split(",", 0);
          		if(arrstr[0].equals(username))
          		{
          			if(arrstr[3].equals("y") || arrstr[3].equals("Y"))
          			{
          				if(arrstr[4].equals("n") || arrstr[4].equals("N"))
          				{
          					int hr = Integer.parseInt(arrstr[2]);
          					i = i + hr;
          				} 
      				}
      			} 
		 	} bin4.close();

		 	System.out.println("No. of Productive and NON Essential hrs: " + i);





//5. non prdouctive but essential
		 		i=0;

		 	
        	FileReader fin5 = new FileReader(ob);
	     	BufferedReader bin5= new BufferedReader(fin5);
	     	  
	     	while((str=bin5.readLine())!=null)
		 	{

            	arrstr=str.split(",", 0);
          		if(arrstr[0].equals(username))
          		{
          			if(arrstr[3].equals("n") || arrstr[3].equals("N"))
          			{
          				if(arrstr[4].equals("y") || arrstr[4].equals("Y"))
          				{
          					int hr = Integer.parseInt(arrstr[2]);
          					i = i + hr;
          				} 
      				}
      			} 
		 	} bin5.close();

		 	System.out.println("No. of Non Productive but Essential hrs: " + i);




//6. non prdouctive and NON essential
		 		i=0;

		 	
        	FileReader fin6 = new FileReader(ob);
	     	BufferedReader bin6= new BufferedReader(fin6);
	     	  
	     	while((str=bin6.readLine())!=null)
		 	{

            	arrstr=str.split(",", 0);
          		if(arrstr[0].equals(username))
          		{
          			if(arrstr[3].equals("n") || arrstr[3].equals("N"))
          			{
          				if(arrstr[4].equals("n") || arrstr[4].equals("N"))
          				{
          					int hr = Integer.parseInt(arrstr[2]);
          					i = i + hr;
          				} 
      				}
      			} 
		 	} bin6.close();

		 	System.out.println("No. of Non Productive and Non Essential hrs: " + i);
		 	System.out.println();
      System.out.println("\n\n PRO TIPS!:\n");
      System.out.println(" ->  Make Non Productive Non essential task completely ZERO.");
      System.out.println(" ->  if you still think that you need more time try to reduce productive but non essential work\n ");
      System.out.println("            - Time isn't the main thing. It is the only thing. ");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

//******************************************************************************************************
//                          CLASS ENDS
//******************************************************************************************************