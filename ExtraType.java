import java.util.Scanner;
class ExtraType{
private String name;
private long runs;
public String getname()
{
return name;
}
public void setname(String name)
{
this.name=name;
}
public long getruns()
{
return runs;
}
public void setruns(long runs)
{
this.runs=runs;
} 
}
class Main{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
ExtraType obj=new ExtraType();
System.out.println("Enter the extratype details");//sc.nextLine();
String str=sc.nextLine();
String[] arr=str.split("#",2);
obj.setname(arr[0]);
String name=obj.getname();

obj.setruns(Long.parseLong(arr[1]));
long runs=obj.getruns();
System.out.println("ExtraType Details"+"\n"+"Extra Type: "+name+"\n"+"Runs: "+runs);}}

