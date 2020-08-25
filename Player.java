import java.util.Scanner;
class Player
{
String name;
String country;
String skill;
}
class Main
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Player obj=new Player();
System.out.println("Enter the player name");
obj.name=sc.nextLine();
System.out.println("Enter the country name");
obj.country=sc.nextLine();
System.out.println("Enter the skill");
obj.skill=sc.nextLine();
System.out.println("Player Details : ");
System.out.println("Player Name : "+obj.name);
System.out.println("Country Name : "+obj.country);
System.out.println("Skill : "+obj.skill);
}}