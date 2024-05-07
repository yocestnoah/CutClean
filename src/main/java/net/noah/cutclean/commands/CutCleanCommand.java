package net.noah.cutclean.commands;

import net.noah.cutclean.CutClean;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CutCleanCommand implements CommandExecutor {

    private final CutClean plugin;

    public CutCleanCommand(CutClean plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] args) {

        if(!commandSender.hasPermission(CutClean.PERMISSION)) {
            commandSender.sendMessage(CutClean.PREFIX + ChatColor.RED + "You do not have permission to use this command.");
            return true;
        }

        if (args.length == 0) {
            commandSender.sendMessage(CutClean.PREFIX + "Usage: /cutclean <enable/disable/description>");
            return true;
        }

        if(args[0].equalsIgnoreCase("description")) {
            commandSender.sendMessage(CutClean.PREFIX + CutClean.DESCRIPTION);
            return true;
        }

        if(args[0].equalsIgnoreCase("enable")) {
            if(CutClean.status) {
                commandSender.sendMessage(CutClean.PREFIX + "CutClean is already enabled.");
                return true;
            }

            CutClean.status = true;
            Bukkit.broadcastMessage(CutClean.PREFIX + "CutClean has been enabled.");

            return true;
        }

        if(args[0].equalsIgnoreCase("disable")) {
         if(!CutClean.status) {
             commandSender.sendMessage(CutClean.PREFIX + "CutClean is not enabled.");
             return true;
         }

            CutClean.status = false;
            Bukkit.broadcastMessage(CutClean.PREFIX + "CutClean has been disabled.");
            return true;
        }

        commandSender.sendMessage(CutClean.PREFIX + "Usage: /cutclean <enable/disable/description>");
        return true;
    }
}
