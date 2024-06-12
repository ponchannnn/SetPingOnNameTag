package com.ponchannn.setpingonnametag;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class SetPingOnNameTag extends JavaPlugin {
    @Override
    public void onEnable() {
        new SetPing().runTaskTimer(this, 0, 20 * 1);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        for (World world : Bukkit.getWorlds()) {
            for(Player player : world.getPlayers()) {
                player.setPlayerListName(null);
            }
        }
    }
}
