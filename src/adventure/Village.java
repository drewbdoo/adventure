package adventure;

import java.util.Scanner;

public class Village {
    private Player player;

    public Village(Player player) {
        this.player = player;
    }

    public static void locationChoice(Player player) {
        Scanner scanner = new Scanner(System.in);
        Boolean loopVar = true;
        do {
            System.out.println(
                "\n" + "For the Dragon's Breath Inn select 1,");
            System.out.println("For the Fighter's Guild, Select 2,");
            System.out.println("For the Wizard's Butt Library, Select 3");
            System.out.println("For the Thieves Guild, Select 4");
            System.out.println("To camp for the evening, Select 5");
            System.out.println("To check your player stats, Select 6"+ "\n");
            String location = scanner.nextLine();

            if ((location.equalsIgnoreCase("2")) && (player.getType().equalsIgnoreCase("fighter"))) {
                System.out.println("\n" + "Going to the fighter's guild" + "\n");
                loopVar = false;
                Village.fighterGuild(player);
            } else if ((location.equalsIgnoreCase("2")) && (!(player.getType().equalsIgnoreCase("fighter")))) {
                System.out.println("\n" + "Only fighters are allowed in the fighter's guild. Select again" + "\n");
            } else if (location.equalsIgnoreCase("1")) {
                System.out.println("\n" + "Going to the inn" + "\n");
                loopVar = false;
                Village.theInn(player);
            } else if (location.equalsIgnoreCase("3")) {
                System.out.println("\n" + "Going to the library" + "\n");
                loopVar = false;
                Village.library(player);
            } else if (location.equalsIgnoreCase("4") && (!player.getType().equalsIgnoreCase("rogue"))) {
                System.out.println("\n" + "Only rogues are allowed in the Thieves Guild" + "\n");
            } else if (location.equalsIgnoreCase("4")) {
                System.out.println("\n" + "Going to the town hall" + "\n");
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
        scanner.close();
    }

    public static void theInn(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Welcome to the Inn");
        System.out.println("Flex nuts?");
        String reply = scanner.nextLine();
        if(reply.equalsIgnoreCase("yes")){
            System.out.println(player.getName() + ", your strength was " + player.skills[0]);
            player.increaseStr();
            System.out.println("After flexing your nuts, your strength is now " + player.skills[0]);
        }

    };

    public static void fighterGuild(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "You walk into the Fighter's Guild.");
        System.out.println("\n" + "Numberous weapons of all size and shape line the walls.");
        System.out.println(
            "\n" + "A stout and stern looking Orc sits sharpinging his blade and looks up as you walk through the door"
                        + "\n");
        System.out.println("\n" + "He says 'Aye, ye look like a strong one. Come to join up?'" + "\n");
        String reply = scanner.nextLine();
        if (reply.equalsIgnoreCase("no")) {
            System.out.println("\n" + "He replies 'Well, I gots no time fer free-loaders'");
            locationChoice(player);
        } else {
            System.out.println("\n" + "He replies 'That's what I like to hear!!" + "\n");

        }
        System.out.println("\n" + "He gestures to the various weapons around the room" + "\n");
        System.out.println("'Let's see what ye be made of" + "\n");

        Boolean loopVar = true;
        do {
            System.out.println("To train with your sword, press 1");
            System.out.println("To train with the flail, press 2");
            System.out.println("To train with the bo-staff, press 3");
            System.out.println("To end your training, press 4" + "\n");
            String train = scanner.nextLine();
            if (train.equalsIgnoreCase("1")) {
                System.out.println("\n" + "You attack the dummy with your sword with a practiced swing." + "\n");
                System.out.println(
                    "\n" + "The Orc comments 'Aye, looks like ye got some skill with that chunk 'o steel'" + "\n");
                    player.trainSword();
            } else if (train.equalsIgnoreCase("2")) {
                System.out.println("\n" + "You grab the flail and give it a few swings, but it feels odd in your hand" + "\n");
                System.out.println("\n" + "The Orc says 'Looks like ye need some work with that one'" + "\n");
            } else if (train.equalsIgnoreCase("3")) {
                System.out.println(
                    "\n" + "The staff seems totally foreign to you, but you grab it and swing it around like a dumb barbarian"
                                + "\n");
                System.out.println("\n" + "The Orc says 'Best ye be leaving that to the smarty monks and whatnot" + "\n");
            } else if (train.equalsIgnoreCase("4")) {
                System.out.println(
                    "\n" + "The Orc says 'Well, don't be a stranger, come back and train anytime, y'hear?" + "\n");
                locationChoice(player);
                loopVar = false;
            } else {
                locationChoice(player);
                loopVar = false;
            }

        } while (loopVar);

    };

    public static void library(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "You walk into the library");
        System.out.println("\n" + "Dusty tomes line the walls and the librian, a wizened looking Gnome looks you up and down");
        System.out.println("You get the feeling he is waiting for his moment to tell you to be quiet" + "\n");
        Boolean loopVar = true;
        do {

            System.out.println("\n" + "To quietly look at the books, press 1");
            System.out.println("To loudly introduce yourself to the old Gnome, press 2");
            System.out.println("To leave, press 3" + "\n");
            String choice1 = scanner.nextLine();
            if (choice1.equalsIgnoreCase("1") && player.getType().equalsIgnoreCase("mage")) {
                System.out.println("\n" + "You see a number of good spellbooks to add to your repertoire" + "\n");
                System.out.println("\n" + "Add them to your list?" + "\n");
                String choice2 = scanner.nextLine();
                if (choice2.equalsIgnoreCase("yes") && player.getType().equalsIgnoreCase("mage")) {
                    System.out.println("\n" + "You learn the new spells" + "\n");
                } else {
                    System.out.println("What next?" + "\n");
                }

            } else if (choice1.equalsIgnoreCase("1") && player.getType().equalsIgnoreCase("fighter")) {
                System.out.println("\n" + "You realize you can't read" + "\n");
                System.out.println("What next?" + "\n");

            } else if (choice1.equalsIgnoreCase("1") && player.getType().equalsIgnoreCase("rogue")) {
                System.out.println(
                    "\n" + "Mentally calculate how much these books would be worth on the black market, decide they are too heavy to steal"
                                + "\n");
                System.out.println("What next?" + "\n");

            } else if (choice1.equalsIgnoreCase("2")) {
                System.out
                        .println("\n" + "The Gnome cuts you off before you can finish and screams for you to be gone" + "\n");
                System.out.println(
                    "\n" + "With a flourish and a flash of light, you find yourself standing outside the library" + "\n");
                loopVar = false;
                locationChoice(player);

            } else {
                loopVar = false;
                locationChoice(player);
            }
        } while (loopVar);

    };

    public static void thievesGuild(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Welcome to the Thieve's Guild");

    };

}