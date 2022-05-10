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

        Villages village1 = new Villages(player, "Dragon's Butthole", "Tough Guy's", "Staffy's",
                "Stabby's", "Reaper's Coast");

        // System.out.println("Where to first?"+ "\n");
        village1.locationChoice();
               

       scanner.close();

    };
    
    
    

}
