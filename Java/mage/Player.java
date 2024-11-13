package Java.mage;
public class Player
/*Create new player*/
{
    String name;
    int HP;
    int MP;
    //int playerStats;
    

public Player() //playerStats
{
    this.name = "Mage";
    this.HP = 100;
    this.MP = 100;

    //this.playerStats = playerStats;
}
public Player(String name){
    this.name = name;
    this.HP = 100;
    this.MP = 100;
}

//Set player name
public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}

@Override
public String toString(){
    return "\nPlayer\n---------------\n[Name: "+name+"\n"+ "[HP: "+HP+"\n"+"[MP: "+MP+"\n";
}
}
