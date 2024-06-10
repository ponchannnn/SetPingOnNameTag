package com.ponchannn.setpingonnametag;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.Map;

public class SetPing extends BukkitRunnable {
    @Override
    public void run () {
        this.onHeader();
    }

    private void onHeader () {
        for (World world : Bukkit.getWorlds()) {
            for(Player player : world.getPlayers()) {
                String name = player.getName();
                int ping = player.getPing();
                player.setPlayerListName(name + ": " + String.valueOf(ping) + "ms");
            }
        }
    }
}
