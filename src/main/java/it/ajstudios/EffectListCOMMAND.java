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

public class EffectListCOMMAND implements CommandExecutor {

    public Plugin plugin = main.getPlugin(main.class);

    String prefixplugin = plugin.getConfig().getString("prefix").replace("&", "§");



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            sender.sendMessage(prefixplugin + "Effetti disponibili:§e\n" +
                    "            ABSORPTION\n" +
                    "            BAD_OMEN\n" +
                    "            BLINDNESS\n" +
                    "            CONDUIT_POWER\n" +
                    "            CONFUSION\n" +
                    "            DAMAGE_RESISTANCE\n" +
                    "            DOLPHINS_GRACE\n" +
                    "            FAST_DIGGING\n" +
                    "            FIRE_RESISTANCE\n" +
                    "            GLOWING\n" +
                    "            HARM\n" +
                    "            HEAL\n" +
                    "            HEALTH_BOOST\n" +
                    "            HERO_OF_THE_VILLAGE\n" +
                    "            HUNGER\n" +
                    "            INCREASE_DAMAGE\n" +
                    "            INVISIBILITY\n" +
                    "            JUMP\n" +
                    "            LEVITATION\n" +
                    "            LUCK\n" +
                    "            NIGHT_VISION\n" +
                    "            POISON\n" +
                    "            REGENERATION\n" +
                    "            SATURATION\n" +
                    "            SLOW\n" +
                    "            SLOW_DIGGING\n" +
                    "            SLOW_FALLING\n" +
                    "            SPEED\n" +
                    "            UNLUCK\n" +
                    "            WATER_BREATHING\n" +
                    "            WEAKNESS\n" +
                    "            WITHER ");
            }
        else {
            sender.sendMessage("Only players can execute this command.");
        }
        return true;
    }
}