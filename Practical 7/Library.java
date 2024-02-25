
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private String name;
	private String roll;
	private List<Book> books=new ArrayList<Book>();
		
	public Student(String name,String roll)
	{
		this.name=name;
		this.roll=roll;
	}
	public String getName() {
		return name;
	}
	public String getRoll() {
		return roll;
	}
	public void ApplyNewBook(Book b)
	{
		books.add(b);
		System.out.println("Book Added...");
	}
	public void returnBook(String name,String author)
	{
		for(int i=0;i<books.size();i++)
		{
			if(books.get(i).getName().equals(name)&&books.get(i).getAuthor().equals(author))
			{
				books.remove(i);
				books.get(i).setIsReturned(true);
				System.out.println("Book Returned...");
				return;
			}
		}
		System.out.println("Book Not Found...");
	}
	public void DisplayCurrentBooks()
	{
		for(Book ele:books)
		{
			System.out.println("Book name : "+ele.getName());
			System.out.println("Author : "+ele.getAuthor());
		}
		System.out.println();
	}
	public void TotalFine(String name,String author,int days)
	{
		for(int i=0;i<books.size();i++)
		{
			if(books.get(i).getName().equals(name)&&books.get(i).getAuthor().equals(author))
			{
				System.out.println("Total fine for Book "+books.get(i).getName()+" is: RS"+days*2);
				return;
			}
		}
		System.out.println("Book Not Found...");
	}
	public void DisplayBookStatus(String name,String author)
	{
		for(int i=0;i<books.size();i++)
		{
			if(books.get(i).getName().equals(name)&&books.get(i).getAuthor().equals(author))
			{
				if(!books.get(i).getIsReturned())
				{
					System.out.println("Status : Not Returned");
				}
				return;
			}
		}
		System.out.println("Status : Returned");
	}
	 	
}
//	
// class teacher {
//		private String name;
//		private String subject;
//		
//		public teacher(String name,String subject)
//		{
//			this.name=name;
//			this.subject=subject;
//		}
//		public String getName() {
//			return name;
//		}
//		public String getSubject() {
//			return subject;
//		}
//
//		
//	}

class Book {
		private String name;
		private String author;
		private boolean isReturned=false;
		private int dates=0;
		
		public Book(String name,String author)
		{
			this.name=name;
			this.author=author;
		}
		public String getAuthor() {
			return author;
		}
		public String getName() {
			return name;
		}
		public int getDateIssued() {
			return dates;
		}
		public void setDateIssued(int dates) {
			this.dates = dates;
		}
		public boolean getIsReturned()
		{
			return isReturned;
		}
		public void setIsReturned(boolean b)
		{
			isReturned=b;
		}
		
		
	}
	
	
public class Library {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		Student s1=new Student("adi","2022bit029");
//		System.out.println(s1.getName());
//		System.out.println(s1.getRoll());
//		
//		Book b1=new Book("Revolution 2020","Chetan Bhagat");
//		Book b2=new Book("River Sutra","Geeta Mehta");
//		
//		s1.ApplyNewBook(b1);
//		s1.ApplyNewBook(b2);
//		
//		s1.DisplayCurrentBooks();
//		s1.returnBook(b2);
//		s1.DisplayCurrentBooks();
//		s1.TotalFine(b2, 20);
		Student s1=new Student("adi","2022bit029");
		System.out.println("1.apply for new book");
		System.out.println("2.Return Book");
		System.out.println("3.Display current Books");
		System.out.println("4.total fine for book");
		System.out.println("5.Book Status");
		System.out.println("6.Exit");
		
		int a=s.nextInt();
		while(a!=6)
		{
			
			switch(a)
			{
				case 1:
					System.out.println("enter book name");
					String nam=s.next();
					System.out.println("enter Author name");
					String aut=s.next();
					Book b1=new Book(nam,aut);
					s1.ApplyNewBook(b1);
					break;
					
				case 2:
					System.out.println("enter book name");
					String na=s.next();
					System.out.println("enter Author name");
					String au=s.next();
					s1.returnBook(na,au);
					break;
				
				case 3:
					System.out.println("Displaying...");
					s1.DisplayCurrentBooks();
					break;
					
				case 4:
					System.out.println("enter book name");
					String nam1=s.next();
					System.out.println("enter Author name");
					String aut1=s.next();
					System.out.println("enter total days after issue of book");
					int day=s.nextInt();
					s1.TotalFine(nam1,aut1,day);
					break;
					
				case 5:
					System.out.println("enter book name");
					String nam2=s.next();
					System.out.println("enter Author name");
					String aut2=s.next();
					s1.DisplayBookStatus(nam2, aut2);
					break;
					
				case 6:
					return ;
			}
			a=s.nextInt();
		}
		
	}

}
