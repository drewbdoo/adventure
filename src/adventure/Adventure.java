package adventure;
import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me your dumb name: ");
        String text = scanner.nextLine();
        System.out.println("Would you like to go on an adventure " + text + "?");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Sweet!!!");
        } else {
            System.out.println("Well fuck off then");
            System.exit(0);
        }
        String weapon;
        String arch;
        System.out.println("Would you like to be a fighter, mage, or rogue?");
        String type = scanner.nextLine();
        if (type.equalsIgnoreCase("fighter")) {
            weapon = "sword";
            arch = "fighter";

        } else if (type.equalsIgnoreCase("mage")) {
            weapon = "staff";
            arch = "mage";

        } else {
            weapon = "dagger";
            arch = "rogue";
        }
        System.out.println("You are a " + arch + " and your chosen weapon is a " + weapon+ "\n");
        Player player = new Player(answer, arch, weapon);

        System.out.println("Where to first?"+ "\n");
        Village.locationChoice(player);
               

       scanner.close();

    };
    
    
    

}
