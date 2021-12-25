package it.ajstudios;

import org.bukkit.Bukkit;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SetEffectCOMMAND implements CommandExecutor {

    public Plugin plugin = main.getPlugin(main.class);

    String prefixplugin = plugin.getConfig().getString("prefix").replace("&", "§");



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            if(plugin.getConfig().contains("effettiplayer." + sender.getName() + ".effect") == true) {
                sender.sendMessage(prefixplugin + "Hai già scelto il tuo potere. Non puoi cambiarlo");
                return true;
            }
                if(args.length == 0) {
                    sender.sendMessage(prefixplugin + "Non hai indicato alcun effetto.");
                }
                else {
                    plugin.getConfig().set("effettiplayer." + sender.getName() + ".effect", args[0].toUpperCase());
                    plugin.getConfig().set("effettiplayer." + sender.getName() + ".power", 1);
                    plugin.saveConfig();
                    sender.sendMessage(prefixplugin + "Effetto impostato a " + args[0]);
                }
            }
        else {
            sender.sendMessage("Only players can execute this command.");
        }
        return true;
    }
}