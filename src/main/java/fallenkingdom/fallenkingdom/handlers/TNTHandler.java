package fallenkingdom.fallenkingdom.handlers;

import fallenkingdom.fallenkingdom.FallenKingdom;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class TNTHandler implements Listener {
    public TNTHandler(FallenKingdom plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onTorchPlace_Low(BlockPlaceEvent event){
        if (event.getBlock().getType() == Material.TNT){
            //event.getBlock().setType(Material.DIAMOND_BLOCK);
            event.setCancelled(true);
        }

        Bukkit.getLogger().info("TNT PLACED");
    }

    @EventHandler(ignoreCancelled = true)
    public void onTorchPlace_Normal(BlockPlaceEvent event){
        Block block = event.getBlock();

        if (block.getType() != Material.TNT){
            return;
        }

        Bukkit.getLogger().info("TNT PLACED");
    }
}
