package com.javawithminecraft.jonathan.helloplayer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloPlayer extends JavaPlugin{

	public boolean onCommand(Command cmd, CommandSender sender, String[] args, String alias) {
		if (cmd.getName().equalsIgnoreCase("hello")) {
			sender.sendMessage("Hello!");
			return true;
		}
		return false;
		
	}
	
}
