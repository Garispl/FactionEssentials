package io.GooseyPoosey.FEssentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class KitCommand implements CommandExecutor 
{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		if(cmd.getName().equalsIgnoreCase("kit"))
		{
			Player p = (Player)sender;
			if(args.length == 0)
			{
				if(p.hasPermission("fe.default"))
				{
					p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "                                                              ");
					p.sendMessage(ChatColor.YELLOW + " You have the rank of " + ChatColor.RED + "default" + ChatColor.YELLOW + ".");
					p.sendMessage(ChatColor.YELLOW + " You have access to the following kits: " + ChatColor.GRAY + "[Default, Food, PvP, Starter]");
					p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "                                                              ");
				} else if(p.hasPermission("fe.vip"))
				{
					p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "                                                              ");
					p.sendMessage(ChatColor.YELLOW + " You have the rank of " + ChatColor.RED + "VIP" + ChatColor.YELLOW + ".");
					p.sendMessage(ChatColor.YELLOW + " You have access to the following kits: " + ChatColor.GRAY + "[Default, VIP, Food, PvP, Starter]");
					p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "                                                              ");
				} else if(p.hasPermission("fe.vip+"))
				{
					p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "                                                              ");
					p.sendMessage(ChatColor.YELLOW + " You have the rank of " + ChatColor.RED + "VIP Plus" + ChatColor.YELLOW + ".");
					p.sendMessage(ChatColor.YELLOW + " You have access to the following kits: " + ChatColor.GRAY + "[Default, VIP, VIP+, Food, PvP, Starter]");
					p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "                                                              ");
				} else if(p.hasPermission("fe.pro"))
				{
					p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "                                                              ");
					p.sendMessage(ChatColor.YELLOW + " You have the rank of " + ChatColor.RED + "Pro" + ChatColor.YELLOW + ".");
					p.sendMessage(ChatColor.YELLOW + " You have access to the following kits: " + ChatColor.GRAY + "[Default, VIP, VIP+, Pro, Food, PvP, Starter]");
					p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "                                                              ");
				} else if(p.isOp())
				{
					p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "                                                              ");
					p.sendMessage(ChatColor.YELLOW + " You have the rank of " + ChatColor.RED + "OP" + ChatColor.YELLOW + ".");
					p.sendMessage(ChatColor.YELLOW + " You have access to the following kits: " + ChatColor.GRAY + "[Default, VIP, VIP+, Pro, Food, PvP, Starter]");
					p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "                                                              ");
				}
			}
			
			if(args.length == 1)
			{
				if(args[0].equalsIgnoreCase("default"))
				{
					ItemStack iron_sword = new ItemStack(Material.IRON_SWORD, 1);
					ItemStack iron_helm = new ItemStack(Material.IRON_HELMET, 1);
					ItemStack iron_chest = new ItemStack(Material.IRON_CHESTPLATE, 1);
					ItemStack iron_legs = new ItemStack(Material.IRON_LEGGINGS, 1);
					ItemStack iron_boots = new ItemStack(Material.IRON_BOOTS, 1);
					p.getInventory().addItem(iron_sword);
					p.getInventory().addItem(iron_helm);
					p.getInventory().addItem(iron_chest);
					p.getInventory().addItem(iron_legs);
					p.getInventory().addItem(iron_boots);
					p.sendMessage(ChatColor.YELLOW + "Giving you kit " + ChatColor.RED + "Default" + ChatColor.YELLOW + ".");
				}
				if(args[0].equalsIgnoreCase("vip"))
				{
					ItemStack iron_sword = new ItemStack(Material.IRON_SWORD, 1);
					iron_sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
					
					ItemStack iron_helm = new ItemStack(Material.IRON_HELMET, 1);
					
					ItemStack iron_chest = new ItemStack(Material.IRON_CHESTPLATE, 1);
					
					ItemStack iron_legs = new ItemStack(Material.IRON_LEGGINGS, 1);
					
					ItemStack iron_boots = new ItemStack(Material.IRON_BOOTS, 1);
					
					p.getInventory().addItem(iron_sword);
					p.getInventory().addItem(iron_helm);
					p.getInventory().addItem(iron_chest);
					p.getInventory().addItem(iron_legs);
					p.getInventory().addItem(iron_boots);
					p.sendMessage(ChatColor.YELLOW + "Giving you kit " + ChatColor.RED + "VIP" + ChatColor.YELLOW + ".");
				}
			}
		}
		return false;
	}
}
