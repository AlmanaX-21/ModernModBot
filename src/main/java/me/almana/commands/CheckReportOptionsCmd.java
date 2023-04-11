package me.almana.commands;

import me.almana.Main;
import me.almana.models.ModernServer;
import me.almana.models.ReportOption;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.selections.StringSelectMenu;

public class CheckReportOptionsCmd extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        super.onSlashCommandInteraction(event);

        if (event.getName().equals("showreportoptions")) {

            ModernServer server = Main.getServerInfos().get(event.getGuild().getIdLong());
            StringSelectMenu.Builder builder = StringSelectMenu.create("menu");

            for (ReportOption option: server.getReportOptions()) {

                builder.addOption(option.getReportType(), "-", option.getReportIcon());
            }
            event.reply("Here's all the report options").addActionRow(builder.build()).queue();
        }
    }
}
