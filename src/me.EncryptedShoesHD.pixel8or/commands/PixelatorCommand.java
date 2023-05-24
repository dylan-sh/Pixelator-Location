package me.EncryptedShoesHD.pixel8or.commands;

import me.EncryptedShoesHD.pixel8or.Pixel8or;
import org.bukkit.Location;
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
        if(cs instanceof Player) {
            Player p = (Player) cs;
            String fileName = args[0];
            String x = args[1];
            String y = args[2];
            String z = args[3];
            Location location = new Location(p.getLocation().getWorld(), Double.parseDouble(x), Double.parseDouble(y), Double.parseDouble(z));
            plugin.getArtist().draw(location, fileName + ".png");
        }
        return false;
    }
}
