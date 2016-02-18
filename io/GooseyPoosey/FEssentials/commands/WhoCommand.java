package io.GooseyPoosey.FEssentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WhoCommand implements CommandExecutor
{
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		if(cmd.getName().equalsIgnoreCase("who"))
		{
			Player p = (Player)sender;
			p.sendMessage(ChatColor.GREEN + "" + ChatColor.STRIKETHROUGH + "                                                              ");
			p.sendMessage(ChatColor.GRAY + "There are currently " + ChatColor.GREEN + "(" + Bukkit.getOnlinePlayers().length + "/" + Bukkit.getMaxPlayers() + ")" + ChatColor.GRAY + " online.");
			p.sendMessage(ChatColor.GRAY + "If you need any support please join our teamspeak.");
			p.sendMessage(ChatColor.GREEN + "" + ChatColor.STRIKETHROUGH + "                                                              ");
		}
		return false;
	}

}