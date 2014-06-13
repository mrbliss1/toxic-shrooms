package badmushroom;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MushroomListener implements Listener {
	  private Main mm;
	  private final Logger log = Logger.getLogger("MushroomPicker");
	  
	  public MushroomListener(Main instance)
	  {
	    this.mm = instance;
	  }
	  
	  @EventHandler
	  public void onBlockBreak(BlockBreakEvent event)
	  {
	    Material mat = event.getBlock().getType();
	    Player player = event.getPlayer();
	    if ((mat == Material.RED_MUSHROOM) || (mat == Material.BROWN_MUSHROOM))
	    {
	      int randomInt = (int)(Math.random() * 100.0D);
	      if (randomInt <= 3)
	      {
	        this.log.info(player.getName() + "EVENT STARTED");
	        int randomSpeed = (int)(Math.random() * 50.0D);
	        int randomJump = (int)(Math.random() * 10.0D);
	        int randomConfusion = (int)(Math.random() * 50.0D);
	        int randomBlindness = (int)(Math.random() * 50.0D);
	        player.sendMessage(ChatColor.AQUA + player.getDisplayName() + ChatColor.RED + "You feel bad. A mushroom must have had a bad effect!");
	        player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 1000, randomConfusion));
	        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000, randomSpeed));
	        player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000, randomJump));
	        if (randomInt == 3) {
	          player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1000, randomBlindness));
	        }
	      }
	    }
	  }
	}
