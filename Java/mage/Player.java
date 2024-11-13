package Java.mage;
public class Player
/*Create your player stats */
{
    String name;
    int HP;
    int MP;
    //int playerStats;
    

public Player() //,int playerStats)
{
    this.name = "Mage";
    this.HP = 100;
    this.MP = 100;

    //this.playerStats = playerStats;
}
@Override
public String toString(){
    return "[Player\n[Name: "+name+"\n"+ "[HP: "+HP+"\n"+"[MP: "+MP+"\n";
}
}
