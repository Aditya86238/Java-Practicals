
public class divide {
	private int a;
	private int b;
	private int c;
	private int rem;

		public divide(int a,int b) throws DivideByZero
		{
			this.a=a;
			this.b=b;
			if(b==0)
			{
				DivideByZero e =new DivideByZero();
				throw e;
			}
		}
		
		public void display()
		{
			c=a/b;
			if(c==0)
			{
				System.out.println(a+"\u2143"+b);
			}
			else
			{
				rem=a%b;
				System.out.println(c+"\u2143"+rem+"\u2143"+b);
			}
				
		}
			

	public static void main(String[] args) throws DivideByZero {
		divide d1=new divide(5,8);
		d1.display();

	}

}
