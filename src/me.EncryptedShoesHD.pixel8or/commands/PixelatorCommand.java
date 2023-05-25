package me.EncryptedShoesHD.pixel8or.commands;

import me.EncryptedShoesHD.pixel8or.Pixel8or;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PixelatorCommand implements CommandExecutor {

    Pixel8or plugin;

    public PixelatorCommand(Pixel8or pixel8or) {
        plugin = pixel8or;
    }

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        // get the parameters from the command
        String fileName = args[0];
        String worldName = args[1]; // this is the new argument for the world name, kinda useless
        String x = args[2];
        String y = args[3];
        String z = args[4];

        // get the world. if it's a player, use the player's world. if it's the console, use the specified world name.
        World world;
        if (cs instanceof Player) {
            Player p = (Player) cs;
            world = p.getWorld();
        } else {
            world = Bukkit.getWorld(worldName);
            if (world == null) {
                cs.sendMessage("The world " + worldName + " does not exist.");
                return true;
            }
        }

        // create the location and call artist
        Location location = new Location(world, Double.parseDouble(x), Double.parseDouble(y), Double.parseDouble(z));
        plugin.getArtist().draw(location, fileName + ".png");

        return true;
    }
}
