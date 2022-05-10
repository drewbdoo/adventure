package adventure;

public class Taverns {
    private Player player;
    private String tavernName;
    private String barKeep;


    public Taverns(Player player, String tavernName, String barKeep){
        this.player = player;
        this.tavernName = tavernName;
        this.barKeep = barKeep;
    }
    public String getTavernName(){
        return tavernName;
    }
    public String getBarKeep(){
        return barKeep;
    }
}
