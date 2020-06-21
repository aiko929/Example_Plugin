package com.shortway.exampleplugin.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUI implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;

            Inventory inv = Bukkit.createInventory(player,9, ChatColor.BLUE + "Example Plugin!");

            ItemStack head = new ItemStack(Material.PLAYER_HEAD);
            ItemStack grass = new ItemStack(Material.GRASS_BLOCK);
            ItemStack event = new ItemStack(Material.FIREWORK_ROCKET);

            ItemMeta head_meta = head.getItemMeta();
            head_meta.setDisplayName("Player Examples");
            head.setItemMeta(head_meta);

            ItemMeta grass_meta = grass.getItemMeta();
            grass_meta.setDisplayName("World Examples");
            grass.setItemMeta(grass_meta);

            ItemMeta event_meta= event.getItemMeta();
            event_meta.setDisplayName("Event Examples");
            event.setItemMeta(event_meta);


            ItemStack[] menu = {head, grass, event};

            inv.addItem(menu);

            player.openInventory(inv);
            return true;

        }
        return false;
    }
}
