package me.almana.utils;

import me.almana.Main;
import me.almana.events.TstMsgCmds;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class StartBot extends ListenerAdapter {

    private long start;

    public JDA startBot(String token) throws InterruptedException {

        start = System.currentTimeMillis();
        Main.logger.info("Starting bot...");
        JDA jda = JDABuilder.createDefault(token)
                .setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.watching("you"))
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(this)
                .addEventListeners(new TstMsgCmds())
                .build().awaitReady();
        return jda;
    }

    @Override
    public void onReady(ReadyEvent event) {
        super.onReady(event);

        Main.logger.info("Started bot in " + (System.currentTimeMillis() - start) + "ms.");
    }
}
