import java.util.Scanner;
class Venue1{
private String name;
private String city;
public String getname()
{
return name;
}
public void setname(String name)
{
this.name=name;
}
public String getcity()
{
return city;
}
public void setcity(String city)
{
this.city=city;
} 
}
class Main{
static void methprint(String name1,String city1){
System.out.println("Venue Details");
System.out.println("Venue Name : "+name1);
System.out.println("City Name : "+city1);

}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Venue1 obj=new Venue1();
System.out.println("Enter the venue name");
obj.setname(sc.nextLine());
String name=obj.getname();
System.out.println("Enter the city name");
obj.setcity(sc.nextLine());
String city=obj.getcity();
methprint(name,city);

while(true){
System.out.println("Menu"+"\n"+"1.Update Venue Name"+"\n"+"2.Update City Name"+"\n"+"3.All informations Correct/Exit"+"\n"+"Type 1 or 2 or 3");
int a=sc.nextInt();
switch(a)
{
case 1:
{

System.out.println("Enter the venue name");sc.nextLine();
name=sc.nextLine();
methprint(name,city);
break;
}
case 2:
{
System.out.println("Enter the city name");sc.nextLine();
city=sc.nextLine();
methprint(name,city);
break;
}
case 3:
{
methprint(name,city);
return;
//break;
}}
}}}

