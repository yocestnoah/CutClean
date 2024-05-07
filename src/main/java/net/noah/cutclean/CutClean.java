package net.noah.cutclean;

import net.noah.cutclean.commands.CutCleanCommand;
import net.noah.cutclean.listeners.BlockListener;
import net.noah.cutclean.listeners.EntityListener;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class CutClean extends JavaPlugin {

    public static final String PERMISSION = "scenario.cutclean";
    public static final String PREFIX = ChatColor.GRAY + "CutClean" + ChatColor.DARK_GRAY + " » " + ChatColor.WHITE;
    public static final String DESCRIPTION = "All ores and animal food will be dropped in its smelted version.";

    public static boolean status = false;

    @Override
    public void onEnable() {

        getCommand("cutclean").setExecutor(new CutCleanCommand(this));

        getServer().getPluginManager().registerEvents(new EntityListener(), this);
        getServer().getPluginManager().registerEvents(new BlockListener(), this);

    }
}
