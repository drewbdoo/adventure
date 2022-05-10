package adventure;

public class MageGuild extends Guild {
    String magicSchool;
    public MageGuild(Player player, String guildLeader, String name, int members, String magicSchool) {
        super(player, guildLeader, name, members);
    }
}
