import java.util.Scanner;
public class Venue {
	String name;
	String city;
}
class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Venue obj=new Venue();
		System.out.println("Enter the venue name ");
		obj.name=sc.nextLine();
		System.out.println("Enter the city name ");
		obj.city=sc.nextLine();
		//close sc;
		System.out.println("Venue Details : ");
		System.out.println("Venue Name : "+obj.name);
		System.out.println("City Name : "+obj.city);
		//public void close()
		
	}
}