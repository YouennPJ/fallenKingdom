package fallenkingdom.fallenkingdom.util;

import fallenkingdom.fallenkingdom.FallenKingdom;
import fr.mrmicky.fastboard.FastBoard;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Scoreboard implements Listener {

    private final Map<UUID, FastBoard> boards = new HashMap<>();

    public Scoreboard(FallenKingdom plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        FastBoard board = new FastBoard(player);

        String title = "&c&lWelcome";
        board.updateTitle(ChatColor.translateAlternateColorCodes('&', title));

        boards.put(player.getUniqueId(), board);
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();
        FastBoard board = boards.remove(player.getUniqueId());

        if (board != null){
            board.delete();
        }
    }

    private void updateBoard(FastBoard board, String ... lines){
        for(int i = 0; i < lines.length; i++){
            lines[i] = ChatColor.translateAlternateColorCodes('&', lines[i]);
        }
    }

}
