package me.almana;

import me.almana.models.ModernServer;
import me.almana.models.ReportOption;
import me.almana.utils.ReportSeverity;
import me.almana.utils.Secret;
import me.almana.utils.StartBot;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;

public class Main {

    public static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static HashMap<Long, ModernServer> serverInfos = new HashMap<>();
    private static JDA jda;

    public static void main(String[] args) throws InterruptedException {

        StartBot startBot = new StartBot();
        test();
        jda = startBot.startBot(Secret.getToken());
    }

    public static JDA getJda() {
        return jda;
    }

    public static HashMap<Long, ModernServer> getServerInfos() {
        return serverInfos;
    }

    public static void setServerInfos(HashMap<Long, ModernServer> serverInfos) {
        Main.serverInfos = serverInfos;
    }

    private static void test() {

        ModernServer testServer = new ModernServer(931399413081968670L, List.of(931406972274757773L),
                List.of(new ReportOption("Bruh", Emoji.fromUnicode("\\uD83D\\uDCD7"), ReportSeverity.HIGH)));

        serverInfos.put(931399413081968670L, testServer);
    }
}
