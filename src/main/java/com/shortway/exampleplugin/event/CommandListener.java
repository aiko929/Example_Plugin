package com.shortway.exampleplugin.event;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandListener implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){

            Player player = (Player) sender;


            try{
                int food = Integer.valueOf(args[0]);
                player.setFoodLevel(food);
            }
            catch (Exception e){
                player.sendMessage("Use a correct food level!");
            }

        }

        return false;
    }
}
