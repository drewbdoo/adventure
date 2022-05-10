package adventure;

public class FightersGuild extends Guild {
    String specialty;
    public FightersGuild(Player player, String guildLeader, String name, int members, String specialty) {
        super(player, guildLeader, name, members);
        this.specialty = specialty;

    }
    public String getSpec(){
        return specialty;
    }
}
