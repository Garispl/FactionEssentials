package io.GooseyPoosey.FEssentials;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import io.GooseyPoosey.FEssentials.commands.HelpCommand;
import io.GooseyPoosey.FEssentials.commands.KitCommand;
import io.GooseyPoosey.FEssentials.commands.WhoCommand;

public class Main extends JavaPlugin 
{
	
	public static Main plugin;
	public static PluginManager pm;
	
	@Override
	public void onEnable()
	{
		
		plugin = this;
		pm = Bukkit.getPluginManager();
		regCommands();	
	}
	
	@Override
	public void onDisable()
	{
		
	}

	private void regCommands()
	{
		getCommand("who").setExecutor(new WhoCommand());
		getCommand("help").setExecutor(new HelpCommand());
		getCommand("kit").setExecutor(new KitCommand());
	}
}