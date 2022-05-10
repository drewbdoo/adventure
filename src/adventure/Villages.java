package adventure;

import javax.swing.*;
import java.util.Scanner;

public class Villages {
    private Player player;
    private Taverns tavern;
    private String fGuild;
    private String mGuild;
    private String tGuild;
    private String townName;

    public Villages(Player player, Taverns tavern, String fGuild, String mGuild,
                   String tGuild, String townName){
        this.player = player;
        this.tavern = tavern;
        this.fGuild = fGuild;
        this.mGuild = mGuild;
        this.tGuild = tGuild;
        this.townName = townName;
    }

    public void locationChoice(){
        Scanner scanner = new Scanner(System.in);
        Boolean loopVar = true;
        do {
            JOptionPane.showMessageDialog(null, "Welcome to " + townName + ", " + player.getName());
            String location = JOptionPane.showInputDialog(null, "Where to next?" + "\n" +
                    "For the " + tavern + ", select 1," + "\n" +
                    "For the " + fGuild + ", Select 2," + "\n" +
                    "For the " + mGuild + ", Select 3" + "\n" +
                    "For the " + tGuild + ", Select 4" + "\n" +
                    "To camp for the evening, Select 5" + "\n" +
                    "To check your player stats, Select 6" + "\n");
            if ((location.equalsIgnoreCase("2")) && (player.getType().equalsIgnoreCase("fighter"))) {
                System.out.println("\n" + "Going to the " + fGuild + "\n");
                loopVar = false;

                Village.fighterGuild(player);
            } else if ((location.equalsIgnoreCase("2")) && (!(player.getType().equalsIgnoreCase("fighter")))) {
                System.out.println("\n" + "Only fighters are allowed in the fighter's guild. Select again" + "\n");
            } else if (location.equalsIgnoreCase("1")) {
                System.out.println("\n" + "Going to the " + tavern + "\n");
                loopVar = false;
                Village.theInn(player);
            } else if (location.equalsIgnoreCase("3")) {
                System.out.println("\n" + "Going to the " + mGuild + "\n");
                loopVar = false;
                Village.library(player);
            } else if (location.equalsIgnoreCase("4") && (!player.getType().equalsIgnoreCase("rogue"))) {
                System.out.println("\n" + "Only rogues are allowed in the " + tGuild + "\n");
            } else if (location.equalsIgnoreCase("4")) {
                System.out.println("\n" + "Going to the " + tGuild + "\n");
                loopVar = false;
                Village.thievesGuild(player);
            } else if (location.equalsIgnoreCase("5")) {
                System.out.println("\n" + "You camp out in the woods for the evening" + "\n");
                System.out.println("Thanks for playing Adventure");
                System.exit(0);
            } else if(location.equalsIgnoreCase("6")){
                System.out.println("\n" + "Your current Strength is" + player.skills[0]);
                System.out.println("Your current Dexterity is" + player.skills[1]);
                System.out.println("Your current Intelligence is" + player.skills[2]);
                System.out.println("Your current Charisma is" + player.skills[3]);
            } else {
                System.out.println("\n" + "That is not an option, idiot. Try again." + "\n");
            }
        } while (loopVar);


        }
    public String getTownName(){
        return townName;
    }






}
