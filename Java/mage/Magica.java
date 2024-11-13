package Java.mage;
import java.util.Scanner;
import java.io.File;
/*Fictional game for magic lovers */

public class Magica 
{  
     /*Create function to enable users to create a player and enter
    in stats(HP, str, mana, def) for that player and create a name for the player. Should be able to save changes.
    */ 

    // createName scanner for entering in player name
    

    // newPlayer for entering in stats. 
    /*new players are given 10 stat points.*/
    Player newPlayer;
    

public static void main(String[] args)
{
    //Write a text file to save player info.
    // Created text file updated with player.
    Scanner sc = new Scanner(System.in);
    Player newPlayer = new Player();
    System.out.println("Enter your Player's name.");
    newPlayer.name = sc.nextLine();   
    System.out.println(newPlayer);
}

}
