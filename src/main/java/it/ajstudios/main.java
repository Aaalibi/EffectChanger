package it.ajstudios;

import org.bukkit.Bukkit;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Collection;
import java.util.Map;

public final class main extends JavaPlugin {

    String prefixplugin = getConfig().getString("prefix").replace("&", "§");


    @Override
    public void onEnable() {
        this.getCommand("seteffect").setExecutor(new SetEffectCOMMAND());
        this.getCommand("effectlist").setExecutor(new EffectListCOMMAND());

        getServer().getPluginManager().registerEvents(new Handlers(), this);
        getConfig().options().copyDefaults(true);
        this.saveDefaultConfig();
        Bukkit.getScheduler().scheduleAsyncRepeatingTask(this, new Runnable() {
            public void run() {
                float now = System.currentTimeMillis() / 1000 % 60;
                for(Player p : Bukkit.getServer().getOnlinePlayers()) {
                    String pname = p.getName();
                    if (getConfig().getDouble("effettiplayer." + pname + ".timeplayed") > 86400 && getConfig().getDouble("effettiplayer." + pname + ".timeplayed") < 172800) {
                        if (getConfig().getDouble("effettiplayer." + pname + ".power") == 2) {
                            break;
                        } else if (getConfig().getDouble("effettiplayer." + pname + ".power") == 1) {
                            p.sendMessage(prefixplugin + "Hai potenziato il tuo effetto di 1. Totale: " + getConfig().getInt("effettiplayer." + pname + ".timeplayed"));
                            getConfig().set("effettiplayer." + pname + ".power", 2);
                            saveConfig();
                        }
                    } else if (getConfig().getDouble("effettiplayer." + pname + ".timeplayed") >= 172800) {
                        if (getConfig().getDouble("effettiplayer." + pname + ".power") == 3) {
                            break;
                        } else {
                            p.sendMessage(prefixplugin + "Hai potenziato il tuo effetto di 1. Totale: " + getConfig().getInt("effettiplayer" + pname + "power"));
                            getConfig().set("effettiplayer." + pname + ".power", 3);
                            saveConfig();
                        }
                    } else if (getConfig().getDouble("effettiplayer." + pname + ".timeplayed") >= 259200 && getConfig().getDouble("effettiplayer." + pname + ".timeplayed") <=172800) {
                        if (getConfig().getDouble("effettiplayer." + pname + ".power") == 4) {
                            break;
                        } else {
                            p.sendMessage(prefixplugin + "Hai potenziato il tuo effetto di 1. Totale: " + getConfig().getInt("effettiplayer" + pname + "power"));
                            getConfig().set("effettiplayer." + pname + ".power", 4);
                            saveConfig();
                        }
                    } else if (getConfig().getDouble("effettiplayer." + pname + ".timeplayed") >= 345600 && getConfig().getDouble("effettiplayer." + pname + ".timeplayed") <=259200) {
                        if (getConfig().getDouble("effettiplayer." + pname + ".power") == 5) {
                            break;
                        } else {
                            p.sendMessage(prefixplugin + "Hai potenziato il tuo effetto di 1. Totale: " + getConfig().getInt("effettiplayer" + pname + "power"));
                            getConfig().set("effettiplayer." + pname + ".power", 5);
                            saveConfig();
                        }
                    } else if (getConfig().getDouble("effettiplayer." + pname + ".timeplayed") >= 432000 && getConfig().getDouble("effettiplayer." + pname + ".timeplayed") <=345600) {
                        if (getConfig().getDouble("effettiplayer." + pname + ".power") == 6) {
                            break;
                        } else {
                            p.sendMessage(prefixplugin + "Hai potenziato il tuo effetto di 1. Totale: " + getConfig().getInt("effettiplayer" + pname + "power"));
                            getConfig().set("effettiplayer." + pname + ".power", 6);
                            saveConfig();
                        }
                    } else if (getConfig().getDouble("effettiplayer." + pname + ".timeplayed") >= 518400 && getConfig().getDouble("effettiplayer." + pname + ".timeplayed") <=43200) {
                        if (getConfig().getDouble("effettiplayer." + pname + ".power") == 7) {
                            break;
                        } else {
                            p.sendMessage(prefixplugin + "Hai potenziato il tuo effetto di 1. Totale: " + getConfig().getInt("effettiplayer" + pname + "power"));
                            getConfig().set("effettiplayer." + pname + ".power", 7);
                            saveConfig();
                        }
                    } else if (getConfig().getDouble("effettiplayer." + pname + ".timeplayed") >= 604800 && getConfig().getDouble("effettiplayer." + pname + ".timeplayed") <=518400) {
                        if (getConfig().getDouble("effettiplayer." + pname + ".power") == 8) {
                            break;
                        } else {
                            p.sendMessage(prefixplugin + "Hai potenziato il tuo effetto di 1. Totale: " + getConfig().getInt("effettiplayer" + pname + "power"));
                            getConfig().set("effettiplayer." + pname + ".power", 8);
                            saveConfig();
                        }
                    } else if (getConfig().getDouble("effettiplayer." + pname + ".timeplayed") >= 691200 && getConfig().getDouble("effettiplayer." + pname + ".timeplayed") <=604800) {
                        if (getConfig().getDouble("effettiplayer." + pname + ".power") == 9) {
                            break;
                        } else {
                            p.sendMessage(prefixplugin + "Hai potenziato il tuo effetto di 1. Totale: " + getConfig().getInt("effettiplayer" + pname + "power"));
                            getConfig().set("effettiplayer." + pname + ".power", 9);
                            saveConfig();
                        }
                    } else if (getConfig().getDouble("effettiplayer." + pname + ".timeplayed") >= 777600 && getConfig().getDouble("effettiplayer." + pname + ".timeplayed") <= 691200) {
                        if (getConfig().getDouble("effettiplayer." + pname + ".power") == 10) {
                            break;
                        } else {
                            p.sendMessage(prefixplugin + "Hai potenziato il tuo effetto di 1. Totale: " + getConfig().getInt("effettiplayer" + pname + "power"));
                            getConfig().set("effettiplayer." + pname + ".power", 10);
                            saveConfig();
                        }
                    }
                }}
        }, 0L, 200L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
            public void run() {
                for (Player p : Bukkit.getServer().getOnlinePlayers()) {
                    int powereffect = getConfig().getInt("effettiplayer." + p.getName() + ".power");
                    String pot = getConfig().getString("effettiplayer." + p.getName() + ".effect");
                    try {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.getByName(pot.toUpperCase()), 11 * 20, powereffect - 1));
                    }
                    catch(NullPointerException e)  {
                        break;
                    }
                    catch (Exception e) {
                        p.sendMessage(prefixplugin + "L'effetto non è valido, consulta la lista effetti con /effectlist.");


                    }
                }
            }
        }, 0L, 200L);

        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
            public void run() {
                for(Player p : Bukkit.getServer().getOnlinePlayers()) {
                    int time = p.getStatistic(Statistic.PLAY_ONE_MINUTE);
                    int seconds = time / 20;
                    getConfig().set("effettiplayer." + p.getName() + ".timeplayed", seconds);
                }
            }
        }, 0L, 50L);

        }


        @Override
    public void onDisable() {
        // we figa
    }
}


