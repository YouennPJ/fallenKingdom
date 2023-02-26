package fallenkingdom.fallenkingdom.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class addTeam implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args){

        if(!(sender instanceof Player)){
            sender.sendMessage("Only players can run this command");
            return false;
        }


        Player player = (Player) sender;

        if (player.getAllowFlight()){

        }

        return true;


    }
}
