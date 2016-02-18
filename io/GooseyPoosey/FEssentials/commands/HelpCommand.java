package io.GooseyPoosey.FEssentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor 
{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		if(cmd.getName().equalsIgnoreCase("help"))
		{
			Player p = (Player)sender;
			p.sendMessage(ChatColor.GREEN + "" + ChatColor.STRIKETHROUGH + "                                                              ");
			p.sendMessage(ChatColor.GREEN + "  Server Help: ");
			p.sendMessage("   " + ChatColor.GREEN + "/fac >" + ChatColor.DARK_GREEN + " Learn how to use the faction command.");
			p.sendMessage("   " + ChatColor.GREEN + "/wild > " + ChatColor.DARK_GREEN + " Teleport to a random location.");
			p.sendMessage("   " + ChatColor.GREEN + "/kit > " + ChatColor.DARK_GREEN + " View the avaliable kits for your rank.");
			p.sendMessage("   " + ChatColor.GREEN + "/list > " + ChatColor.DARK_GREEN + " View amount of players currently online.");
			p.sendMessage("   " + ChatColor.GREEN + "/auction >" + ChatColor.DARK_GREEN + " Learn how to use the auction plugin.");
			p.sendMessage("   " + ChatColor.GREEN + "/ct >" + ChatColor.DARK_GREEN + " View your current combat tag.");
			p.sendMessage(ChatColor.GREEN + "" + ChatColor.STRIKETHROUGH + "                                                              ");
		}
		return false;
	}
}
