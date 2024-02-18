package JavaLabAssignments;

import java.util.Scanner;

public class isPrime {
	
	public static long[] generate_random_Array()
	{
		
		long arr[]=new long[1000000];
		for(int i=0;i<arr.length;i++)
		{
//			try {
//			
//			Thread.sleep(1);
//			}
//		catch(InterruptedException e)
//		{
//			System.out.println("Thread Interrupted");
//		}
			long e1=System.currentTimeMillis()%10;
			long e2=System.currentTimeMillis()%10;
			long e3=System.currentTimeMillis()%10;
			long e4=System.currentTimeMillis()%10;
			long e5=System.currentTimeMillis()%10;
			long e6=System.currentTimeMillis()%10;
			long e7=System.currentTimeMillis()%10;
			arr[i]=(long)((1000000*e1)+(100000*e2)+(10000*e3)+(1000*e4)+(100*e5)+(10*e6)+(e7));
//			System.out.println(arr[i]);
		}
		return arr;
	}
	public static boolean IsPrime(long n)
	{
		boolean b=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean Is_NonPrime(long n)
	{
		boolean b=false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return true;
			}
		}
		return false;
	}
	
	public static int TotalPrime(long arr[])
	{
		int Total_Prime=0,non_prime=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(IsPrime(arr[i]))
			{
				Total_Prime++;
			}
			else {
				non_prime++;
			}
		}
//		System.out.println("total non prime : "+non_prime);
		return Total_Prime;
	}
	
	public static int Total_Non_prime(long arr[])
	{
		int Total_Prime=0,non_prime=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(Is_NonPrime(arr[i]))
			{
				non_prime++;
			}
			else 
			{
				Total_Prime++;
			}
		}
//		System.out.println("total non prime : "+non_prime);
		return non_prime;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long arr[]=generate_random_Array();
		
		long start,end;
		start=System.currentTimeMillis();
		System.out.println("total prime : "+TotalPrime(arr));
		end=System.currentTimeMillis();
		System.out.println("time required for prime: "+(end-start));
		
		start=System.currentTimeMillis();
		System.out.println("total non prime : "+Total_Non_prime(arr));
		end=System.currentTimeMillis();
		System.out.println("time required for non prime: "+(end-start));
	}

}
