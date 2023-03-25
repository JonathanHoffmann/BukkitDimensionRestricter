package me.Jonnyfant.dimensionrestricter;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class DimensionListener implements Listener {
    @EventHandler
    public void onEnterEnd(PlayerChangedWorldEvent event) {
        Player player = event.getPlayer();

        if (player.getWorld().getEnvironment().equals(World.Environment.THE_END)) {
            if (player.hasPermission("dimensionrestricter.enterend")) {
                player.sendMessage("You have permission to enter the End");
            } else {
                player.sendMessage("You don't have permission to enter the End");
                player.teleport(event.getFrom().getSpawnLocation());
            }
        }
        else if (player.getWorld().getEnvironment().equals(World.Environment.NETHER))
        {
            if (player.hasPermission("dimensionrestricter.enternether")) {
                player.sendMessage("You have permission to enter the Nether");
            } else {
                player.sendMessage("You don't have permission to enter the Nether");
                player.teleport(event.getFrom().getSpawnLocation());
            }
        }
    }
}
