import java.util.Scanner;
class Delivery{
long over;
long ball;
long runs;
String batsman;
String bowler;
String nonStriker;
void displayDeliveryDetails()
{
System.out.println("Delivery Details :");
System.out.println("Over : "+over);
System.out.println("Ball : "+ball);
System.out.println("Runs : "+runs);
System.out.println("Batsman : "+batsman);
System.out.println("Bowler : "+bowler);
System.out.println("NonStriker : "+nonStriker);
}
}
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Delivery obj=new Delivery();
System.out.println("Enter the over");
obj.over=sc.nextLong();
System.out.println("Enter the ball");
obj.ball=sc.nextLong();
System.out.println("Enter the runs");
obj.runs=sc.nextLong();sc.nextLine();
System.out.println("Enter the batsman name");
obj.batsman=sc.nextLine();
System.out.println("Enter the bowler name");
obj.bowler=sc.nextLine();
System.out.println("Enter the nonStriker name");
obj.nonStriker=sc.nextLine();
obj.displayDeliveryDetails();
}}
