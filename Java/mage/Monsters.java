package Java.mage;

public class Monsters {

    String name;
    int HP;
    
public Monsters(String name){

    this.name = name;
    this.HP = 100;

}
public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
@Override
public String toString(){
    return "Monster\n---------------\n[Name: "+name+"\n"+"[HP: "+HP+"\n";
}
}