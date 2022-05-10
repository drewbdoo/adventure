package adventure;

public class Guild {
    private Player player;
    private String guildLeader;
    private String name;
    private int members;

    public Guild(Player player, String guildLeader, String name, int members){
        this.player = player;
        this.guildLeader = guildLeader;
        this.name = name;
        this.members = members;
    }

    public String getName(){
        return this.name;
    }
    public String getLeader(){
        return this.guildLeader;
    }
    public int getMembers(){
        return this.members;
    }
}
