package me.almana.events;

import me.almana.Main;
import me.almana.models.ModernServer;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.HashMap;

import static me.almana.Main.getServerInfos;

public class TstMsgCmds extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        super.onMessageReceived(event);

        if (event.getMessage().getContentRaw().contains("debug")) {

            HashMap<Long, ModernServer> serverInfo = Main.getServerInfos();
            TextChannel channel = event.getChannel().asTextChannel();
            channel.sendMessage("No. of entries: " + serverInfo.size()).queue();
            channel.sendMessage("Guild Id: " + serverInfo.get(event.getGuild().getIdLong()).getServerId()).queue();
            channel.sendMessage("Guild puntype: " + serverInfo.get(event.getGuild().getIdLong()).getReportOptions().get(0).getReportType()).queue();
        }
    }
}
