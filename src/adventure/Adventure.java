package adventure;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Adventure {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = JOptionPane.showInputDialog("Welcome to the world of Adventure" + "\n" + "What would you like to be called?");
        String answer = JOptionPane.showInputDialog("Would you like to go on an adventure " + name + "?");
         if (answer.equalsIgnoreCase("yes")) {
            JOptionPane.showMessageDialog(null, "Sweet!");
            } else {
            JOptionPane.showMessageDialog(null, "Well fuck off then!!!" );
             System.exit(0);
        }
        String weapon;
        String arch;
        int skills[] = new int[4];
        //Skills [0] = Strength
        //Skills [1] = Dexterity
        //Skills [2] = Intelligence
        //Skills [3] = Charisma

        String type = JOptionPane.showInputDialog("Would you like to be a fighter, a mage, or a rogue?");
        // System.out.println("Would you like to be a fighter, mage, or rogue?");
        // String type = scanner.nextLine();
        if (type.equalsIgnoreCase("fighter")) {
            weapon = "sword";
            arch = "Fighter";
            skills[0] = 5; //Str
            skills[1] = 4; //Dex
            skills[2] = 1; //Int
            skills[3] = 2; //Cha 

        } else if (type.equalsIgnoreCase("mage")) {
            weapon = "staff";
            arch = "Mage";
            skills[0] = 2; //Str
            skills[1] = 3; //Dex
            skills[2] = 5; //Int
            skills[3] = 3; //Cha

        } else {
            weapon = "dagger";
            arch = "Rogue";
            skills[0] = 2; //Str
            skills[1] = 4; //Dex
            skills[2] = 2; //Int
            skills[3] = 4; //Cha
        }
        JOptionPane.showMessageDialog(null, "Splendid!" + "\n" + "You are now a " + arch + " and your chosen weapon is a " + weapon);
        JOptionPane.showMessageDialog(null, "Your starting stats are:" + "\n" + 
        "Strength:" + skills[0] + "\n" + 
        "Dexterity:" + skills[1] + "\n" +
        "Intelligence:" + skills[2] + "\n" +
        "Charisma" + skills[3]);
        Player player = new Player(name, arch, weapon, skills);
choice(player);
//        Player player = new Player(name, arch, weapon, skills);
//        Taverns Dragon = new Taverns(player, "Dragon's Den Inn", "Big Al");
//        MageGuild FireFox = new MageGuild(player, "Merlin", "FireFoxes", 34, "Evocation");
//        FightersGuild BraveLads = new FightersGuild(player, "Gruffy McGruff", "BraveLads", 45, "broadswords");
//        TheivesGuild NightBlades = new TheivesGuild(player, "Veronica Nightblade", "NightBlades", 13, "Poison-blades" );
//        ReaperCoast reaperCoast = new ReaperCoast(player, Dragon, BraveLads, FireFox, NightBlades, "Reaper's Coast");
//
//            reaperCoast.locationChoice();
        // System.out.println("Where to first?"+ "\n");
//        village1.locationChoice();

       scanner.close();

    };
    public static void choice(Player player){

        Taverns Dragon = new Taverns(player, "Dragon's Den Inn", "Big Al");
        MageGuild FireFox = new MageGuild(player, "Merlin", "FireFoxes", 34, "Evocation");
        FightersGuild BraveLads = new FightersGuild(player, "Gruffy McGruff", "BraveLads", 45, "broadswords");
        TheivesGuild NightBlades = new TheivesGuild(player, "Veronica Nightblade", "NightBlades", 13, "Poison-blades" );
        ReaperCoast reaperCoast = new ReaperCoast(player, Dragon, BraveLads, FireFox, NightBlades, "Reaper's Coast");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        String reply = scanner.nextLine();
        if(reply.equals("1")){
            reaperCoast.locationChoice();

        }
    }
    
    
    

}
