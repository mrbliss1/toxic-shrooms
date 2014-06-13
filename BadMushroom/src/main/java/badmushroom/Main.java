package badmushroom;
import java.util.HashMap;
import java.util.logging.Logger;


import org.bukkit.Server;
import org.bukkit.command.PluginCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class Main   extends JavaPlugin
implements Listener
{
	  public void onEnable()
	  {
	    getServer().getPluginManager().registerEvents(new MushroomListener(this), this);
	  }
	}


