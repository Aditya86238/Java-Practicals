import java.util.Scanner;

class sine { 
	public double fun(double angleDegrees) {				
		double angleRadians = Math.toRadians(angleDegrees);	
		double sineValue = Math.sin(angleRadians);
		return sineValue;
	}
}

class cos{
	public double fun(double angleDegrees) {
		double angleRadians = Math.toRadians(angleDegrees);		
		double cosineValue = Math.cos(angleRadians);		
		return cosineValue;
	}
}  

class tan {
	public double fun(double angleDegrees) {
	        double angleRadians = Math.toRadians(angleDegrees);
	        double tanValue = Math.tan(angleRadians);
	        return tanValue;
	    }
}

class add{
	public double fun(double a,double b)
	{
		return a+b;
	}
}

class sub {
	public double fun(double a,double b)
	{
		return a-b;
	}
}

class mul {
	public double fun(double a,double b)
	{
		return a*b;
	}
}

class div {
	public double fun(double a,double b)
	{
		if(b==0)
		{
			return 0;
		}
		return a/b;
	}
}

class square {
	public double fun(double a)
	{
		return a*a;
	}
}

class square_root {
	public double fun(double a)
	{
		double ans=Math.sqrt(a);
		return ans;
	}
}

class pow_of_ten{
	public double fun(double x)
	{
		double ans=Math.pow(10, x);
		return ans;
	}
}

class pow{
	public double fun(double x,double y)
	{
		double ans=Math.pow(x, y);
		return ans;
	}
}

class fact{
	public double fun(double n)
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		return n*fun(n-1);
	}
}

class cube {
	public double fun(double n)
	{
		return n*n*n;
	}
}

class cube_root{
	public double fun(double n)
	{
		double ans=Math.cbrt(n);
		return ans;
	}
}

class log {
	public double fun(double d)
	{
        if(d<=0)
        {
        	 System.out.println("error");
        	 return -1;
        }        
        double ans = Math.log(d);
       return ans;
	}
}

