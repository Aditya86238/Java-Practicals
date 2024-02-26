
import java.util.Scanner;

class add{
	public static double add(double a,double b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(add(a,b));
		
	}
}

class cos{
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double angleDegrees = scanner.nextDouble();

	        double angleRadians = Math.toRadians(angleDegrees);

	        double cosineValue = Math.cos(angleRadians);

	        System.out.println(cosineValue);

	    }
}  

class cube {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double d=s.nextDouble();
		double ans=d*d*d;
		System.out.println(ans);

	}


}

class div {
	public static double divi(double a,double b)
	{
		if(b==0)
		{
			return 0;
		}
		return a/b;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		double c=divi(a,b);
		if(c==0)
		{
			System.out.println("error");
		}
		else
		{
			System.out.println(c);
		}
		
	}

}

class log {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double d = scanner.nextDouble();
        if(d>0)
        {
        double ans = Math.log(d);
        System.out.println(ans);
        }
        else {
        System.out.println("error");
        }
        
    }

}

class mul {
	public static double multi(double a,double b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(multi(a,b));
		
	}

}

class sine {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double angleDegrees = scanner.nextDouble();

	        double angleRadians = Math.toRadians(angleDegrees);

	        double sineValue = Math.sin(angleRadians);

	        System.out.println(sineValue);

	    }
	}

class square_root {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		double n=s.nextDouble();
		double ans=Math.sqrt(n);
		System.out.println(ans);
	}

}

class square {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double d=s.nextDouble();
		double ans=d*d;
		System.out.println(ans);

	}

}

class sub {
	
	public static double sub(double a,double b)
	{
		return a-b;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(sub(a,b));
		
	}

}

class tan {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double angleDegrees = scanner.nextDouble();

	        double angleRadians = Math.toRadians(angleDegrees);

	        double tanValue = Math.tan(angleRadians);

	        System.out.println(tanValue);

	    }

}


