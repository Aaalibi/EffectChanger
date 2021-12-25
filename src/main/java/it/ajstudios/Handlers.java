package it.ajstudios;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;
import java.io.File;

public class Handlers implements Listener {

    public Plugin plugin = main.getPlugin(main.class);

    String prefixplugin = plugin.getConfig().getString("prefix").replace("&", "§");



    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        if(plugin.getConfig().contains("effettiplayer") == true) {
            if (plugin.getConfig().contains("effettiplayer." + e.getPlayer().getName()) == true) {
                float jointime = System.currentTimeMillis() / 1000 % 60;
                plugin.getConfig().set("effettiplayer." + e.getPlayer().getName() + ".timeplayed", 0);
                plugin.saveConfig();
            }
        
        }
        else {  
            plugin.getConfig().createSection("effettiplayer");
            plugin.getConfig().createSection("effettiplayer." + e.getPlayer().getName());
            plugin.getConfig().set("effettiplayer." + e.getPlayer().getName() + ".timeplayed", 0);
            plugin.saveConfig();
        }
        if(e.getPlayer().hasPlayedBefore()) {
            e.getPlayer().sendMessage(prefixplugin + "Benvenuto in " + plugin.getConfig().getString("server") + " , per vedere la lista dei poteri digita /effectlist. Ricorda: una volta scelto il potere non potrai più cambiarlo.");
        }
    }
    @EventHandler
    public void onPlayerExit(PlayerQuitEvent e) {

    }

}