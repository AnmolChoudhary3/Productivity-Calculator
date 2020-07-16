//*************************************************************
//			PERCENTILE CLASS
//*************************************************************

//PACKAGE NAME
package com.ncu.processors;

//FILES IMPORTED
import java.util.*;
import java.io.*;

//CLASS STARTS................................................... 
public class percentile
{
	//ONLY FUNC OF CLASS
	public void percentilef(String username)
	{
		try
		{
		
		//login: 1
		//pro: 2
		//productivity_calculator: 3
		 

		File ob1 = new File("C:\\Users\\Ansh\\Desktop\\project\\text_files\\login_file.txt");
		FileReader fin1 = new FileReader(ob1);
        BufferedReader bin1= new BufferedReader(fin1);

        File ob2 = new File("C:\\Users\\Ansh\\Desktop\\project\\text_files\\pro.txt");
		
        File ob3 = new File("C:\\Users\\Ansh\\Desktop\\project\\text_files\\Productivity_Calculator.txt");


		FileWriter fout2 = new FileWriter(ob2);
        BufferedWriter bout2= new BufferedWriter(fout2);


        String str1,str2,str3;
        int index=0,sum=0;
        String[] arrstr1=null, arrstr2=null,arrstr3=null;
        while((str1=bin1.readLine())!=null)
        {
        	arrstr1=str1.split(",", 0);
        	//System.out.println("loop1");
        	FileReader fin2 = new FileReader(ob2);
       		 BufferedReader bin2= new BufferedReader(fin2);
        	//do
        	//{
        		str2=str1;
        		//System.out.println("loop 2 check");
        		arrstr2=str2.split(",",0);
        		//if(arrstr1[0].equals(arrstr2[0]))
        		//{
        			//System.out.println("if check");
        			//index=1;
        			//continue;
        		//}
        		//else
        		//{
        			index=0;
        			//System.out.println("else check");
        			if(index==0)
        			{
        				sum=0;
        				FileReader fin3 = new FileReader(ob3);
        				BufferedReader bin3= new BufferedReader(fin3);
        				while((str3=bin3.readLine())!=null)
        				{
        					arrstr3=str3.split(",",0);
        					if(arrstr1[0].equals(arrstr3[0]))
        					{
        						if(arrstr3[3].equals("y") || arrstr3[3].equals("Y"))
        						{
        							int hr = Integer.parseInt(arrstr3[2]);
        							sum=sum+hr;
        						}
        					}
        				}
        				bin3.close();
        	
        			 //System.out.println("write check");
        			 bout2.write(arrstr1[0] + "," + sum + ",");
        			 bout2.newLine();
        			}		
        		//}	
        	//}//while((String strc=bin2.readLine())!=null);
        	bin2.close();
        }
        //System.out.println("run hua");

        bout2.close();
        bin1.close();
        //bin2.close();
        //bin3.close();



        FileReader fin2 = new FileReader(ob2);
        BufferedReader bin2= new BufferedReader(fin2);

        float highest=0;
        String str_pro=null;
        String[] arrstr_pro=null;
        while((str_pro=bin2.readLine())!=null)
        {
        	arrstr_pro=str_pro.split(",", 0);
        	int hr2 = Integer.parseInt(arrstr_pro[1]);
        	if(hr2>highest)
        	{
        		highest=hr2;
        	}
        }
        bin2.close();
                
        FileReader fin_pro = new FileReader(ob2);
        BufferedReader bin_pro= new BufferedReader(fin_pro);
        float per;
        int user_hr=3;

        str_pro=null;
        arrstr_pro=null;
        while((str_pro=bin_pro.readLine())!=null)
        {
        	arrstr_pro=str_pro.split(",", 0);
        	if(arrstr_pro[0].equals(username))
        	{
        		user_hr = Integer.parseInt(arrstr_pro[1]);
        	}
        }

        
        per = (user_hr*100)/highest;
        System.out.print("Your Percentile Score: ");
        System.out.println(per);

        bin_pro.close();
    }catch(Exception e)
		{
			System.out.println(e);
		}    

	}

}

//******************************************************************************************************
//		  										CLASS ENDS
//******************************************************************************************************