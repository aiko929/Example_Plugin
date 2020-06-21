package com.shortway.exampleplugin;

import com.shortway.exampleplugin.command.GUI;
import com.shortway.exampleplugin.event.ClickMenu;
import com.shortway.exampleplugin.event.CommandListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("example").setExecutor(new GUI());
        getCommand("hunger").setExecutor(new CommandListener());
        getServer().getPluginManager().registerEvents(new ClickMenu(),this);


        System.out.println("Example Plugin enabled!");
    }

    @Override
    public void onDisable() {
        System.out.println("Example Plugin disabled!");
    }
}
