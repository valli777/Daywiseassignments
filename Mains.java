package pack2;
import pack1.*;
import java.util.Scanner;
public class Mains{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Delivery1 obj=new Delivery1();
System.out.println("Enter the over");
obj.setover(sc.nextLong());
long over=obj.getover();
System.out.println("Enter the ball");
obj.setball(sc.nextLong());
long ball=obj.getball();
System.out.println("Enter the runs");
obj.setruns(sc.nextLong());
long runs=obj.getruns();
System.out.println("Enter the batsman name");sc.nextLine();
obj.setbatsman(sc.nextLine());
String batsman=obj.getbatsman();
System.out.println("Enter the bowler name");
obj.setbowler(sc.nextLine());
String bowler=obj.getbowler();
System.out.println("Enter the nonStriker name");
obj.setnonStriker(sc.nextLine());
String nonStriker=obj.getnonStriker();
Delivery1 obj1=new Delivery1(over,ball,runs,batsman,bowler,nonStriker);
}}