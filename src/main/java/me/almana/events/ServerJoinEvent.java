package me.almana.events;

import me.almana.Main;
import me.almana.models.ModernServer;
import me.almana.models.ReportOption;
import me.almana.utils.ReportSeverity;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ServerJoinEvent extends ListenerAdapter {

    private static final List<ReportOption> DEFAULT_OPTIONS = List.of(new ReportOption("Swearing", ReportSeverity.LOW),
            new ReportOption("Spam", ReportSeverity.MEDIUM), new ReportOption("Slurs", ReportSeverity.HIGH));
    private HashMap<Long, ModernServer> serverInfos = Main.getServerInfos();

    @Override
    public void onGuildJoin(GuildJoinEvent event) {
        super.onGuildJoin(event);

        long guildId = event.getGuild().getIdLong();
        List<Long> modRoles = new ArrayList<>();
        long modChannel = 0L;

        for (Role role: event.getGuild().getRoles()) {
            if (role.getPermissions().contains(Permission.BAN_MEMBERS)) {

                modRoles.add(role.getIdLong());
            }
        }
        ModernServer server = new ModernServer(guildId, modRoles, DEFAULT_OPTIONS, modChannel);
        serverInfos.put(guildId, server);
    }
}
