
public class Complex {
	private int a;
	private int b;
	private int real;
	private int img;
	
	Complex(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	private void display()
	{
		if(img>=0)
		{
			System.out.print(real+"+i"+img);
		}
		else {
			System.out.print(real+"-i"+(-img));
		}
		System.out.println();
	}
	
	public void add(Complex C)
	{
		real=this.a+C.a;
		img=this.b+C.b;
		System.out.print("Addition is : ");
		display();
	}
	
	public void sub(Complex C)
	{
		real=this.a-C.a;
		img=this.b-C.b;
		System.out.print("Subtraction is : ");
		display();
	}
	
	public void mul(Complex C)
	{
		real=((a*C.a)-(b*C.b));
		img=((a*C.b)+(b*C.a));
		System.out.print("Multiplication is : ");
		display();
	}
	
	public void print()
	{
		System.out.print("Complex Representation : ");
		if(b>=0)
		{
			System.out.print(a+"+i"+b);
		}
		else {
			System.out.print(a+"-i"+(-b));
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Complex c1=new Complex(-3,5);
		Complex c2=new Complex(-5,-7);
		
		c1.print();
		c2.print();
		c1.add(c2);
		c1.sub(c2);
		c1.mul(c2);
		
	}
	

}
