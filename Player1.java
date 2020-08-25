import java.util.Scanner;
class Player1{
String name;
String country;
String skill;
}
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Player1 obj=new Player1();
System.out.println("Enter the player details");
String str=sc.nextLine();
String[] arr=str.split(",",5);
obj.name=arr[0];
obj.country=arr[1];
obj.skill=arr[2];
System.out.println("Player Details : ");
System.out.println("Player Name : "+obj.name);
System.out.println("Country Name : "+obj.country);
System.out.println("Skill : "+obj.skill);}}




























