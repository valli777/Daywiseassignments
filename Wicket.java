package pack3;
public class Wicket{
private long over;
private long ball;

private String wicketType;
private String playerName;
private String bowlerName;
public Wicket(long over,long ball,String wicketType,String playerName,String bowlerName)
{
 System.out.println("Over : "+over+"\n"+"Ball : "+ball+"\n"+"Wicket Type : "+wicketType+"\n"+"Player Name : "+playerName+"\n"+"Bowler Name : "+bowlerName+"\n");
}
public Wicket(){}
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

public String getwicketType()
{
return wicketType;
}
public void setwicketType(String wicketType)
{
this.wicketType=wicketType;
}
public String getplayerName()
{
return playerName;
}
public void setplayerName(String playerName)
{
this.playerName=playerName;
}
public String getbowlerName()
{
return bowlerName;
}
public void setbowlerName(String bowlerName)
{
this.bowlerName=bowlerName;
}
}