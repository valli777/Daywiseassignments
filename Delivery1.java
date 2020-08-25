package pack1;
public class Delivery1{
private long over;
private long ball;
private long runs;
private String batsman;
private String bowler;
private String nonStriker;
public Delivery1(long over,long ball,long runs,String batsman,String bowler,String nonStriker)
{
 System.out.println("Over : "+over+"\n"+"Ball : "+ball+"\n"+"Runs : "+runs+"\n"+"Batsman : "+batsman+"\n"+"Bowler : "+bowler+"\n"+"NonStriker : "+nonStriker+"\n");
}
public Delivery1(){}
public long getover()
{
return over;
}
public void setover(long over)
{
this.over=over;
}
public long getball()
{
return ball;
}
public void setball(long ball)
{
this.ball=ball;
}
public long getruns()
{
return runs;
}
public void setruns(long runs)
{
this.runs=runs;
}
public String getbatsman()
{
return batsman;
}
public void setbatsman(String batsman)
{
this.batsman=batsman;
}
public String getbowler()
{
return bowler;
}
public void setbowler(String bowler)
{
this.bowler=bowler;
}
public String getnonStriker()
{
return nonStriker;
}
public void setnonStriker(String nonStriker)
{
this.nonStriker=nonStriker;
}
}