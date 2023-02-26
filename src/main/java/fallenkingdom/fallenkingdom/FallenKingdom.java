package fallenkingdom.fallenkingdom;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class FallenKingdom extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Plugin activer");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Plugin desactiver");
    }
}
