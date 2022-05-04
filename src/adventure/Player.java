package adventure;

import java.util.Scanner;

public class Player {

    private String name;
    private String type;
    private String weapon;
    int skills[] = new int[4];

    public Player(String name, String type, String weapon, int skills[]) {
        this.name = name;
        this.type = type;
        this.weapon = weapon;
        this.skills = skills;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getWeapon() {
        return weapon;
    }

    public void increaseStr() {
        skills[0]++;
    }

    public void trainSword() {
        Scanner scanner = new Scanner(System.in);
       
        
            if ((skills[0] <= 9)) {
                skills[0]++;
                System.out.println("You have increased your skill with the sword." + "\n");
                System.out.println("You new strength is " + skills[0]);
                System.out.println("\n" + "Continue to train?");
                String contTrain = scanner.nextLine();
                if (contTrain.equalsIgnoreCase("yes") && (skills[0] < 11)) {
                    trainSword();
                } else {
                    System.out.println("That's enough training today");
                    
                }
            
            } else {
                skills[0]++;
                System.out.println("You have increased your skill as much as you can today" + "\n");
              
            }

        

    }
}
