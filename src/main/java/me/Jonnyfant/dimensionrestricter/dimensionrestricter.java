package me.Jonnyfant.dimensionrestricter;

import org.bukkit.plugin.java.JavaPlugin;

public class dimensionrestricter extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new DimensionListener(), this);
    }
}
