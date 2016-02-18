package io.GooseyPoosey.FEssentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class MOTDCommand implements CommandExecutor
{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("motd"))
		{
			Player p = (Player)sender;
			p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "                                                              ");
			p.sendMessage(" ");
			p.sendMessage(ChatColor.YELLOW + "  Welcome " + ChatColor.RED + p.getDisplayName() + ChatColor.YELLOW + " To the " + ChatColor.AQUA + "Factions " + ChatColor.YELLOW + "server.");
			p.sendMessage(ChatColor.YELLOW + "  Make sure to stay updated with the rules " + ChatColor.RED + "/rules" + ChatColor.YELLOW + ".");
			p.sendMessage(ChatColor.YELLOW + "  Not sure about a command? Use " + ChatColor.RED + "/help" + ChatColor.RED + "for a lie of commands.");
			p.sendMessage(" ");
			p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "                                                              ");
		}
		return false;
	}

}
