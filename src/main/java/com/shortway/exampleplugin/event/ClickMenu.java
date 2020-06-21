package com.shortway.exampleplugin.event;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class ClickMenu implements Listener {

    @EventHandler
    public void clickEvent(InventoryClickEvent e){



        if(e.getView().getTitle().equals(ChatColor.BLUE + "Example Plugin!")){

            Player player = (Player) e.getWhoClicked();
            ItemStack item = e.getCurrentItem();
            if(item == null){return;}

            if(item.getItemMeta().getDisplayName().equals("Player Examples")){


                player.sendMessage("Try:");
                player.sendMessage("/hunger 2");
                player.sendMessage("To remove 2 hunger units!");
            }

            e.getView().close();
            e.setCancelled(true);
        }

    }

}
