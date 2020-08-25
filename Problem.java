package pack4;
import pack3.*;
import java.util.Scanner;
public class Problem{
public static void main(String args[]){
Wicket obj=new Wicket();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of wickets");
int val=sc.nextInt();
String[] str=new String[val];
for(int i=0;i<val;i++)
{
System.out.println("Enter the details of wicket "+(i+1));if(i==0){sc.nextLine();}
str[i]=sc.nextLine();
}
System.out.println("Wicket Details");

for(int i=0;i<val;i++)
{
String[] arr=str[i].split(",",5);
obj.setover(Long.parseLong(arr[0]));
long over=obj.getover();
obj.setball(Long.parseLong(arr[1]));
long ball=obj.getball();
obj.setwicketType(arr[2]);
String wicketType=obj.getwicketType();
obj.setplayerName(arr[3]);
String playerName=obj.getplayerName();
obj.setbowlerName(arr[4]);
String bowlerName=obj.getbowlerName();
Wicket obj1=new Wicket(over,ball,wicketType,playerName,bowlerName);
}}}


