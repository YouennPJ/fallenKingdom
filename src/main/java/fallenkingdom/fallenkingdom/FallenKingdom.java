package fallenkingdom.fallenkingdom;

import fallenkingdom.fallenkingdom.commands.addTeam;
import fallenkingdom.fallenkingdom.handlers.TNTHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class FallenKingdom extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Plugin activer");

        getCommand("addTeam").setExecutor(new addTeam());

        new TNTHandler(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Plugin desactiver");
    }
}
