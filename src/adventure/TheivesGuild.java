package adventure;

public class TheivesGuild extends Guild {
    String specialty;
    public TheivesGuild(Player player, String guildLeader, String name, int members, String specialty) {
        super(player, guildLeader, name, members);
    }
}
