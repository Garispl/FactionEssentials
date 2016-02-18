package io.GooseyPoosey.FEssentials.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener 
{
	@EventHandler
	public void onJoin(PlayerJoinEvent e)
	{
		Player p = (Player)e;
		p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "                                                              ");
		p.sendMessage(" ");
		p.sendMessage(ChatColor.YELLOW + "  Welcome " + ChatColor.RED + p.getDisplayName() + ChatColor.YELLOW + " To the " + ChatColor.AQUA + "Factions " + ChatColor.YELLOW + "server.");
		p.sendMessage(ChatColor.YELLOW + "  Make sure to stay updated with the rules " + ChatColor.RED + "/rules" + ChatColor.YELLOW + ".");
		p.sendMessage(ChatColor.YELLOW + "  Not sure about a command? Use " + ChatColor.RED + "/help" + ChatColor.RED + "for a lie of commands.");
		p.sendMessage(" ");
		p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "                                                              ");
		
		Bukkit.dispatchCommand(p, "f show");
	}
	
}
