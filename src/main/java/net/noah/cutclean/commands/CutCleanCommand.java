package net.noah.cutclean.commands;

import net.noah.cutclean.CutClean;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CutCleanCommand implements CommandExecutor {

    public CutCleanCommand(CutClean plugin) {}

    @Override
    public boolean onCommand(CommandSender sender, Command command, String string, String[] args) {
        if(!sender.hasPermission(CutClean.PERMISSION)) {
            sender.sendMessage(CutClean.PREFIX + ChatColor.RED + "You do not have permission to use this command."); return true;
        }

        if (args.length == 0) {
            sender.sendMessage(CutClean.PREFIX + "Usage: /cutclean <enable/disable/description>"); return true;
        }

        if(args[0].equalsIgnoreCase("description")) {
            sender.sendMessage(CutClean.PREFIX + CutClean.DESCRIPTION); return true;
        }

        if(args[0].equalsIgnoreCase("enable")) {
            if(CutClean.status) {
                sender.sendMessage(CutClean.PREFIX + "CutClean is already enabled."); return true;
            }
            CutClean.status = true;
            Bukkit.broadcastMessage(CutClean.PREFIX + "CutClean has been enabled."); return true;
        }

        if(args[0].equalsIgnoreCase("disable")) {
         if(!CutClean.status) {
             sender.sendMessage(CutClean.PREFIX + "CutClean is not enabled."); return true;
         }
            CutClean.status = false;
            Bukkit.broadcastMessage(CutClean.PREFIX + "CutClean has been disabled."); return true;
        }

        sender.sendMessage(CutClean.PREFIX + "Usage: /cutclean <enable/disable/description>"); return true;
    }
}