public class UpdatedEngineeringCalci {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" 1.sin	 2.cos	 3.tan");
		System.out.println(" 4.add	 5.sub	 6.mul");
		System.out.println(" 7.div	 8.sqre  9.sq root");
		System.out.println("10.10^x 11.x^y  12.n!");
		System.out.println("13.cube 14.cub root 15.log");
		System.out.println("-1.AC");
		System.out.println("-2.EXIT");
		
		boolean notset=true;
		double lastAns=0;
		int choice=s.nextInt();
		while(choice!=-2)
		{
			
			switch(choice)
			{
			case 1:
				sine obj1=new sine();
				if(notset)
				{
					double val1=s.nextDouble();
					lastAns=obj1.fun(val1);
					System.out.println("sin("+val1+") = "+lastAns);
					notset=false;
					break;
				}	
				else
				{
					double temp=lastAns;
					lastAns=obj1.fun(lastAns);
					System.out.println("sin("+temp+") = "+lastAns);
				}
				break;
				
			case 2:
				cos obj2=new cos();
				if(notset)
				{
					double val1=s.nextDouble();
					notset=false;
					lastAns=obj2.fun(val1);
					System.out.println("cos("+val1+") = "+lastAns);
				}
				else {
					double temp=lastAns;
					lastAns=obj2.fun(lastAns);
					System.out.println("cos("+temp+") = "+lastAns);
				}
				break;
				
			case 3:
				tan obj3=new tan();
				if(notset)
				{
					double val1=s.nextDouble();
					notset=false;
					lastAns=obj3.fun(val1);
					System.out.println("tan("+val1+") = "+lastAns);
				}
				else {
					double temp=lastAns;
					lastAns=obj3.fun(lastAns);
					System.out.println("tan("+temp+") = "+lastAns);
				}
				break;
				
			case 4:
				add obj4=new add();
				if(notset)
				{
					double val1=s.nextDouble();
					double val2=s.nextDouble();
					lastAns=obj4.fun(val1, val2);
					notset=false;
					System.out.println(val1+" + "+val2+" = "+lastAns);
				}
				else
				{
					double temp=lastAns;
					double val2=s.nextDouble();
					lastAns=obj4.fun(lastAns, val2);
					System.out.println(temp+" + "+val2+" = "+lastAns);
				}
				break;
				
			case 5:
				sub obj5=new sub();
				if(notset)
				{
					double val1=s.nextDouble();
					double val2=s.nextDouble();
					lastAns=obj5.fun(val1, val2);
					notset=false;
					System.out.println(val1+" - "+val2+" = "+lastAns);
				}
				else
				{
					double temp=lastAns;
					double val2=s.nextDouble();
					lastAns=obj5.fun(lastAns, val2);
					System.out.println(temp+" - "+val2+" = "+lastAns);
				}
				break;
				
			case 6:
				mul obj6=new mul();
				if(notset)
				{
					double val1=s.nextDouble();
					double val2=s.nextDouble();
					lastAns=obj6.fun(val1, val2);
					notset=false;
					System.out.println(val1+" * "+val2+" = "+lastAns);
				}
				else
				{
					double temp=lastAns;
					double val2=s.nextDouble();
					lastAns=obj6.fun(lastAns, val2);
					System.out.println(temp+" * "+val2+" = "+lastAns);
				}
				break;
				
			case 7:
				div obj7=new div();
				if(notset)
				{
					double val1=s.nextDouble();
					double val2=s.nextDouble();
					lastAns=obj7.fun(val1, val2);
					notset=false;
					System.out.println(val1+" / "+val2+" = "+lastAns);
				}
				else
				{
					double temp=lastAns;
					double val2=s.nextDouble();
					lastAns=obj7.fun(lastAns, val2);
					System.out.println(temp+" / "+val2+" = "+lastAns);
				}
				break;
				
			case 8:
				square obj8=new square();
				if(notset)
				{
					double val1=s.nextDouble();
					notset=false;
					lastAns=obj8.fun(val1);
					System.out.println("square("+val1+") = "+lastAns);
				}
				else {
					double temp=lastAns;
					lastAns=obj8.fun(lastAns);
					System.out.println("square("+temp+") = "+lastAns);
				}
				break;
				
			case 9:
				square_root obj9=new square_root();
				if(notset)
				{
					double val1=s.nextDouble();
					notset=false;
					lastAns=obj9.fun(val1);
					System.out.println("square root("+val1+") = "+lastAns);
				}
				else {
					double temp=lastAns;
					lastAns=obj9.fun(lastAns);
					System.out.println("square root("+temp+") = "+lastAns);
				}
				break;
				
			case 10:
				pow_of_ten obj10=new pow_of_ten();
				if(notset)
				{
					double val1=s.nextDouble();
					notset=false;
					lastAns=obj10.fun(val1);
					System.out.println("10^("+val1+") = "+lastAns);
				}
				else {
					double temp=lastAns;
					lastAns=obj10.fun(lastAns);
					System.out.println("10^("+temp+") = "+lastAns);
				}
				break;
				
			case 11:
				pow obj11=new pow();
				if(notset)
				{
					double val1=s.nextDouble();
					double val2=s.nextDouble();
					notset=false;
					lastAns=obj11.fun(val1,val2);
					System.out.println(val1+"^("+val2+") = "+lastAns);
				}
				else {
					double temp=lastAns;
					double val2=s.nextDouble();
					lastAns=obj11.fun(lastAns,val2);
					System.out.println(temp+"^("+val2+") = "+lastAns);
				}
				break;
				
			case 12:
				fact obj12=new fact();
				if(notset)
				{
					double val1=s.nextDouble();
					notset=false;
					lastAns=obj12.fun(val1);
					System.out.println("factorial("+val1+") = "+lastAns);
				}
				else {
					double temp=lastAns;
					lastAns=obj12.fun(lastAns);
					System.out.println("factorial("+temp+") = "+lastAns);
				}
				break;
				
			case 13:
				cube obj13=new cube();
				if(notset)
				{
					double val1=s.nextDouble();
					notset=false;
					lastAns=obj13.fun(val1);
					System.out.println("cube("+val1+") = "+lastAns);
				}
				else {
					double temp=lastAns;
					lastAns=obj13.fun(lastAns);
					System.out.println("cube("+temp+") = "+lastAns);
				}
				break;
				
			case 14:
				cube_root obj14=new cube_root();
				if(notset)
				{
					double val1=s.nextDouble();
					notset=false;
					lastAns=obj14.fun(val1);
					System.out.println("cube root("+val1+") = "+lastAns);
				}
				else {
					double temp=lastAns;
					lastAns=obj14.fun(lastAns);
					System.out.println("cube root("+temp+") = "+lastAns);
				}
				break;
				
			case 15:
				log obj15=new log();
				if(notset)
				{
					double val1=s.nextDouble();
					notset=false;
					lastAns=obj15.fun(val1);
					if(lastAns!=-1)
					{
					System.out.println("log("+val1+") = "+lastAns);
					}
				}
				else {
					double temp=lastAns;
					lastAns=obj15.fun(lastAns);
					if(lastAns!=-1)
					{
					System.out.println("log("+temp+") = "+lastAns);
					}
				}
				break;
				
			case -1:
				notset=true;
				break;
				
			case -2:
				return;
			}
			choice=s.nextInt();
			
		
		}
	}
	

}
