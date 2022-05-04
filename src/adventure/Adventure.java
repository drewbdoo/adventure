package adventure;
import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Welcome to the world of Adventure!" + "\n");
        System.out.println("What would you like to be called, traveler?");
        String name = scanner.nextLine();
        System.out.println("\n" + "Would you like to go on an adventure " + name + "?");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Sweet!!!" + "\n");
        } else {
            System.out.println("Well fuck off then!!!");
            System.exit(0);
        }
        String weapon;
        String arch;
        int skills[] = new int[4];
        //Skills [0] = Strength
        //Skills [1] = Dexterity
        //Skills [2] = Intelligence
        //Skills [3] = Charisma
     
        System.out.println("Would you like to be a fighter, mage, or rogue?");
        String type = scanner.nextLine();
        if (type.equalsIgnoreCase("fighter")) {
            weapon = "sword";
            arch = "Fighter";
            skills[0] = 5; //Str
            skills[1] = 3; //Dex
            skills[2] = 1; //Int
            skills[3] = 2; //Cha

        } else if (type.equalsIgnoreCase("mage")) {
            weapon = "staff";
            arch = "Mage";
            skills[0] = 1; //Str
            skills[1] = 3; //Dex
            skills[2] = 5; //Int
            skills[3] = 3; //Cha

        } else {
            weapon = "dagger";
            arch = "Rogue";
            skills[0] = 2; //Str
            skills[1] = 5; //Dex
            skills[2] = 3; //Int
            skills[3] = 4; //Cha
        }
        System.out.println("\n" + "Splendid! You are now a " + arch + " and your chosen weapon is a " + weapon+ "\n");
        System.out.println("You starting stats are:" + "\n");
        System.out.println("Strength:" + skills[0]);
        System.out.println("Dexterity:" + skills[1]);
        System.out.println("Intelligence:" + skills[2]);
        System.out.println("Charisma:" + skills[3]+ "\n");
        Player player = new Player(name, arch, weapon, skills);

        System.out.println("Where to first?"+ "\n");
        Village.locationChoice(player);
               

       scanner.close();

    };
    
    
    

}
