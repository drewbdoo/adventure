package adventure;
public class Player {
  
        private String name;
        private String type;
        private String weapon;
        public Player(String name, String type, String weapon){
            this.name = name;
            this.type = type;
            this.weapon = weapon;
        }
    
        public String getName() {
            return name;
        }
        
        public String getType() {
            return type;
        }

        public String getWeapon(){
            return weapon;
        }
    }
    

