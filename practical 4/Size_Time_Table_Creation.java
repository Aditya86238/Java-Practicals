package JavaLabAssignments;

import java.util.Scanner;

public class Size_Time_Table_Creation {
	
	public static String[] Generate_Random_Array(int n)
	{
		String str[]=new String[n];
		for(int i=0;i<str.length;i++)
		{

			str[i]="";
			for(int j=0;j<4;j++)
			{
//				try {
//					
//					Thread.sleep(1);
//				}
//				catch(InterruptedException e)
//				{
//					System.out.println("Thread Interrupted");
//				}
				long num=System.currentTimeMillis()%10;
				
				str[i]=str[i]+num;
			}
			for(int k=0;k<3;k++)
			{
//				try {
//					
//					Thread.sleep(1);
//				}
//				catch(InterruptedException e)
//				{
//					System.out.println("Thread Interrupted");
//				}
				long num=(System.currentTimeMillis()%26)+97;
				char ch=(char)num;
				str[i]=str[i]+ch;
			}
			for(int m=0;m<3;m++)
			{
//				try {
//					
//					Thread.sleep(1);
//				}
//				catch(InterruptedException e)
//				{
//					System.out.println("Thread Interrupted");
//				}
				long num=System.currentTimeMillis()%10;
				str[i]=str[i]+num;
			}
			
		}
		return str;
	}
	
	public static int Parse_Int_method(String str[])
	{
		String sub="";
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			sub=str[i].substring(7,10);
			int num=Integer.parseInt(sub);
			if(num<=50)
			{
				count++;
			}
		}
		return count;
	}
	
	public static int TypeCast_Method(String str[])
	{
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			char h=str[i].charAt(7);
			char t=str[i].charAt(8);
			char u=str[i].charAt(9);
			char ch='5';
			int a=(int)(ch);
			if(h!='0')
			{
				continue;
			}
			if((int)t<=a)
			{
				count++;
			}
		}
		return count;
	}
	
	public static int counting (String str[])
	{
		int new_count=0;
		for(int i=0;i<str.length;i++)
		{
			int h=Character.getNumericValue(str[i].charAt(7));
			int t=Character.getNumericValue(str[i].charAt(8));
			int u=Character.getNumericValue(str[i].charAt(9));
			int num=((100*h)+(10*t)+(u));
			if(num<=50)
			{
				new_count++;
			}
		}
		return new_count;
	}
	
	public static int getValidRegistrationsCount(String registrations[])
	{
		String sub="";
		
		int count=0;
		
		for(int i=0;i<registrations.length;i++)
		{
			if(registrations[i].length()!=10)
			{
				continue;
			}
			if(registrations[i].charAt(0)!='2'||registrations[i].charAt(1)!='0')
			{
				continue;
			}
			if(registrations[i].charAt(2)!='0'&&registrations[i].charAt(2)!='1'&&registrations[i].charAt(2)!='2')
			{
				continue;
			}
			if(registrations[i].charAt(2)=='2')
			{
				if(registrations[i].charAt(3)!='0'&&registrations[i].charAt(3)!='1'&&registrations[i].charAt(3)!='2'&&registrations[i].charAt(3)!='3'&&registrations[i].charAt(3)!='4')
				{
					continue;
				}
			}
			sub=registrations[i].substring(4,7);
			if(sub.contains("bcs")||sub.contains("bit")||sub.contains("bce")||sub.contains("bme"))
			{
				count++;
				continue;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//int n=s.nextInt();
		String A1000[]=new String[1000];
		String A5000[]=new String[5000];
		String A10000[]=new String[10000];
		//String A10000[]=new String[10000];
		//String A50000[]=new String[50000];
		
		A1000=Generate_Random_Array(1000);
		A5000=Generate_Random_Array(5000);
		A10000=Generate_Random_Array(10000);
		//A10000=Generate_Random_Array(10000);
		//A50000=Generate_Random_Array(50000);
		
		long start,end;
		long A1000_pm,A1000_tc,A5000_pm,A5000_tc,A10000_pm,A10000_tc;
		start=System.currentTimeMillis();
//		System.out.println(Parse_Int_method(A100));
		Parse_Int_method(A1000);
		end=System.currentTimeMillis();
		A1000_pm=end-start;
		
		start=System.currentTimeMillis();
//		System.out.println(TypeCast_Method(A100));
		TypeCast_Method(A1000);
		end=System.currentTimeMillis();
		A1000_tc=end-start;
		
		start=System.currentTimeMillis();
//		System.out.println(Parse_Int_method(A500));
		Parse_Int_method(A5000);
		end=System.currentTimeMillis();
		A5000_pm=end-start;
		
		start=System.currentTimeMillis();
//		System.out.println(TypeCast_Method(A500));
		TypeCast_Method(A5000);
		end=System.currentTimeMillis();
		A5000_tc=end-start;
		
		start=System.currentTimeMillis();
//		System.out.println(Parse_Int_method(A1000));
		Parse_Int_method(A10000);
		end=System.currentTimeMillis();
		A10000_pm=end-start;
		
		start=System.currentTimeMillis();
//		System.out.println(TypeCast_Method(A1000));
		TypeCast_Method(A10000);
		end=System.currentTimeMillis();
		A10000_tc=end-start;
		
//		System.out.println();
//		System.out.println();
		System.out.println("TABLE : ");	
		System.out.println();
		
		System.out.println("Approach\\Size\t | A1000 | A5000 | A10000 |");
		System.out.println("-------------------------------------------");
		System.out.println("ParseInt Method\t | "+A1000_pm+"\t | "+A5000_pm+"\t | "+A10000_pm+"\t  |");
		System.out.println("\t\t |  \t | \t | \t  |");
		System.out.println("TypeCast Method\t | "+A1000_tc+"\t | "+A5000_tc+"\t | "+A10000_tc+"\t  |");
		
	}

}
