package me.almana.commands;

import me.almana.Main;
import me.almana.models.ModernServer;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CheckReportOptionsCmd extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        super.onSlashCommandInteraction(event);

        if (event.getName().equals("showreportoptions")) {

            ModernServer server = Main.getServerInfos().get(event.getGuild().getIdLong());

            event.reply("Here's all the report options").addActionRow(


            ).queue();
        }
    }
}
